package com.example.pc02.myapplication.GAME;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pc02.myapplication.DatabaseHelper;
import com.example.pc02.myapplication.List_GameActivity;
import com.example.pc02.myapplication.R;

import java.util.List;

public class GameDay_Activity extends AppCompatActivity implements View.OnClickListener{

    private QuestionBank mquestionBank = new QuestionBank();

    List<Question> quesList;
    int score=0;
    int qid=0;
    TextView mScoreView,mQuizLength;
    ImageView imvQuestion;
    Button btn1,btn2,btn3,btn4;
    MediaPlayer mediaPlayer;

    private String mAnswer;  // correct answer for question in mQuestionView
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; // current question number


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_day);

        DatabaseHelper db= new DatabaseHelper(this);
        quesList = db.getAllQuestions05();
        getSupportActionBar().hide();

        ImageView back = findViewById(R.id.btBack);
        ImageView home = findViewById(R.id.btHome);

        mScoreView = (TextView)findViewById(R.id.tvshowScore);
        mQuizLength = (TextView)findViewById(R.id.tvQuizLength);
        imvQuestion = findViewById(R.id.imvQuiz);
        btn1 = (Button) findViewById(R.id.btnAns1);
        btn2 = (Button) findViewById(R.id.btnAns2);
        btn3 = (Button) findViewById(R.id.btnAns3);
        btn4 = (Button) findViewById(R.id.btnAns4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        mquestionBank.initQuestions05(getApplicationContext());
        setQuestionView();
        updateScore(mScore);

        //new
        onClickQuiz_Pic();
        //new

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void setQuestionView() {

        if (mQuestionNumber < mquestionBank.getLength()) {

            String paths = mquestionBank.getQuestion(mQuestionNumber);
            Resources res = getResources();
            String mDrawableName = paths;
            int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
            Drawable drawable = res.getDrawable(resID );

            imvQuestion.setImageDrawable(drawable);
            String sound_paths = mquestionBank.getSound(mQuestionNumber);
            //NEW
            imvQuestion.setTag(sound_paths);
            //NEW

            mAnswer = mquestionBank.getCorrectAnswer(mQuestionNumber);
            btn1.setText(mquestionBank.getChoice(mQuestionNumber,1));
            btn2.setText(mquestionBank.getChoice(mQuestionNumber,2));
            btn3.setText(mquestionBank.getChoice(mQuestionNumber, 3));
            btn4.setText(mquestionBank.getChoice(mQuestionNumber,4));
            mQuestionNumber++;
        } else {
            Toast.makeText(GameDay_Activity.this, "ถึงข้อสุดท้ายแล้วนะ!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(GameDay_Activity.this, HighestScore_Abc_Activity.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
            finish();
        }
    }

    private void updateScore(int point) {
        mScoreView.setText(""+mScore);
        //mQuizLength.setText(""+mScore+"/"+mquestionBank.getLength());
    }

    @Override
    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText().equals(mAnswer)){
            mScore = mScore + 1;
            Toast.makeText(GameDay_Activity.this, "เก่งมากจ้า!", Toast.LENGTH_SHORT).show();
            // show current total score for the user
            updateScore(mScore);
            // once user answer the question, we move on to the next one, if any
            setQuestionView();
        }else{
            Toast.makeText(GameDay_Activity.this, "ลองใหม่อีกทีนะ!", Toast.LENGTH_SHORT).show();
            //mScore = mScore + 1;
            updateScore(mScore);
            setQuestionView();
        }
    }

    private void onClickQuiz_Pic() {
        imvQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sound_path = view.findViewById(R.id.imvQuiz).getTag().toString();

                Resources res = imvQuestion.getResources();
                int soundQuiz = res.getIdentifier(sound_path,"raw",getPackageName());
                mediaPlayer = MediaPlayer.create(view.getContext(), soundQuiz);

                mediaPlayer.start();
            }
        });
    }
}

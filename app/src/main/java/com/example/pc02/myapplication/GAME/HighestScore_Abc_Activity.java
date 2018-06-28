package com.example.pc02.myapplication.GAME;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pc02.myapplication.List_GameActivity;
import com.example.pc02.myapplication.R;

public class HighestScore_Abc_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score__abc);


        getSupportActionBar().hide();

        TextView txtScore = (TextView) findViewById(R.id.tvshowScore);
        TextView txtHighScore = (TextView) findViewById(R.id.tvshowHighScore);

        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("Your score: " + score);

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore >= score)
            txtHighScore.setText("High score: "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }

        Button newQuiz = findViewById(R.id.btnRepeatQuiz);
        newQuiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(HighestScore_Abc_Activity.this, List_GameActivity.class);
        startActivity(intent);
        finish();
    }
}

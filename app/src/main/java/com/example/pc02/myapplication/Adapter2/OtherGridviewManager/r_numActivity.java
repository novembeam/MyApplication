package com.example.pc02.myapplication.Adapter2.OtherGridviewManager;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.pc02.myapplication.Adapter2.OtherAdapter.rnumAdapter;
import com.example.pc02.myapplication.MainActivity;
import com.example.pc02.myapplication.R;

public class r_numActivity extends Activity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    ImageView back,home;


    int pictures[] = {R.drawable.r401, R.drawable.r402, R.drawable.r403,
            R.drawable.r404, R.drawable.r405, R.drawable.r406,
            R.drawable.r407, R.drawable.r408, R.drawable.r409,
            R.drawable.r410, R.drawable.r411, R.drawable.r412};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_num);

        gridView = findViewById(R.id.gridviewsara);

        rnumAdapter adapter = new rnumAdapter(r_numActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s400);
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s401);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s402);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s403);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s404);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s405);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s406);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s407);
                        mediaPlayer.start();
                        break;
                    case 8:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s408);
                        mediaPlayer.start();
                        break;
                    case 9:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s409);
                        mediaPlayer.start();
                        break;
                    case 10:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this, R.raw.s410);
                        mediaPlayer.start();
                        break;
                    case 11:
                        mediaPlayer = MediaPlayer.create(r_numActivity.this,R.raw.sgood);
                        mediaPlayer.start();
                        break;

                }
            }
        });

        back = findViewById(R.id.btBack);
        home = findViewById(R.id.btHome);

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
                Intent home = new Intent(r_numActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}

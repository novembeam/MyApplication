package com.example.pc02.myapplication.Adapter2.OtherGridviewManager;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.pc02.myapplication.Adapter2.OtherAdapter.rdayAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rpayunchanaAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rsaraAdapter;
import com.example.pc02.myapplication.MainActivity;
import com.example.pc02.myapplication.R;

public class r_dayActivity extends Activity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    ImageView back,home;


    int pictures[] = {R.drawable.r501, R.drawable.r502, R.drawable.r503,
            R.drawable.r504, R.drawable.r505, R.drawable.r506,
            R.drawable.r507, R.drawable.r508};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_day);

        gridView = findViewById(R.id.gridviewday);

        rdayAdapter adapter = new rdayAdapter(r_dayActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.s501);
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.s502);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.s503);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.s504);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.s505);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.s506);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.s507);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer = MediaPlayer.create(r_dayActivity.this, R.raw.sgood);
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
                Intent home = new Intent(r_dayActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}

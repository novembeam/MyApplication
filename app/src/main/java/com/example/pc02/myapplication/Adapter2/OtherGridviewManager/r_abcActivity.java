package com.example.pc02.myapplication.Adapter2.OtherGridviewManager;

import android.app.ActionBar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;


import com.example.pc02.myapplication.Adapter2.OtherAdapter.rabcAdapter;
import com.example.pc02.myapplication.MainActivity;
import com.example.pc02.myapplication.R;

public class r_abcActivity extends AppCompatActivity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    ImageView back,home;

    int pictures[] = {R.drawable.r301, R.drawable.r302, R.drawable.r303,
            R.drawable.r304, R.drawable.r305, R.drawable.r306,
            R.drawable.r307, R.drawable.r308, R.drawable.r309,
            R.drawable.r310, R.drawable.r311, R.drawable.r312,
            R.drawable.r313, R.drawable.r314, R.drawable.r315,
            R.drawable.r316, R.drawable.r317, R.drawable.r318,
            R.drawable.r319, R.drawable.r320, R.drawable.r321,
            R.drawable.r322, R.drawable.r323, R.drawable.r324,
            R.drawable.r325, R.drawable.r326, R.drawable.r327};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_abc);

        getSupportActionBar().hide();

        gridView = findViewById(R.id.gridviewsara);

        rabcAdapter adapter = new rabcAdapter(r_abcActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s301);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s302);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s303);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s304);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s305);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s306);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s307);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s308);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 8:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s309);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 9:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s310);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 10:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s311);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 11:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s312);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 12:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s313);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 13:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s314);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 14:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s315);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 15:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s316);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 16:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s317);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 17:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s318);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 18:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s319);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 19:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s320);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 20:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s321);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 21:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s322);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 22:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s323);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 23:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s324);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 24:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s325);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 25:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this, R.raw.s326);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                    case 26:
                        mediaPlayer = MediaPlayer.create(r_abcActivity.this,R.raw.sgood);
                        gridView.setEnabled(false);
                        mediaPlayer.start();
                        break;
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        gridView.setEnabled(true);
                    }
                });
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
                Intent home = new Intent(r_abcActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}
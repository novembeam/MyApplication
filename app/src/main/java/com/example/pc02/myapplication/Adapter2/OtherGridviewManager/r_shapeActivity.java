package com.example.pc02.myapplication.Adapter2.OtherGridviewManager;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.pc02.myapplication.Adapter2.OtherAdapter.rcolAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rpayunchanaAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rsaraAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rshapeAdapter;
import com.example.pc02.myapplication.MainActivity;
import com.example.pc02.myapplication.R;

public class r_shapeActivity extends Activity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    ImageView back,home;


    int pictures[] = {R.drawable.r801, R.drawable.r802, R.drawable.r803,
            R.drawable.r804, R.drawable.r805, R.drawable.r806,
            R.drawable.r807, R.drawable.r808, R.drawable.r809,
            R.drawable.r810, R.drawable.r811, R.drawable.r812,
            R.drawable.r813, R.drawable.r814, R.drawable.r815,
            R.drawable.r816};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_shape);

        gridView = findViewById(R.id.gridviewshape);

        rshapeAdapter adapter = new rshapeAdapter(r_shapeActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s801);
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s802);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s803);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s804);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s805);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s806);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s807);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s808);
                        mediaPlayer.start();
                        break;
                    case 8:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s809);
                        mediaPlayer.start();
                        break;
                    case 9:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s810);
                        mediaPlayer.start();
                        break;
                    case 10:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s811);
                        mediaPlayer.start();
                        break;
                    case 11:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s812);
                        mediaPlayer.start();
                        break;
                    case 12:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s813);
                        mediaPlayer.start();
                        break;
                    case 13:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s814);
                        mediaPlayer.start();
                        break;
                    case 14:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s815);
                        mediaPlayer.start();
                        break;
                    case 15:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this, R.raw.s816);
                        mediaPlayer.start();
                        break;
                    case 16:
                        mediaPlayer = MediaPlayer.create(r_shapeActivity.this,R.raw.sgood);
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
                Intent home = new Intent(r_shapeActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}

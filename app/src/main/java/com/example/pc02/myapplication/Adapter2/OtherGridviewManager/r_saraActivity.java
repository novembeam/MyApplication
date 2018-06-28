package com.example.pc02.myapplication.Adapter2.OtherGridviewManager;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.pc02.myapplication.Adapter2.OtherAdapter.rpayunchanaAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rsaraAdapter;
import com.example.pc02.myapplication.MainActivity;
import com.example.pc02.myapplication.R;

public class r_saraActivity extends Activity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    ImageView back,home;


    int pictures[] = {R.drawable.r201, R.drawable.r202, R.drawable.r203,
            R.drawable.r204, R.drawable.r205, R.drawable.r206,
            R.drawable.r207, R.drawable.r208, R.drawable.r209,
            R.drawable.r210, R.drawable.r211, R.drawable.r212,
            R.drawable.r213, R.drawable.r214, R.drawable.r215,
            R.drawable.r216, R.drawable.r217, R.drawable.r218,
            R.drawable.r219, R.drawable.r220, R.drawable.r221,
            R.drawable.r222, R.drawable.r223, R.drawable.r224,
            R.drawable.r225, R.drawable.r226, R.drawable.r227,
            R.drawable.r228, R.drawable.r229, R.drawable.r230,
            R.drawable.r231, R.drawable.r232};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_sara);

        gridView = findViewById(R.id.gridviewsara);

        rsaraAdapter adapter = new rsaraAdapter(r_saraActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                    switch (position) {
                        case 0:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s201);
                            mediaPlayer.start();
                            break;
                        case 1:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s202);
                            mediaPlayer.start();
                            break;
                        case 2:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s203);
                            mediaPlayer.start();
                            break;
                        case 3:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s204);
                            mediaPlayer.start();
                            break;
                        case 4:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s205);
                            mediaPlayer.start();
                            break;
                        case 5:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s206);
                            mediaPlayer.start();
                            break;
                        case 6:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s207);
                            mediaPlayer.start();
                            break;
                        case 7:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s208);
                            mediaPlayer.start();
                            break;
                        case 8:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s209);
                            mediaPlayer.start();
                            break;
                        case 9:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s210);
                            mediaPlayer.start();
                            break;
                        case 10:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s211);
                            mediaPlayer.start();
                            break;
                        case 11:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s212);
                            mediaPlayer.start();
                            break;
                        case 12:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s213);
                            mediaPlayer.start();
                            break;
                        case 13:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s214);
                            mediaPlayer.start();
                            break;
                        case 14:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s215);
                            mediaPlayer.start();
                            break;
                        case 15:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s216);
                            mediaPlayer.start();
                            break;
                        case 16:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s217);
                            mediaPlayer.start();
                            break;
                        case 17:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s218);
                            mediaPlayer.start();
                            break;
                        case 18:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s219);
                            mediaPlayer.start();
                            break;
                        case 19:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s220);
                            mediaPlayer.start();
                            break;
                        case 20:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s221);
                            mediaPlayer.start();
                            break;
                        case 21:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s222);
                            mediaPlayer.start();
                            break;
                        case 22:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s223);
                            mediaPlayer.start();
                            break;
                        case 23:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s224);
                            mediaPlayer.start();
                            break;
                        case 24:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s225);
                            mediaPlayer.start();
                            break;
                        case 25:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s226);
                            mediaPlayer.start();
                            break;
                        case 26:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s227);
                            mediaPlayer.start();
                            break;
                        case 27:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s228);
                            mediaPlayer.start();
                            break;
                        case 28:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s229);
                            mediaPlayer.start();
                            break;
                        case 29:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s230);
                            mediaPlayer.start();
                            break;
                        case 30:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s231);
                            mediaPlayer.start();
                            break;
                        case 31:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this, R.raw.s232);
                            mediaPlayer.start();
                            break;
                        case 44:
                            mediaPlayer = MediaPlayer.create(r_saraActivity.this,R.raw.sgood);
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
                Intent home = new Intent(r_saraActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}

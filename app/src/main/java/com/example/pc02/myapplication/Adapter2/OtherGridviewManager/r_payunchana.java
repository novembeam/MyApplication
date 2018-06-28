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
import com.example.pc02.myapplication.MainActivity;
import com.example.pc02.myapplication.R;

public class r_payunchana extends Activity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    ImageView back,home;


    int pictures[] = {R.drawable.r101, R.drawable.r102, R.drawable.r103,
            R.drawable.r104, R.drawable.r105, R.drawable.r106,
            R.drawable.r107, R.drawable.r108, R.drawable.r109,
            R.drawable.r110, R.drawable.r111, R.drawable.r112,
            R.drawable.r113, R.drawable.r114, R.drawable.r115,
            R.drawable.r116, R.drawable.r117, R.drawable.r118,
            R.drawable.r119, R.drawable.r120, R.drawable.r121,
            R.drawable.r122, R.drawable.r123, R.drawable.r124,
            R.drawable.r125, R.drawable.r126, R.drawable.r127,
            R.drawable.r128, R.drawable.r129, R.drawable.r130,
            R.drawable.r131, R.drawable.r132, R.drawable.r133,
            R.drawable.r134, R.drawable.r135, R.drawable.r136,
            R.drawable.r137, R.drawable.r138, R.drawable.r139,
            R.drawable.r140, R.drawable.r141, R.drawable.r142,
            R.drawable.r143, R.drawable.r144, R.drawable.r145};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_payunchana);

        gridView = findViewById(R.id.gridviewpayunchana);

        rpayunchanaAdapter adapter = new rpayunchanaAdapter(r_payunchana.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s101);
                        mediaPlayer.start();
                        break;
                    case 1:
                            mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s102);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s103);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s104);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s105);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s106);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s107);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s108);
                        mediaPlayer.start();
                        break;
                    case 8:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s109);
                        mediaPlayer.start();
                        break;
                    case 9:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s110);
                        mediaPlayer.start();
                        break;
                    case 10:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s111);
                        mediaPlayer.start();
                        break;
                    case 11:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s112);
                        mediaPlayer.start();
                        break;
                    case 12:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s113);
                        mediaPlayer.start();
                        break;
                    case 13:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s114);
                        mediaPlayer.start();
                        break;
                    case 14:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s115);
                        mediaPlayer.start();
                        break;
                    case 15:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s116);
                        mediaPlayer.start();
                        break;
                    case 16:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s117);
                        mediaPlayer.start();
                        break;
                    case 17:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s118);
                        mediaPlayer.start();
                        break;
                    case 18:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s119);
                        mediaPlayer.start();
                        break;
                    case 19:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s120);
                        mediaPlayer.start();
                        break;
                    case 20:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s121);
                        mediaPlayer.start();
                        break;
                    case 21:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s122);
                        mediaPlayer.start();
                        break;
                    case 22:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s123);
                        mediaPlayer.start();
                        break;
                    case 23:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s124);
                        mediaPlayer.start();
                        break;
                    case 24:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s125);
                        mediaPlayer.start();
                        break;
                    case 25:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s126);
                        mediaPlayer.start();
                        break;
                    case 26:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s127);
                        mediaPlayer.start();
                        break;
                    case 27:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s128);
                        mediaPlayer.start();
                        break;
                    case 28:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s129);
                        mediaPlayer.start();
                        break;
                    case 29:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s130);
                        mediaPlayer.start();
                        break;
                    case 30:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s131);
                        mediaPlayer.start();
                        break;
                    case 31:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s132);
                        mediaPlayer.start();
                        break;
                    case 32:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s133);
                        mediaPlayer.start();
                        break;
                    case 33:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s134);
                        mediaPlayer.start();
                        break;
                    case 34:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s135);
                        mediaPlayer.start();
                        break;
                    case 35:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s136);
                        mediaPlayer.start();
                        break;
                    case 36:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s137);
                        mediaPlayer.start();
                        break;
                    case 37:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s138);
                        mediaPlayer.start();
                        break;
                    case 38:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s139);
                        mediaPlayer.start();
                        break;
                    case 39:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s140);
                        mediaPlayer.start();
                        break;
                    case 40:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s141);
                        mediaPlayer.start();
                        break;
                    case 41:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s142);
                        mediaPlayer.start();
                        break;
                    case 42:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s143);
                        mediaPlayer.start();
                        break;
                    case 43:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.s144);
                        mediaPlayer.start();
                        break;
                    case 44:
                        mediaPlayer = MediaPlayer.create(r_payunchana.this,R.raw.sgood);
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
                Intent home = new Intent(r_payunchana.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}

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
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rmonthAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rpayunchanaAdapter;
import com.example.pc02.myapplication.Adapter2.OtherAdapter.rsaraAdapter;
import com.example.pc02.myapplication.MainActivity;
import com.example.pc02.myapplication.R;

public class r_monthActivity extends Activity {
    GridView gridView;
    MediaPlayer mediaPlayer;
    ImageView back,home;

    int pictures[] = {R.drawable.r600, R.drawable.r601, R.drawable.r602,
            R.drawable.r603, R.drawable.r604, R.drawable.r605,
            R.drawable.r606, R.drawable.r607, R.drawable.r608,
            R.drawable.r609, R.drawable.r610, R.drawable.r611,
            R.drawable.r612, R.drawable.r613};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_month);

        gridView = findViewById(R.id.gridviewmonth);

        rmonthAdapter adapter = new rmonthAdapter(r_monthActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s500);
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s601);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s602);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s603);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s604);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s605);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s606);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s607);
                        mediaPlayer.start();
                        break;
                    case 8:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s608);
                        mediaPlayer.start();
                        break;
                    case 9:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s609);
                        mediaPlayer.start();
                        break;
                    case 10:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s610);
                        mediaPlayer.start();
                        break;
                    case 11:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s611);
                        mediaPlayer.start();
                        break;
                        case 12:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this, R.raw.s612);
                        mediaPlayer.start();
                        break;
                    case 13:
                        mediaPlayer = MediaPlayer.create(r_monthActivity.this,R.raw.sgood);
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
                Intent home = new Intent(r_monthActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}

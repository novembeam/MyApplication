package com.example.pc02.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pc02.myapplication.Adapter.ListGameAdapter;
import com.example.pc02.myapplication.GAME.GameAbc_Activity;
import com.example.pc02.myapplication.GAME.GameColor_Activity;
import com.example.pc02.myapplication.GAME.GameDay_Activity;
import com.example.pc02.myapplication.GAME.GameMonth_Activity;
import com.example.pc02.myapplication.GAME.GameNum_Activity;
import com.example.pc02.myapplication.GAME.GamePayunchana_Activity;
import com.example.pc02.myapplication.GAME.GameSara_Activity;
import com.example.pc02.myapplication.GAME.GameShape_Activity;


public class List_GameActivity extends Activity {

    ImageView back;
    GridView gridView;

    int pictures[] = {R.drawable.listgame1, R.drawable.listgame2, R.drawable.listgame3,
            R.drawable.listgame4, R.drawable.listgame5, R.drawable.listgame6,
            R.drawable.listgame7, R.drawable.listgame8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__game);


        gridView = findViewById(R.id.gridview1);

        ListGameAdapter adapter = new ListGameAdapter(List_GameActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(List_GameActivity.this, GamePayunchana_Activity.class);
                        break;
                    case 1: intent = new Intent(List_GameActivity.this, GameSara_Activity.class);break;
                    case 2: intent = new Intent(List_GameActivity.this, GameAbc_Activity.class);break;
                    case 3: intent = new Intent(List_GameActivity.this, GameNum_Activity.class);break;
                    case 4: intent = new Intent(List_GameActivity.this, GameDay_Activity.class);break;
                    case 5: intent = new Intent(List_GameActivity.this, GameMonth_Activity.class);break;
                    case 6: intent = new Intent(List_GameActivity.this, GameColor_Activity.class);break;
                    case 7: intent = new Intent(List_GameActivity.this, GameShape_Activity.class);break;
                }
                startActivity(intent);
            }
        });

        onbackPressed();
    }

    private void onbackPressed() {
        back =findViewById(R.id.btBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}

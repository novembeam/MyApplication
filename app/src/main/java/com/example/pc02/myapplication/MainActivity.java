package com.example.pc02.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    private static ImageView ClickImageButtonRead;
    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        ClickImageButtonRead = (ImageView)findViewById(R.id.rtt1);
        ClickImageButtonRead.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent GoToNewActivity = new Intent(MainActivity.this,List_ReadActivity.class);
                startActivity(GoToNewActivity);
            }
        });

        ClickImageButtonRead = (ImageView)findViewById(R.id.gtt1);
        ClickImageButtonRead.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent GoToNewActivity = new Intent(MainActivity.this,List_GameActivity.class);
                startActivity(GoToNewActivity);
            }
        });

        ClickImageButtonRead = (ImageView)findViewById(R.id.vtt1);
        ClickImageButtonRead.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent GoToNewActivity = new Intent(MainActivity.this,List_VideoActivity.class);
                startActivity(GoToNewActivity);
            }
        });
        loadDatabase();
    }

    private void loadDatabase() {
        mydb = new DatabaseHelper(MainActivity.this);

        try {
            mydb.checkAndCopyDatabase();
            mydb.openDatabase();
        }catch (SQLiteException e){
            e.printStackTrace();
        }
    }
}

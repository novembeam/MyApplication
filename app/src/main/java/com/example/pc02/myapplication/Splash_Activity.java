package com.example.pc02.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Splash_Activity extends AppCompatActivity {

    private Handler objhandler;
    private Runnable objrunnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        objhandler = new Handler();

        objrunnable = new Runnable() {
            @Override
            public void run() {
                Intent intentToMain = new Intent(Splash_Activity.this, MainActivity.class);
                startActivity(intentToMain);
                finish();
            }
        };
    }

    protected void onResume() {
        super.onResume();
        objhandler.postDelayed(objrunnable, 1500);
    }

    public void onStop() {
        super.onStop();
        objhandler.removeCallbacks(objrunnable);
    }
}

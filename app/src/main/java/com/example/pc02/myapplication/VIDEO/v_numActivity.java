package com.example.pc02.myapplication.VIDEO;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.pc02.myapplication.R;

public class v_numActivity extends AppCompatActivity {

    private VideoView vdoView;
    private MediaController videoController;
    private Uri videoLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_num);
        getSupportActionBar().hide();

        vdoView = (VideoView)findViewById(R.id.videoView);

        videoLocation = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.num_video);
        videoController = new MediaController(this);
        setupMedia();
    }

    private void setupMedia() {
        vdoView.setMediaController(videoController);
        vdoView.setVideoURI(videoLocation);
        vdoView.start();
    }

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }
}

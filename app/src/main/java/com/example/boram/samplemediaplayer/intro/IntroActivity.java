package com.example.boram.samplemediaplayer.intro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.example.boram.samplemediaplayer.Main.MainActivity;
import com.example.boram.samplemediaplayer.R;

public class IntroActivity extends Activity {

    public Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_intro);

        handler = new Handler();
        handler.postDelayed(runnable,3000);



    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

        }
    };


    @Override
    protected void onStop() {
        super.onStop();
        handler.removeCallbacks(runnable);
    }
}



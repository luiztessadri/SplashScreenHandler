package com.tessadri.yogi.splashscreenhandler;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    private static final int SPLASH_TIMEOUT = 3000; //3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(splashIntent);

                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}

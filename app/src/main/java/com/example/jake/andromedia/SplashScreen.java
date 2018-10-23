package com.example.jake.andromedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Change colour of the progress bar to orange
        ProgressBar v = (ProgressBar) findViewById(R.id.ProgressBar);
        v.getIndeterminateDrawable().setColorFilter(0XFFE8641B,
                android.graphics.PorterDuff.Mode.MULTIPLY);

        Thread mySplash = new Thread(){

            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        mySplash.start();
    }
}

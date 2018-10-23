package com.example.jake.andromedia;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // findViewById(R.id.loadingPanel).setVisibility(View.GONE);

        /*
        // If the Android version is lower than Jellybean, use this call to hide
        // the status bar.
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getActionBar();
        actionBar.hide();

        // This example uses decor view, but you can use any visible view.
        //View decorView = getWindow().getDecorView();
        //int uiOptions = View.SYSTEM_UI_FLAG_LOW_PROFILE;
        //decorView.setSystemUiVisibility(uiOptions);
        */

        //Get reference to help image as button "?" icon
        ImageButton help = (ImageButton) findViewById(R.id.Help);

        //Set listner on image for touchs/clicks
        help.setOnClickListener(new View.OnClickListener() {
            @Override

            //Once clicked open a new activity known as Pop.
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pop.class));
            }
        });
    }

    /*-- Intent to change from menu to settings screen --*/
    public void settingsClick(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    /*-- Intent to change from menu to topics screen --*/
    public void topicsClick(View view) {
        Intent intent = new Intent(this, Topics.class);
        startActivity(intent);
    }

    /*-- Intent to change from menu to quiz screen --*/
    public void quizClick(View view) {
        Intent intent = new Intent(this, Quiz_Topics.class);
        startActivity(intent);
    }

    /*-- Intent to change from menu to timeline screen --*/
    public void timelineClick(View view) {
        Intent intent = new Intent(this, Timeline.class);
        startActivity(intent);
    }
}


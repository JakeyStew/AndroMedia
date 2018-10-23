package com.example.jake.andromedia;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.icu.util.ULocale;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Timeline extends AppCompatActivity {

    private SoundPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        sound = new SoundPlayer(this);

        TextView tx = (TextView)findViewById(R.id.under);
        TextView tx2 = (TextView)findViewById(R.id.scoreLabel);
        TextView tx3 = (TextView)findViewById(R.id.highScoreLabel);
        TextView tx4 = (TextView)findViewById(R.id.scoreLabel2);
        TextView tx5 = (TextView)findViewById(R.id.highScoreLabel2);
        TextView tx6 = (TextView)findViewById(R.id.scoreLabel3);
        TextView tx7 = (TextView)findViewById(R.id.highScoreLabel3);
        TextView tx8 = (TextView)findViewById(R.id.scoreLabel4);
        TextView tx9 = (TextView)findViewById(R.id.highScoreLabel4);
        TextView tx10 = (TextView)findViewById(R.id.scoreLabel5);
        TextView tx11 = (TextView)findViewById(R.id.highScoreLabel5);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/ARMY RUST.ttf");
        Typeface custom_font2 = Typeface.createFromAsset(getAssets(),  "fonts/chalkmars_regular_sample.ttf");

        tx.setTypeface(custom_font);
        tx2.setTypeface(custom_font2);
        tx3.setTypeface(custom_font2);
        tx4.setTypeface(custom_font2);
        tx5.setTypeface(custom_font2);
        tx6.setTypeface(custom_font2);
        tx7.setTypeface(custom_font2);
        tx8.setTypeface(custom_font2);
        tx9.setTypeface(custom_font2);
        tx10.setTypeface(custom_font2);
        tx11.setTypeface(custom_font2);

        /*****************************Update HighScore 1**********************************/
            TextView scoreLabel = (TextView) findViewById(R.id.scoreLabel);
            TextView highScoreLabel = (TextView) findViewById(R.id.highScoreLabel);

            int mCurrentScore = getIntent().getIntExtra("SCORE", 0);
        if(mCurrentScore >= 0) {
            scoreLabel.setText(mCurrentScore + " Point/s this attempt.");

            SharedPreferences settings = getSharedPreferences("HIGH_SCORE", Context.MODE_PRIVATE);
            int mHighScore = settings.getInt("HIGH_SCORE", 0);

            if (mCurrentScore > mHighScore) {
                highScoreLabel.setText("High Score for Topic 1: " + mCurrentScore);

                // Update High Score
                SharedPreferences.Editor editor = settings.edit();
                editor.putInt("HIGH_SCORE", mCurrentScore);
                editor.commit();

            } else {
                highScoreLabel.setText("High Score for Topic 1: " + mHighScore);

            }
        }
        /*****************************Update HighScore 1**********************************/

        /*****************************Update HighScore 2**********************************/
        TextView scoreLabel2 = (TextView) findViewById(R.id.scoreLabel2);
        TextView highScoreLabel2 = (TextView) findViewById(R.id.highScoreLabel2);

        int mCurrentScore2 = getIntent().getIntExtra("SCORE2", 0);
        if(mCurrentScore2 >= 0) {
            scoreLabel2.setText(mCurrentScore2 + " Point/s this attempt.");

            SharedPreferences settings2 = getSharedPreferences("HIGH_SCORE2", Context.MODE_PRIVATE);
            int mHighScore2 = settings2.getInt("HIGH_SCORE2", 0);

            if (mCurrentScore2 > mHighScore2) {
                highScoreLabel2.setText("HHigh Score for Topic 2: " + mCurrentScore2);

                // Update High Score
                SharedPreferences.Editor editor = settings2.edit();
                editor.putInt("HIGH_SCORE2", mCurrentScore2);
                editor.commit();

            } else {
                highScoreLabel2.setText("High Score for Topic 2: " + mHighScore2);

            }
        }
        /*****************************Update HighScore 2**********************************/

        /*****************************Update HighScore 3**********************************/
        TextView scoreLabel3 = (TextView) findViewById(R.id.scoreLabel3);
        TextView highScoreLabel3 = (TextView) findViewById(R.id.highScoreLabel3);

        int mCurrentScore3 = getIntent().getIntExtra("SCORE3", 0);
        if(mCurrentScore3 >= 0) {
            scoreLabel3.setText(mCurrentScore3 + " Point/s this attempt.");

            SharedPreferences settings3 = getSharedPreferences("HIGH_SCORE3", Context.MODE_PRIVATE);
            int mHighScore3 = settings3.getInt("HIGH_SCORE3", 0);

            if (mCurrentScore3 > mHighScore3) {
                highScoreLabel3.setText("High Score for Topic 3: " + mCurrentScore3);

                // Update High Score
                SharedPreferences.Editor editor = settings3.edit();
                editor.putInt("HIGH_SCORE3", mCurrentScore3);
                editor.commit();

            } else {
                highScoreLabel3.setText("High Score for Topic 3: " + mHighScore3);

            }
        }
        /*****************************Update HighScore 3**********************************/

        /*****************************Update HighScore 4**********************************/
        TextView scoreLabel4 = (TextView) findViewById(R.id.scoreLabel4);
        TextView highScoreLabel4 = (TextView) findViewById(R.id.highScoreLabel4);

        int mCurrentScore4 = getIntent().getIntExtra("SCORE4", 0);
        if(mCurrentScore4 >= 0) {
            scoreLabel4.setText(mCurrentScore4 + " Point/s this attempt.");

            SharedPreferences settings4 = getSharedPreferences("HIGH_SCORE4", Context.MODE_PRIVATE);
            int mHighScore4 = settings4.getInt("HIGH_SCORE4", 0);

            if (mCurrentScore4 > mHighScore4) {
                highScoreLabel4.setText("High Score for Topic 4: " + mCurrentScore4);

                // Update High Score
                SharedPreferences.Editor editor = settings4.edit();
                editor.putInt("HIGH_SCORE4", mCurrentScore4);
                editor.commit();

            } else {
                highScoreLabel4.setText("High Score for Topic 4: " + mHighScore4);

            }
        }
        /*****************************Update HighScore 4**********************************/

        /*****************************Update HighScore 5**********************************/
        TextView scoreLabel5 = (TextView) findViewById(R.id.scoreLabel5);
        TextView highScoreLabel5 = (TextView) findViewById(R.id.highScoreLabel5);

        int mCurrentScore5 = getIntent().getIntExtra("SCORE5", 0);
        if(mCurrentScore5 >= 0) {
            scoreLabel5.setText(mCurrentScore5 + " Point/s this attempt.");

            SharedPreferences settings5 = getSharedPreferences("HIGH_SCORE5", Context.MODE_PRIVATE);
            int mHighScore5 = settings5.getInt("HIGH_SCORE5", 0);

            if (mCurrentScore5 > mHighScore5) {
                highScoreLabel5.setText("High Score for Topic 5: " + mCurrentScore5);

                // Update High Score
                SharedPreferences.Editor editor = settings5.edit();
                editor.putInt("HIGH_SCORE5", mCurrentScore5);
                editor.commit();

            } else {
                highScoreLabel5.setText("High Score for Topic 5: " + mHighScore5);

            }
        }
        /*****************************Update HighScore 5**********************************/
    };

    /*-- Intent to change from TImeline to the Menu screen --*/
    public void backClick(View view) {
        sound.playBackClick();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

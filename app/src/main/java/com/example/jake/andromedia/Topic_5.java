package com.example.jake.andromedia;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Topic_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_5);

        TextView tx = (TextView)findViewById(R.id.Scroll_Text);
        TextView tx2 = (TextView)findViewById(R.id.Scroll_Text2);
        TextView tx3 = (TextView)findViewById(R.id.Scroll_Text3);
        TextView tx4 = (TextView)findViewById(R.id.Scroll_Text4);
        TextView tx5 = (TextView)findViewById(R.id.Scroll_Text5);
        TextView tx6 = (TextView)findViewById(R.id.Scroll_Text6);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/chalkmars_regular_sample.ttf");

        tx.setTypeface(custom_font);
        tx2.setTypeface(custom_font);
        tx3.setTypeface(custom_font);
        tx4.setTypeface(custom_font);
        tx5.setTypeface(custom_font);
        tx6.setTypeface(custom_font);
    }

    /*-- Intent to change from Topic_5 to the Topicss screen --*/
    public void backClick(View view) {
        Intent intent = new Intent(this, Topics.class);
        startActivity(intent);
    }

    /*-- Intent to change from Topic_5 to menu screen --*/
    public void homeClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

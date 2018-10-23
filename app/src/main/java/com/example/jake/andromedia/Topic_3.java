package com.example.jake.andromedia;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Topic_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_3);

        TextView tx = (TextView)findViewById(R.id.Scroll_Text);
        TextView tx2 = (TextView)findViewById(R.id.Scroll_Text2);
        TextView tx3 = (TextView)findViewById(R.id.Scroll_Text2_1);
        TextView tx4 = (TextView)findViewById(R.id.Scroll_Text3);
        TextView tx5 = (TextView)findViewById(R.id.Scroll_Text3_1);
        TextView tx6 = (TextView)findViewById(R.id.Scroll_Text4);
        TextView tx7 = (TextView)findViewById(R.id.Scroll_Text5_1);
        TextView tx8 = (TextView)findViewById(R.id.Scroll_Text5);
        TextView txA = (TextView)findViewById(R.id.Scroll_Text_Title);
        TextView txB = (TextView)findViewById(R.id.Scroll_Text_Title2);
        TextView txC = (TextView)findViewById(R.id.Scroll_Text_Title3);
        TextView txD = (TextView)findViewById(R.id.Scroll_Text_Title4);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/chalkmars_regular_sample.ttf");

        tx.setTypeface(custom_font);
        tx2.setTypeface(custom_font);
        tx3.setTypeface(custom_font);
        tx4.setTypeface(custom_font);
        tx5.setTypeface(custom_font);
        tx6.setTypeface(custom_font);
        tx7.setTypeface(custom_font);
        tx8.setTypeface(custom_font);
        txA.setTypeface(custom_font);
        txB.setTypeface(custom_font);
        txC.setTypeface(custom_font);
        txD.setTypeface(custom_font);
    }

    /*-- Intent to change from Topic_3 to the Topicss screen --*/
    public void backClick(View view) {
        Intent intent = new Intent(this, Topics.class);
        startActivity(intent);
    }

    /*-- Intent to change from Topic_3 to menu screen --*/
    public void homeClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

package com.example.jake.andromedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
    }

    /*-- Intent to change from menu to settings screen --*/
    public void backClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // Intent to change from menu to topic 1 screen
    /******************************************************/
    public void topic1Click(View view) {
        Intent intent = new Intent(this, Topic_1.class);
        startActivity(intent);
    }

    public void topic2Click(View view) {
        Intent intent = new Intent(this, Topic_2.class);
        startActivity(intent);
    }

    public void topic3Click(View view) {
        Intent intent = new Intent(this, Topic_3.class);
        startActivity(intent);
    }

    public void topic4Click(View view) {
        Intent intent = new Intent(this, Topic_4.class);
        startActivity(intent);
    }

    public void topic5Click(View view) {
        Intent intent = new Intent(this, Topic_5.class);
        startActivity(intent);
    }

    public void quizClick(View view) {
        Intent intent = new Intent(this, Quiz_Topics.class);
        startActivity(intent);
    }
    /*****************************************************/

}

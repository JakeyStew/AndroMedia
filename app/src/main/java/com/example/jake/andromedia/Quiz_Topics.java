package com.example.jake.andromedia;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quiz_Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__topics);

        TextView tx = (TextView)findViewById(R.id.topic_one);
        TextView tx2 = (TextView)findViewById(R.id.topic_two);
        TextView tx3 = (TextView)findViewById(R.id.topic_three);
        TextView tx4 = (TextView)findViewById(R.id.topic_four);
        TextView tx5 = (TextView)findViewById(R.id.topic_five);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Right Chalk.ttf");

        tx.setTypeface(custom_font);
        tx2.setTypeface(custom_font);
        tx3.setTypeface(custom_font);
        tx4.setTypeface(custom_font);
        tx5.setTypeface(custom_font);
    }

    /*-- Intent to change from Quiz Topics to the Topics screen --*/
    public void backClick(View view) {
        Intent intent = new Intent(this, Topics.class);
        startActivity(intent);
    }

    /*-- Intent to change from Quiz Topics to the Quiz screen --*/
    public void topic1Click(View view) {
        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("TopicID", 1);
        startActivity(intent);
    }

    /*-- Intent to change from Quiz Topics to the Quiz screen --*/
    public void topic2Click(View view) {
        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("TopicID", 2);
        startActivity(intent);
    }

    /*-- Intent to change from Quiz Topics to the Quiz screen --*/
    public void topic3Click(View view) {
        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("TopicID", 3);
        startActivity(intent);
    }

    /*-- Intent to change from Quiz Topics to the Quiz screen --*/
    public void topic4Click(View view) {
        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("TopicID", 4);
        startActivity(intent);
    }

    /*-- Intent to change from Quiz Topics to the Quiz screen --*/
    public void topic5Click(View view) {
        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("TopicID", 5);
        startActivity(intent);
    }

    /*-- Intent to change from Quiz Topics to menu screen --*/
    public void homeClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

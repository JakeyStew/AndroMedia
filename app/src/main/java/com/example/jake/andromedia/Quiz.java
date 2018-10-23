package com.example.jake.andromedia;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;

import static java.lang.Thread.sleep;

public class Quiz extends AppCompatActivity {

    //Set up question library
    private QuizLibrary mQuizLibrary = new QuizLibrary();
    private RandomGen RandomNum = new RandomGen();

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private CharSequence mAnswer;
    private int mCurrentScore = 0;
    private int mCurrentScore2 = 0;
    private int mCurrentScore3= 0;
    private int mCurrentScore4 = 0;
    private int mCurrentScore5 = 0;

    private int lastasked = 0;
    private int mQuestionNumber = 0;
    private int Category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        int myTopic = getIntent().getIntExtra("TopicID", 1);
        Category = myTopic;

        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        //Set font style
        TextView tx = (TextView) findViewById(R.id.choice1);
        TextView tx2 = (TextView) findViewById(R.id.choice2);
        TextView tx3 = (TextView) findViewById(R.id.choice3);
        TextView tx4 = (TextView) findViewById(R.id.question);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/chalkmars_regular_sample.ttf");
        tx.setTypeface(custom_font);
        tx2.setTypeface(custom_font);
        tx3.setTypeface(custom_font);
        tx4.setTypeface(custom_font);

        /******************SAVE ATTEMPT 1********************************/
        /*
        TextView ScoreLabel = (TextView)findViewById(R.id.ScoreLabel);
        TextView HighScoreLabel = (TextView)findViewById(R.id.HighScoreLabel);

        mCurrentScore = getIntent().getIntExtra("SCORE", 0);
        ScoreLabel.setText(mCurrentScore + "");
        SharedPreferences settings = this.getSharedPreferences("GAME_DATA", Context.MODE_PRIVATE);
        mHighScore = settings.getInt("HIGH_SCORE", 0);

        /******************SAVE ATTEMPT 1********************************/
        /*
        if (mCurrentScore > mHighScore)
        {
            HighScoreLabel.setText("High Score: " + mCurrentScore);
            //Save
            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("HIGH_SCORE", mCurrentScore);
            editor.commit();
        } else {

            HighScoreLabel.setText("Highscore: " + mHighScore);
        }
        */
        /******************SAVE ATTEMPT 1********************************/

    };


    //Start of button activity for ButtonChoice1
    public void onClick1(View view) {

        if (mButtonChoice1.getText() == mAnswer) {
            mCurrentScore = mCurrentScore + 1;
            mCurrentScore2 = mCurrentScore + 1;
            mCurrentScore3 = mCurrentScore + 1;
            mCurrentScore4 = mCurrentScore + 1;
            mCurrentScore5 = mCurrentScore + 1;

            //Toast message for correct/incorrect
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        if (mQuestionNumber < 5) updateQuestion();
        else {
            Toast.makeText(this, "Test Complete!", Toast.LENGTH_SHORT).show();
            SaveData();
        }
        mQuestionNumber++;
    }
    //End of button activity for ButtonChoice1

    //Start of button activity for ButtonChoice2
    public void onClick2(View view) {

        if (mButtonChoice1.getText() == mAnswer) {
            mCurrentScore = mCurrentScore + 1;
            mCurrentScore2 = mCurrentScore + 1;
            mCurrentScore3 = mCurrentScore + 1;
            mCurrentScore4 = mCurrentScore + 1;
            mCurrentScore5 = mCurrentScore + 1;

            //Toast message for correct/incorrect
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        if (mQuestionNumber < 5) updateQuestion();
        else {
            Toast.makeText(this, "Test Complete!", Toast.LENGTH_SHORT).show();
            SaveData();
        }
        mQuestionNumber++;
    }
    //End of button activity for ButtonChoice2

    //Start of button activity for ButtonChoice3
    public void onClick3(View view) {

        if (mButtonChoice1.getText() == mAnswer) {
            mCurrentScore = mCurrentScore + 1;
            mCurrentScore2 = mCurrentScore + 1;
            mCurrentScore3 = mCurrentScore + 1;
            mCurrentScore4 = mCurrentScore + 1;
            mCurrentScore5 = mCurrentScore + 1;
            //Toast message for correct/incorrect
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        if (mQuestionNumber < 5) updateQuestion();
        else {
            Toast.makeText(this, "Test Complete!", Toast.LENGTH_SHORT).show();
            SaveData();
        }
        mQuestionNumber++;
    }
    //End of button activity for ButtonChoice3

    /********************************SAVE GAME DATA*****************************/
    private void SaveData(){
        Intent intentScore = new Intent(getApplicationContext(), Timeline.class);
        if(Category == 1){
            intentScore.putExtra("SCORE", mCurrentScore);
        } else {
            intentScore.putExtra("SCORE", -1);
        }
        if(Category == 2){
            intentScore.putExtra("SCORE2", mCurrentScore2);
        } else {
            intentScore.putExtra("SCORE2", -1);
        }
        if(Category == 3){
            intentScore.putExtra("SCORE3", mCurrentScore3);
        } else {
            intentScore.putExtra("SCORE3", -1);
        }
        if(Category == 4){
            intentScore.putExtra("SCORE4", mCurrentScore4);
        } else {
            intentScore.putExtra("SCORE4", -1);
        }
        if(Category == 5){
            intentScore.putExtra("SCORE5", mCurrentScore5);
        } else {
            intentScore.putExtra("SCORE5", -1);
        }
        startActivity(intentScore);
    }
    /********************************SAVE GAME DATA*****************************/


    private void updateQuestion(){

        int random = RandomNum.getRandom(10, 1);
        int tChoices = RandomNum.getRandom(3, 1);

            mQuestionView.setText(mQuizLibrary.getQuestion1(Category, random));
            CharSequence answer = mQuizLibrary.getAnswer1(Category, random);
            CharSequence choice1 = mQuizLibrary.getChoices1(Category, random);
            CharSequence choice2 = mQuizLibrary.getChoices2(Category, random);
            if (tChoices == 1) {

                mButtonChoice1.setText(answer);
                mButtonChoice2.setText(choice1);
                mButtonChoice3.setText(choice2);
            }

            if (tChoices == 2) {
                mButtonChoice1.setText(choice1);
                mButtonChoice2.setText(answer);
                mButtonChoice3.setText(choice2);
            }

            if (tChoices == 3) {
                mButtonChoice1.setText(choice1);
                mButtonChoice2.setText(choice2);
                mButtonChoice3.setText(answer);
            }
        mAnswer = answer;
        lastasked = random;
    }

    /*-- Intent to change from Quiz to the Quiz Topics screen --*/
    public void backClick(View view) {


        Intent intent = new Intent(this, Quiz_Topics.class);
        startActivity(intent);
    }
}

package com.example.ulkeler;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button answer1,answer2,answer3,answer4;
    TextView score,question;
    private questions mQuestions = new questions();
    private String myanswer;
    private int mscore=0;
    Random r;
    private int mQuestionsLenght = mQuestions.mQuestions.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Random();
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        score = findViewById(R.id.score);
        question = findViewById(R.id.question);
        score.setText("Score"+mscore);
        updatequestions(r.nextInt(mQuestionsLenght));
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText()==myanswer){
                    mscore++;
                    score.setText("Score"+mscore);
                    updatequestions(r.nextInt(mQuestionsLenght));
                }
                else{
                    gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText()==myanswer){
                    mscore++;
                    score.setText("Score"+mscore);
                    updatequestions(r.nextInt(mQuestionsLenght));
                }
                else{
                    gameOver();
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText()==myanswer){
                    mscore++;
                    score.setText("Score"+mscore);
                    updatequestions(r.nextInt(mQuestionsLenght));
                }
                else{
                    gameOver();
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText()==myanswer){
                    mscore++;
                    score.setText("Score"+mscore);
                    updatequestions(r.nextInt(mQuestionsLenght));
                }
                else{
                    gameOver();
                }

            }
        });
    }
    private void updatequestions(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoices1(num));
        answer2.setText(mQuestions.getChoices2(num));
        answer3.setText(mQuestions.getChoices3(num));
        answer4.setText(mQuestions.getChoices4(num));
        myanswer = mQuestions.getCorrectAnswer(num);
    }
    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is" + mscore + "points")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}

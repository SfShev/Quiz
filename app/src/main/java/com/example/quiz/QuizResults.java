package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {
    MediaPlayer mediaPlayerNext;
    MediaPlayer mediaPlayerBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        mediaPlayerNext = MediaPlayer.create(this, R.raw.sound_next);
        mediaPlayerBack = MediaPlayer.create(this, R.raw.sound_back);

        final AppCompatButton startNewQuiz = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnsw = findViewById(R.id.correctAnsw);
        final TextView incorrectAnsw = findViewById(R.id.incorrectAnsw);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnsw.setText(String.valueOf("Правильно: " + getCorrectAnswers));
        incorrectAnsw.setText(String.valueOf("Неправильно: " + getIncorrectAnswers));

        startNewQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerNext.start();
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        mediaPlayerBack.start();
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}
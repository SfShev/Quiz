package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayerNext,mediaPlayerFail,mediaPlayerOption,mediaPlayerBack,mediaPlayerTrue;

    private AdView mAdView;

    private String selectedTopic = "";

    private LinearLayout film;
    private LinearLayout mult;
    private LinearLayout anime;
    private LinearLayout serial;

    private LinearLayout film1;
    private LinearLayout mult1;
    private LinearLayout anime1;
    private LinearLayout serial1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mediaPlayerNext = MediaPlayer.create(this,R.raw.sound_next);
        mediaPlayerFail = MediaPlayer.create(this,R.raw.sound_fail);
        mediaPlayerOption = MediaPlayer.create(this, R.raw.sound_option);
        mediaPlayerBack = MediaPlayer.create(this,R.raw.sound_back);
        mediaPlayerTrue = MediaPlayer.create(this,R.raw.sound_true);


        film = findViewById(R.id.filmLayout);
        mult = findViewById(R.id.multLayout);
        anime = findViewById(R.id.animeLayout);
        serial = findViewById(R.id.serialLayout);

        film1 = findViewById(R.id.filmLayout1);
        mult1 = findViewById(R.id.multLayout1);
        anime1 = findViewById(R.id.animeLayout1);
        serial1 = findViewById(R.id.serialLayout1);

        final Button btnstart = findViewById(R.id.btnstart);

        film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               selectedTopic = "film";
               clearBorderQuiz();
               film.setBackgroundResource(R.drawable.round_back_white_stroke10);
               mediaPlayerOption.start();
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "mult";
                clearBorderQuiz();
                mult.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mediaPlayerOption.start();
            }
        });

        anime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "anime";
                clearBorderQuiz();
                anime.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mediaPlayerOption.start();
            }
        });

        serial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "serial";
                clearBorderQuiz();
                serial.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mediaPlayerOption.start();
            }
        });


        film1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "film";
                clearBorderQuiz();
                film1.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mediaPlayerOption.start();
            }
        });

        mult1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "mult";
                clearBorderQuiz();
                mult1.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mediaPlayerOption.start();
            }
        });

        anime1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "anime";
                clearBorderQuiz();
                anime1.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mediaPlayerOption.start();
            }
        });

        serial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "serial";
                clearBorderQuiz();
                serial1.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mediaPlayerOption.start();
            }
        });

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopic.isEmpty()){
                    mediaPlayerFail.start();
                    Toast.makeText(MainActivity.this, "Выберите категорию",Toast.LENGTH_SHORT).show();}
                    else{
                    mediaPlayerNext.start();
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
    public void  clearBorderQuiz (){
        serial1.setBackgroundResource(R.drawable.round_back_white10);
        film1.setBackgroundResource(R.drawable.round_back_white10);
        mult1.setBackgroundResource(R.drawable.round_back_white10);
        anime1.setBackgroundResource(R.drawable.round_back_white10);
        film.setBackgroundResource(R.drawable.round_back_white10);
        mult.setBackgroundResource(R.drawable.round_back_white10);
        anime.setBackgroundResource(R.drawable.round_back_white10);
        serial.setBackgroundResource(R.drawable.round_back_white10);
    }
}
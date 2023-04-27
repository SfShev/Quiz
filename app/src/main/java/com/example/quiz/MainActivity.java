package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout film = findViewById(R.id.filmLayout);
        final LinearLayout mult = findViewById(R.id.multLayout);
        final LinearLayout anime = findViewById(R.id.animeLayout);
        final LinearLayout serial = findViewById(R.id.serialLayout);
        final Button btnstart = findViewById(R.id.btnstart);

        film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               selectedTopic = "film";

               film.setBackgroundResource(R.drawable.round_back_white_stroke10);

               mult.setBackgroundResource(R.drawable.round_back_white10);
               anime.setBackgroundResource(R.drawable.round_back_white10);
               serial.setBackgroundResource(R.drawable.round_back_white10);


            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "mult";

                mult.setBackgroundResource(R.drawable.round_back_white_stroke10);

                film.setBackgroundResource(R.drawable.round_back_white10);
                anime.setBackgroundResource(R.drawable.round_back_white10);
                serial.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        anime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "anime";

                anime.setBackgroundResource(R.drawable.round_back_white_stroke10);

                film.setBackgroundResource(R.drawable.round_back_white10);
                mult.setBackgroundResource(R.drawable.round_back_white10);
                serial.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        serial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "serial";

                serial.setBackgroundResource(R.drawable.round_back_white_stroke10);

                film.setBackgroundResource(R.drawable.round_back_white10);
                mult.setBackgroundResource(R.drawable.round_back_white10);
                anime.setBackgroundResource(R.drawable.round_back_white10);


            }
        });

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopic.isEmpty()){
                    Toast.makeText(MainActivity.this, "Выберите категорию",Toast.LENGTH_SHORT).show();}
                    else{
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }
        });



    }
}
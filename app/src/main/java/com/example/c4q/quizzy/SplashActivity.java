package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(getApplicationContext(), QuizActivity.class);

//           ~~~ DIFFERENT WAYS TO START AN INTENT ~~~~ All valid ways to infer Context.
//        Intent intent2 = new Intent(this, QuizActivity.class);
//        Intent inten3 = new Intent(SplashActivity.this, QuizActivity.class);
//


        startActivity(intent);

    }
}

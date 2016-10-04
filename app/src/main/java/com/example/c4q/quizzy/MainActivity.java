package com.example.c4q.quizzy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by shawnspeaks on 9/28/16.
 */

public class MainActivity extends QuizActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        Button button = (Button) view;


    }


}

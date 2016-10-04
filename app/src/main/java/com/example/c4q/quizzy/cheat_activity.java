package com.example.c4q.quizzy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cheat_activity extends QuizActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        Button button = (Button) findViewById(R.id.cheat_button);
        button.setVisibility(View.GONE);

        TextView questionTV = (TextView) findViewById(R.id.question_text_view);
//        String myQuestion = getIntent().getExtras().getString("CURRENT QUESTION");
//        boolean myAnswer = getIntent().getExtras().getBoolean("CURRENT ANSWER");
//        questionTV.setText(myQuestion + " : " + String.valueOf(myAnswer));

        int myIntIndex = getIntent().getExtras().getInt("CURRENT INDEX");
        Question currentQuestion = questionBank[myIntIndex];

    }

}

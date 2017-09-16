package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class firstQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        TextView firstQuestion = (TextView) findViewById(R.id.question1);
        firstQuestion.setText("This is your first question!!! \n Answer: YES or NO");
    }

    public void nextQuestion(View view) {
        Intent intent = new Intent(this, firstQuestion.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }



}

package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class thirdQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);

        TextView thirdQuestion = (TextView) findViewById(R.id.question3);
        thirdQuestion.setText("In the past month, have you had strong feelings of guilt?");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, medHistorySummary.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, medHistorySummary.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }
}

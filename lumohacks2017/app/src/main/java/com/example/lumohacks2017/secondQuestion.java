package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class secondQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        TextView secondQuestion = (TextView) findViewById(R.id.question2);
        secondQuestion.setText("Do you have/have you had any heart problems?");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, thirdQuestion.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, thirdQuestion.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }
}

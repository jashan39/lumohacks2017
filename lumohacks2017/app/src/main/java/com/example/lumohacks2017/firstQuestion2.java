package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class firstQuestion2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question2);

        TextView firstQuestionPart2 = (TextView) findViewById(R.id.question1part2);
        firstQuestionPart2.setText("What drug(s)?");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, secondQuestion.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }
}

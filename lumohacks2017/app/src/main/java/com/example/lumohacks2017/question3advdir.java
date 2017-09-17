package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.lumohacks2017.medicalHistory.source;
import static com.example.lumohacks2017.medicalHistory.source1;

public class question3advdir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3advdir);

    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question4advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button8);
        String text = (String)button.getText();
        startActivity(intent);
        source1.put("In the case of an overdose, do you consent to stomach pumping?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question4advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button7);
        String text = (String)button.getText();
        startActivity(intent);
        source1.put("In the case of an overdose, do you consent to stomach pumping?", text);

    }
}
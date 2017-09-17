package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class medHistorySummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_history_summary);


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, advanceDirectivesIntro.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }
}

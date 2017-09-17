package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class advanceDirectivesIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_directives_intro);
       }

    public void startButton(View view) {
        Intent intent = new Intent(this, question1advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }
}

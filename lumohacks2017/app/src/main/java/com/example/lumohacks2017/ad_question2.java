package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ad_question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_question2);
    }

    public void yesSendMessage(View view) {
        medicalHistory.source1.put("Do you understand that physical restraints and/or sedating medications may be needed if there is an immediate danger to the patient or others around them?", "Yes, I understand this!");
        Intent intent = new Intent(this, summaryAdvanced.class);
        startActivity(intent);
    }

    public void noSendMessage(View view) {
        medicalHistory.source1.put("Do you understand that physical restraints and/or sedating medications may be needed if there is an immediate danger to the patient or others around them?", "No, I don't understand this!");
        Intent intent = new Intent(this, summaryAdvanced.class);
        startActivity(intent);
    }

}

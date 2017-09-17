package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ad_question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_question1);
    }

    public void yesSendMessage(View view) {
        medicalHistory.source1.put("If immediate treatment is required to prevent death or other serious harm to a patient, the treatment may be provided without informed consent.", "Yes, I understand this!");
        Intent intent = new Intent(this, ad_question2.class);
        startActivity(intent);
    }

    public void noSendMessage(View view) {
        medicalHistory.source1.put("If immediate treatment is required to prevent death or other serious harm to a patient, the treatment may be provided without informed consent.", "No, I don't understand this!");
        Intent intent = new Intent(this, ad_question2.class);
        startActivity(intent);
    }

}

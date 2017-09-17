package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Iterator;
import java.util.Map;

import static com.example.lumohacks2017.medicalHistory.source;
import static com.example.lumohacks2017.medicalHistory.summaryText;
import static com.example.lumohacks2017.medicalHistory.summaryText1;

public class summaryAdvanced extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_advanced);

        TextView text = (TextView)findViewById(R.id.results21);
        Iterator it = medicalHistory.source1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            summaryText1 = summaryText1 + pair.getKey() + " : " + pair.getValue() + "\n\n";
        }
        text.setText(summaryText1);
    }

    @Override
    public void onBackPressed() {
        TextView text = (TextView)findViewById(R.id.results21);
        text.setText("");
        summaryText1 = "";
        super.onBackPressed();
    }

    public void signnow(View view) {
        Intent intent = new Intent(this, signActivity.class);
        startActivity(intent);
    }

}

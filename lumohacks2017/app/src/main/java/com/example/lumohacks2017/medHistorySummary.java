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

public class medHistorySummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_history_summary);

        TextView text = (TextView)findViewById(R.id.results);
        Iterator it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            summaryText = summaryText + pair.getKey() + " : " + pair.getValue() + "\n\n";
        }
        text.setText(summaryText);

    }

    @Override
    public void onBackPressed() {
        TextView text = (TextView)findViewById(R.id.results);
        text.setText("");
        summaryText = "";
        super.onBackPressed();
    }

    public void signnow(View view) {
        Intent intent = new Intent(this, signActivity.class);
        startActivity(intent);
    }

}

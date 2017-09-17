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

public class question2advdir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2advdir);

        TextView readMore = (TextView) findViewById(R.id.textView6);
        readMore.setText(
                Html.fromHtml(
                        "A physical restraint is used when a patient’s safety is at risk. For instance: a patient " +
                                "at risk of falling; hurting them self or others; pulling out tubes; or acting in an " +
                                "aggressive or violent way. " + "<a href=\"http://www.muhcpatienteducation.ca/DATA/GUIDE/349_en~v~patient-safety-and-physical-restraint.pdf\">Read more...</a>"));
        readMore.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question3advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button8);
        String text = (String)button.getText();
        startActivity(intent);
        source1.put("Do you understand that physical restraints and/or sedating medications may be needed if there is an immediate danger to the patient or others around them?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question3advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button7);
        String text = (String)button.getText();
        startActivity(intent);
        source1.put("Do you understand that physical restraints and/or sedating medications may be needed if there is an immediate danger to the patient or others around them?", text);

    }
}
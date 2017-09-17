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

public class question1advdir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1advdir);

        TextView readMore = (TextView) findViewById(R.id.textView6);
        readMore.setText(
                Html.fromHtml(
                        "Despite its importance, the duty to obtain the patient's informed consent to treatment is not absolute. " +
                                "One prominent exception refers directly to emergency care. " + "<a href=\"http://www.emed.theclinics.com/article/S0733-8627(05)70062-6/abstract\">Read more...</a>"));
        readMore.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question2advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button8);
        String text = (String)button.getText();
        startActivity(intent);
        medicalHistory.source1.put("In an immediate emergency, do understand that treatment may be given without consent to prevent death or other serious harm?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question2advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button7);
        String text = (String)button.getText();
        startActivity(intent);
        medicalHistory.source1.put("In an immediate emergency, do understand that treatment may be given without consent to prevent death or other serious harm?", text);
    }
}
package com.example.lumohacks2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

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
}
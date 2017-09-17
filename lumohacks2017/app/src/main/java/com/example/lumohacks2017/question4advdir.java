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

public class question4advdir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4advdir);

        TextView readMore = (TextView) findViewById(R.id.textView4);
        readMore.setText(
                Html.fromHtml(
                        "The drug, bound to the charcoal, is then expelled in the stool. Often, a cathartic is given with the charcoal so that the person more quickly evacuates stool from his or her bowels. " +
                                "<a href=\"http://www.webmd.com/mental-health/addiction/drug-overdose#3-6\">Read more...</a>"));
        readMore.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question5advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button8);
        String text = (String)button.getText();
        startActivity(intent);
        source.put("Do you understand that physical restraints and/or sedating medications may be needed if there is an immediate danger to the patient or others around them?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question5advdir.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button7);
        String text = (String)button.getText();
        startActivity(intent);
        source.put("Do you understand that physical restraints and/or sedating medications may be needed if there is an immediate danger to the patient or others around them?", text);

    }
}
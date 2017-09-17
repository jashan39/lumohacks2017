package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.lumohacks2017.medicalHistory.source;

public class firstQuestion2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question2);

        TextView firstQuestionPart2 = (TextView) findViewById(R.id.question1part2);
        firstQuestionPart2.setText("What drug(s)?");

        Button button = (Button)findViewById(R.id.button2);
        final EditText editText = (EditText)findViewById(R.id.editText);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String text = editText.getText().toString();
                        source.put("Do you have any drug allergies?", text);
                    }
                });
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, secondQuestion.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }
}

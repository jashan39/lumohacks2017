package com.example.lumohacks2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.lumohacks2017.medicalHistory.source;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button3);
        final EditText editText = (EditText)findViewById(R.id.editText4);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String text = editText.getText().toString();
                        medicalHistory.healthcare_num = text;
                        sendMessage(view);
                    }
                });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, firstQuestion.class);
        startActivity(intent);
    }
}
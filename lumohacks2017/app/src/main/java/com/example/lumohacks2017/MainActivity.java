package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello_message = (TextView) findViewById(R.id.hello);
        hello_message.setText("Hey Jenny!!");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, firstQuestion.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }

}

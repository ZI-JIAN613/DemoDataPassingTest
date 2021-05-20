package com.example.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);

        Intent i = getIntent();
        int value = i.getIntExtra("value", -99);
        char value1 = i.getCharExtra("char", 'z');
        double value2 = i.getDoubleExtra("double", -99.99);

        if (value != -99) {
            tvAnswer.setText("Integer received is " + value);
        } else if (value1 != 'z') {
            tvAnswer.setText("Character value received is " + value1);
        } else if (value2 != -99.99) {
            tvAnswer.setText("Double value received is " + value2);
        }

    }
}
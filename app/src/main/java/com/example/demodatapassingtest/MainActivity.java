package com.example.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInt;
    Button btnPassChar;
    TextView tvPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInt = findViewById(R.id.buttonPassInt);
        btnPassChar = findViewById(R.id.buttonPassChar);
        tvPassDouble = findViewById(R.id.textViewPassDouble);

        btnPassInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                intent1.putExtra("char", 'a');
                startActivity(intent1);
            }
        });

        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                intent2.putExtra("double", 99.99);
                startActivity(intent2);
            }
        });

    }
}

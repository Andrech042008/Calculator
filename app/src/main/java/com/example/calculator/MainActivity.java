package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText field1;
    private EditText field2;
    private Button buttonPlus;
    private Button buttonUnmoj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        field1 = findViewById(R.id.field_et);
        field2 = findViewById(R.id.field2_et);
        buttonPlus= findViewById(R.id.plus_btn);
        buttonUnmoj=findViewById(R.id.umnoj_btn);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,summ;
                a = Integer.parseInt(field1.getText().toString());
                b = Integer.parseInt(field2.getText().toString());
                summ = a+b;
                field1.setText(String.valueOf(summ));
                field2.setText(" ");
            }
        });
        buttonUnmoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,summ;
                a = Integer.parseInt(field1.getText().toString());
                b= Integer.parseInt(field2.getText().toString());
                summ = a*b;
                field1.setText(String.valueOf(summ));
                field2.setText(" ");
            }
        });


    }

}
package com.example.calculatodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtkq, edtkq2;

    Button btnTich;
    TextView textView;
    String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtkq = findViewById(R.id.edtkq);
        edtkq2 = findViewById(R.id.edtkq2);
        btnTich = findViewById(R.id.btnTich);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView txtView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        txtView.setAdapter(adapter);
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int d= a+b;
                double c = a*1.0/b*1.0;
                edtkq2.setText(d+"");
                edtkq.setText(c+"");
            }
        });
    }
}
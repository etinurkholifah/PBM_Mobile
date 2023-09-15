package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextAlas, editTextTinggi, editTextSisi1, editTextSisi2;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        editTextSisi1 = findViewById(R.id.editTextSisi1);
        editTextSisi2 = findViewById(R.id.editTextSisi2);
        textViewHasil = findViewById(R.id.textViewHasil);
    }

    public void hitungLuasDanKeliling(View view) {
        double alas = Double.parseDouble(editTextAlas.getText().toString());
        double tinggi = Double.parseDouble(editTextTinggi.getText().toString());
        double sisi1 = Double.parseDouble(editTextSisi1.getText().toString());
        double sisi2 = Double.parseDouble(editTextSisi2.getText().toString());

        double luas = alas * tinggi;
        double keliling = 2 * (sisi1 + sisi2);

        textViewHasil.setText("Luas: " + luas + "\nKeliling: " + keliling);
    }
}


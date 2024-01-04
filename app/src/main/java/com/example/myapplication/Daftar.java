package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Daftar extends AppCompatActivity {
    TextView login;
    Button daftar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        login = (TextView) findViewById(R.id.login);
        daftar =(Button) findViewById(R.id.daftar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Masuklah = new Intent(getApplicationContext(), Masuk.class);
                startActivity(Masuklah);
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pendaftaran = new Intent(getApplicationContext(), Masuk.class);
                startActivity(pendaftaran);
            }
        });
    }
}
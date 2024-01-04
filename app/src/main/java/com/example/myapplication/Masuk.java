package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Masuk extends AppCompatActivity {
    TextView masuk;
    Button button2_daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        masuk = (TextView) findViewById(R.id.login);
        button2_daftar =(Button) findViewById(R.id.daftar);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pendaftaran = new Intent(getApplicationContext(), Daftar.class);
                startActivity(Pendaftaran);
            }
        });

        button2_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(getApplicationContext(), Home.class);
                startActivity(Login);
            }
        });

    }



}
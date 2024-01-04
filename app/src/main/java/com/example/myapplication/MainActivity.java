package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button,button_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button_masuk = (Button) findViewById(R.id.button_masuk);

        button_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Masuki = new Intent(getApplicationContext(), Masuk.class);
                startActivity(Masuki);
            }
        });

             button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent Mendaftar = new Intent(getApplicationContext(), Daftar.class);
                    startActivity(Mendaftar);
                }
        });

    }

}
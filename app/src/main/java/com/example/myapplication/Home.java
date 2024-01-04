package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    ImageButton imageButton2, imageButton3, imageButton,imageButton5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton5=(ImageButton) findViewById(R.id.imageButton5) ;


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharing = new Intent(getApplicationContext(),SharingStunting.class);
                startActivity(sharing);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nutrisi = new Intent(getApplicationContext(),nutrisi_anak.class);
                startActivity(nutrisi);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imun = new Intent(getApplicationContext(),ImunisasiAnak.class);
                startActivity(imun);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diaryku = new Intent(getApplicationContext(),Diaryku.class);
                startActivity(diaryku);
            }
        });
    }

}
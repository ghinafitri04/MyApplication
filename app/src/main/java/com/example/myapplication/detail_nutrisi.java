package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_nutrisi extends AppCompatActivity {

    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_nutrisi);

        // Dapatkan referensi ke tombol kembali
        ImageButton backButton = findViewById(R.id.button_back);

        // Atur listener untuk tombol kembali
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implementasi untuk kembali ke aktivitas sebelumnya
                onBackPressed();
            }
        });

        // Ambil data dari Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        int imageResource = intent.getIntExtra("imageResource", R.drawable.alpukat); // Default image jika tidak ada

        // Set data ke tampilan
        TextView titleTextView = findViewById(R.id.detailTitle);
        titleTextView.setText(title);

        ImageView imageView = findViewById(R.id.detailImage);
        imageView.setImageResource(imageResource);

    }
}
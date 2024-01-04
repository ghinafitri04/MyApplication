package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ImunisasiAnak extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImunisasiAdapter imunisasiAdapter;
    private ArrayList<ImunisasiModel> imunisasiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imunisasi_anak);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        imunisasiAdapter = new ImunisasiAdapter(imunisasiModel);

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(ImunisasiAnak.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(imunisasiAdapter);
    }

    private void getData() {
        imunisasiModel = new ArrayList<>();
        imunisasiModel.add(new ImunisasiModel("Budi", R.drawable.aksi));
        imunisasiModel.add(new ImunisasiModel("Siti", R.drawable.aksi));

    }

    public void pindahHome (View view){
        Intent home = new Intent(this, Home.class);
        startActivity(home);
    }
}
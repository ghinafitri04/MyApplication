package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class nutrisi_anak extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NutrisiAdapter nutrisiAdapter;
    private ArrayList<NutrisiModel> nutrisiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrisi_anak);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        nutrisiAdapter = new NutrisiAdapter(nutrisiModel);

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(nutrisi_anak.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(nutrisiAdapter);

        // Set listener untuk item dalam adapter
        nutrisiAdapter.setOnItemClickListener(new NutrisiAdapter.onItemClickListener() {
            @Override
            public void onItemClick(NutrisiModel nutrisiModel) {
                // Implementasi untuk menampilkan detail, misalnya membuka aktivitas detail
                Intent detailIntent = new Intent(nutrisi_anak.this, detail_nutrisi.class);
                detailIntent.putExtra("title", nutrisiModel.getNamaNutrisi());
                detailIntent.putExtra("imageResource", nutrisiModel.getLogoNutrisi());
                startActivity(detailIntent);
            }
        });
    }

    private void getData() {
        nutrisiModel = new ArrayList<>();
        nutrisiModel.add(new NutrisiModel("Alpukat", R.drawable.alpukat));
        nutrisiModel.add(new NutrisiModel("Pisang", R.drawable.pisang));
        nutrisiModel.add(new NutrisiModel("Jambu", R.drawable.beri));
        nutrisiModel.add(new NutrisiModel("Bayam", R.drawable.bayam));
        nutrisiModel.add(new NutrisiModel("Susu", R.drawable.susu));
        nutrisiModel.add(new NutrisiModel("Tempe", R.drawable.tempe));
        nutrisiModel.add(new NutrisiModel("Telur", R.drawable.telur));
        nutrisiModel.add(new NutrisiModel("Ikan", R.drawable.ikan));
    }

    public void pindahHome (View view){
        Intent home = new Intent(this, Home.class);
        startActivity(home);
    }
}

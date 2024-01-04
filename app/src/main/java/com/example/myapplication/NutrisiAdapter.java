package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NutrisiAdapter extends RecyclerView.Adapter<NutrisiAdapter.ViewHolder>{

    private ArrayList<NutrisiModel>nutrisiModel;

    public NutrisiAdapter(ArrayList<NutrisiModel> nutrisiModel) {
        this.nutrisiModel = nutrisiModel;
    }

    @NonNull
    @Override
    public NutrisiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.informasi_nutrisi_anak,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull NutrisiAdapter.ViewHolder holder, int position) {
        holder.nama_nutrisi.setText(nutrisiModel.get(position).getNamaNutrisi());
        holder.logo_nutrisi.setImageResource(nutrisiModel.get(position).getLogoNutrisi());

    }

    @Override
    public int getItemCount() {
        return nutrisiModel.size();
    }

    public void setOnItemClickListener(SharingAdapter.onItemClickListener onItemClickListener) {
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nama_nutrisi;
        ImageView logo_nutrisi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama_nutrisi = itemView.findViewById(R.id.NamaNutrisi);
            logo_nutrisi = itemView.findViewById(R.id.LogoNutrisi);
        }
    }

    public static abstract class onItemClickListener implements SharingAdapter.onItemClickListener {
        @Override
        public void onItemClick(SharingModel sharingModel) {

        }

        public abstract void onItemClick(NutrisiModel nutrisiModel);
    }
}

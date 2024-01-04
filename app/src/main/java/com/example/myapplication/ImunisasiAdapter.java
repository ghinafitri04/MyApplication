package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImunisasiAdapter extends RecyclerView.Adapter<ImunisasiAdapter.ViewHolder> {
    private ArrayList<ImunisasiModel> dataItem;
    public ImunisasiAdapter(ArrayList<ImunisasiModel>dataItem){
        this.dataItem = dataItem;
    }
    @NonNull
    @Override
    public ImunisasiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imunisasi_anak, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ImunisasiAdapter.ViewHolder holder, int position) {

        holder.nama_anak.setText(dataItem.get(position).getName());
        holder.image_aksi.setImageResource(dataItem.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nama_anak;
        ImageView image_aksi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama_anak = itemView.findViewById(R.id.nama_anak);
            image_aksi = itemView.findViewById(R.id.image_aksi);
        }
    }
}

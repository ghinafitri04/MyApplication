package com.example.myapplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class SharingAdapter extends RecyclerView.Adapter<SharingAdapter.ViewHolder> {
    private onItemClickListener onItemClickListener;
    private ArrayList<SharingModel> dataItem;

    private com.example.myapplication.onItemClickListener ItemClickListener;

    public void setOnItemClickListener(onItemClickListener listener) {
        this.onItemClickListener =listener;
    }


    public interface onItemClickListener {
        void onItemClick(SharingModel sharingModel);
    }
    public SharingAdapter(ArrayList<SharingModel> dataItem){

        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public SharingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sharing_stunting, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SharingAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(dataItem.get(position).getName());
        holder.image.setImageResource(dataItem.get(position).getImage());

        // Set click listener pada item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(dataItem.get(position));
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return dataItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

            TextView title;
            ImageView image;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.title);
                image = itemView.findViewById(R.id.image);
            }
        }

    }





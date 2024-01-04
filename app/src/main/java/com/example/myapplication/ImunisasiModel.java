package com.example.myapplication;

public class ImunisasiModel {
    private String nama_anak;
    private String image_aksi;

    public ImunisasiModel(String name, int image) {
        this.nama_anak = name;
        this.image_aksi = String.valueOf(image);
    }


    public String getName() {
        return nama_anak;
    }

    public void setName(String name) {
        this.nama_anak = name;
    }


    public int getImage() {
        return Integer.parseInt(image_aksi);
    }

    public void setImage(String image) {
        this.image_aksi = image;
    }
}

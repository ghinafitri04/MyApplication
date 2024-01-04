package com.example.myapplication;

public class SharingModel {
    private static String name;
    private static String image;

    public SharingModel(String name, int image) {
        this.name = name;
        this.image = String.valueOf(image);
    }



    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static int getImage() {
        return Integer.parseInt(image);
    }

    public void setImage(String image) {
        this.image = image;
    }
}

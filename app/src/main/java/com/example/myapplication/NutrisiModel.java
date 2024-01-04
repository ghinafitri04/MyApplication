package com.example.myapplication;

public class NutrisiModel {
    private static String namaNutrisi;
    private static String logoNutrisi;

    public NutrisiModel(String namaNutrisi, int logoNutrisi) {
        this.namaNutrisi = namaNutrisi;
        this.logoNutrisi = String.valueOf(logoNutrisi);
    }

    public static String getNamaNutrisi() {
        return namaNutrisi;
    }

    public void setNamaNutrisi(String namaNutrisi) {
        this.namaNutrisi = namaNutrisi;
    }

    public static int getLogoNutrisi() {
        return Integer.parseInt(logoNutrisi);
    }

    public void setLogoNutrisi(String logoNutrisi) {
        this.logoNutrisi = logoNutrisi;
    }
}

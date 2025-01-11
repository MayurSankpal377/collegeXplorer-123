package com.example.myapplication.Engineering;

public class College {
    private String name;
    private int imageResId;

    public College(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}

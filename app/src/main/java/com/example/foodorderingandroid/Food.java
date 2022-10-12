package com.example.foodorderingandroid;

public class Food {
    private String name;
    private int imageID;

    public Food(String name,int imageID) {
        this.name = name;
        this.imageID=imageID;
    }
    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }

}

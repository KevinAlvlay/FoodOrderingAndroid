package com.example.foodorderingandroid;

public class FoodList {
    private int Food_Img;
    private String Food_Name;
    private float Food_Price;
    private int Food_Number;
    private int Add;
    private int Sub;

    private int Flavor;

    public FoodList(int food_Img,String food_Name,float food_Price,int food_Number,int add,int sub,int flavor){
        this.Food_Img=food_Img;  //图片
        this.Food_Name=food_Name;  //名字
        this.Food_Price=food_Price;  //价格
        this.Food_Number=food_Number;  //数量
        this.Add=add;
        this.Sub=sub;
        this.Flavor=flavor;  //口味
    }
    public FoodList(int food_Img,String food_Name,float food_Price,int food_Number,int flavor){
        this.Food_Img=food_Img;
        this.Food_Name=food_Name;
        this.Food_Price=food_Price;
        this.Food_Number=food_Number;
        this.Flavor=flavor;
    }

    public int getFood_Img(){
        return Food_Img;
    }

    public void setFood_Img(int food_img){
        Food_Img=food_img;
    }

    public String getFood_Name(){
        return Food_Name;
    }

    public void setFood_Name(String food_name){
        Food_Name=food_name;
    }

    public float getFood_Price(){
        return Food_Price;
    }

    public void setFood_Price(int food_price){
        Food_Price=food_price;
    }

    public int getFood_Number(){
        return Food_Number;
    }

    public void setFood_Number(int food_number){
        Food_Number=food_number;
    }

    public int getAdd(){
        return Add;
    }

    public void setAdd(int add){
        Add=add;
    }

    public int getSub(){
        return Sub;
    }

    public void setSub(int sub){
        Sub=sub;
    }

    public int getFlavor(){
        return Flavor;
    }

    public void setFlavor(int flavor){
        Flavor=flavor;
    }

}

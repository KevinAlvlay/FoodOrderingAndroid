package com.example.foodorderingandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {
    private int resourceID;
    public FoodAdapter(Context context, int textViewResourceID, List<Food>object){
        super(context,textViewResourceID,object);
        resourceID=textViewResourceID;
    }
    public View getView(int position, View coverView, ViewGroup parent){
        Food food=getItem(position);//获取当前的Food实例
        View view= LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        ImageView foodImage = (ImageView)view.findViewById(R.id.food_image);
        TextView foodName = (TextView) view.findViewById(R.id.food_name);
        foodImage.setImageResource(food.getImageID());
        foodName.setText(food.getName());
        return view;
    }


}

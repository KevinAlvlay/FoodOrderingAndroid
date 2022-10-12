package com.example.foodorderingandroid;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    private List<Food> foodList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
      //  initFoods();        //初始化食物
        FoodAdapter adapter = new FoodAdapter(OrderActivity.this,R.layout.food_item,foodList);

        ListView listView = (ListView) findViewById(R.id.List_view1);
        listView.setAdapter(adapter);
     /*   listView.setOnClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent,View view,int position, long id){
                Food food =foodList.get(position);

            }
        });
      */


    }

    /*  private void initFoods(){
        Food rice = new Food("rice",R.drawable.rice_pic);
        foodList.add(rice);
    }
    */
}
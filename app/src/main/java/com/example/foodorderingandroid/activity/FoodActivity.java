package com.example.foodorderingandroid.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderingandroid.R;
import com.example.foodorderingandroid.bean.FoodBean;


public class FoodActivity extends AppCompatActivity {
    private FoodBean bean;
    private int shopId;
    private TextView tv_food_name, tv_sale_num, tv_price;
    private ImageView iv_food_pic;
    private int[][] bgs = {{R.drawable.food1_1, R.drawable.food1_2,R.drawable.food1_3},
            {R.drawable.food2_1, R.drawable.food2_2, R.drawable.food2_3},
            {R.drawable.food3_1, R.drawable.food3_2, R.drawable.food3_3},
            {R.drawable.food4_1, R.drawable.food4_2, R.drawable.food4_3},
            {R.drawable.food5_1, R.drawable.food5_2, R.drawable.food5_3},
            {R.drawable.food6_1, R.drawable.food6_2, R.drawable.food6_3}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        //从店铺详情界面传递过来的菜的数据
        bean = (FoodBean) getIntent().getSerializableExtra("food");
        shopId =  getIntent().getIntExtra("shopId", 0);
        initView();
        setData();
    }
    /**
     * 初始化界面控件
     */
    private void initView() {
        tv_food_name = (TextView) findViewById(R.id.tv_food_name);
        tv_sale_num = (TextView) findViewById(R.id.tv_sale_num);
        tv_price = (TextView) findViewById(R.id.tv_price);
        iv_food_pic = (ImageView) findViewById(R.id.iv_food_pic);
    }
    /**
     * 设置界面数据
     */
    private void setData() {
        if (bean == null) return;
        tv_food_name.setText(bean.getFoodName());
        tv_sale_num.setText("月售" + bean.getSaleNum());
        tv_price.setText("￥" + bean.getPrice());
        // 图片
        iv_food_pic.setBackgroundResource(bgs[shopId - 1][bean.getFoodId() - 1]);
    }
}

package com.example.foodorderingandroid.activity;

import android.os.Bundle;

import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderingandroid.R;
import com.example.foodorderingandroid.adapter.ShopAdapter;
import com.example.foodorderingandroid.bean.ShopBean;
import com.example.foodorderingandroid.util.JsonParse;
import com.example.foodorderingandroid.views.ShopListView;

import java.util.List;


public class ShopActivity extends AppCompatActivity {
    private TextView tv_back,tv_title;         //返回键与标题控件
    private ShopListView slv_list;              //列表控件
    private ShopAdapter adapter;                //列表的适配器
    private RelativeLayout rl_title_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        init();
    }
    /**
     * 初始化界面控件
     */
    private void init(){
        tv_back = (TextView) findViewById(R.id.tv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText("店铺");
        rl_title_bar = (RelativeLayout) findViewById(R.id.title_bar);
        rl_title_bar.setBackgroundColor(getResources().getColor(R.color.blue_color));
        tv_back.setVisibility(View.GONE);
        slv_list= (ShopListView) findViewById(R.id.slv_list);
        adapter=new ShopAdapter(this);
        //解析获取的JSON数据
        List<ShopBean> pythonList = JsonParse.getInstance().getShopList(ShopActivity.this, "shop_list_data.json");
        adapter.setData(pythonList);
        slv_list.setAdapter(adapter);
    }

    protected long exitTime;//记录第一次点击时的时间
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(ShopActivity.this, "再按一次退出订餐应用",
                        Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                ShopActivity.this.finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

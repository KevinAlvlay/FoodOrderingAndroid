package com.example.foodorderingandroid.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.foodorderingandroid.R;

public class MainActivity extends AppCompatActivity {
    Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"正在加载菜单……",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(intent);
                finish();

            }
        }, 2000);


    }

//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.main,menu);
//        return true;
//    }

//    public boolean onOptionsItemSelected(MenuItem item){
//        switch(item.getItemId()){
//            case R.id.Test_Info:
//                Toast.makeText(this,"正在跳转Github",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Intent.ACTION_VIEW);//intent用于跳转Github原码
//                intent.setData(Uri.parse("https://github.com/KevinAlvlay/FoodOrderingAndroid"));
//                startActivity(intent);
//                break;
//            case R.id.Developer_Info:
//                Toast.makeText(this,"APP开发者：詹天成，秦帅，董志浩",Toast.LENGTH_SHORT).show();
//                break;
//            default:
//        }
//        return true;
//    }
}
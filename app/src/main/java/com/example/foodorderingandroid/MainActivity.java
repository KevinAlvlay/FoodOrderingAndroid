package com.example.foodorderingandroid;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //点击button_start按钮暂时弹出显示“正在进入系统”
        Button button_start=findViewById(R.id.Button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"正在加载菜单……",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
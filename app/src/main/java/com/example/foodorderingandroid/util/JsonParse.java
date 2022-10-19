package com.example.foodorderingandroid.util;


import android.content.Context;

import com.example.foodorderingandroid.bean.ShopBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonParse {
    private static JsonParse instance;
    private JsonParse() {
    }
    public static JsonParse getInstance() {
        if (instance == null) {
            instance = new JsonParse();
        }
        return instance;
    }
    /**
     * 将获取的数据流转化为JSON数据
     */
    private String read(InputStream in) {
        BufferedReader reader = null;
        StringBuilder sb = null;
        String line = null;
        try {
            sb = new StringBuilder();//实例化一个StringBuilder对象
            //用InputStreamReader把in这个字节流转换成字符流BufferedReader
            reader = new BufferedReader(new InputStreamReader(in));
            //判断从reader中读取的行内容是否为空
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            try {
                if (in != null) in.close();
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public List<ShopBean> getShopList(Context context, String json_path) {
        List<ShopBean> Infos = new ArrayList<>();
//        File src=new File(json_path);

        InputStream is = null;
        try {
            //从项目中的assets文件夹中获取json文件
            is = context.getResources().getAssets().open("shop_list_data.json");
            String json = read(is); //获取json数据
//            System.out.println(json);
            Gson gson = new Gson(); //创建Gson对象
            // 创建一个TypeToken的匿名子类对象，并调用该对象的getType()方法
            Type listType = new TypeToken<List<ShopBean>>() {}.getType();
            // 把获取到的信息集合存到infoList中
            List<ShopBean> infoList = gson.fromJson(json, listType);
//            System.out.println(infoList.get(0).getShopNotice());
            return infoList;
        } catch (Exception e) {
            System.out.println("ffffff");
        }
        return Infos;
    }
}



//public class JsonParse {
//    private static JsonParse instance;
//    private JsonParse() {
//    }
//    public static JsonParse getInstance() {
//        if (instance == null) {
//            instance = new JsonParse();
//        }
//        return instance;
//    }
//    public List<ShopBean> getShopList(Context context, String jsonFile) {
//        InputStream is = null;
//        try {
//            is = context.getResources().getAssets().open(jsonFile);
//            String json = read(is);
//        }catch (Exception e) {
//
//        }
//
//        Gson gson = new Gson(); // 使用gson库解析JSON数据
//        // 创建一个TypeToken的匿名子类对象，并调用对象的getType()方法
//        Type listType = new TypeToken<List<ShopBean>>() {
//        }.getType();
//        // 把获取到的信息集合存到shopList中
//        List<ShopBean> shopList = gson.fromJson(json, listType);
//        return shopList;
//    }
//}

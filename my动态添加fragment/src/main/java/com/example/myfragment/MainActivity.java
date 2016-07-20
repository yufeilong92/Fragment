package com.example.myfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//获取手机分辨率
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        // 获取fragment的管理者
        FragmentManager fragmentManager = getFragmentManager();
        //开启事务
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if(width<height){
       //说明是竖屏  加载Fragment  android.R.id.content表示当前的框体
        beginTransaction.replace(android.R.id.content,new Fragment1());


   }else {
       //说明是横屏  加载Fragment
      beginTransaction.replace(android.R.id.content,new Fragment());
   }//提交
        beginTransaction.commit();
    }

}

package com.example.my;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_wx = (Button) findViewById(R.id.btn_wx);
        Button btn_contact = (Button) findViewById(R.id.btn_contact);
        Button btn_find = (Button) findViewById(R.id.btn_find);
        Button btn_me = (Button) findViewById(R.id.btn_me);
        btn_wx.setOnClickListener(this);
        btn_contact.setOnClickListener(this);
        btn_find.setOnClickListener(this);
        btn_me.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //获取Fragment分管理者
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.btn_wx:
            beginTransaction.replace(R.id.ll_layout,new weixinfragment());
                break;
            case R.id.btn_contact:
             beginTransaction.replace(R.id.ll_layout,new contentxinfragment());
                break;
            case R.id.btn_find:
                beginTransaction.replace(R.id.ll_layout,new findfragment());
                break;
            case R.id.btn_me:
                 beginTransaction.replace(R.id.ll_layout,new mefragment());
                break;
        }
        beginTransaction.commit();
    }
}

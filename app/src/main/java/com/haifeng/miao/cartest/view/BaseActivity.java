package com.haifeng.miao.cartest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by jet on 2018-07-21.
 * 属性
 * 接口
 * 函数方法
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //菜单栏
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

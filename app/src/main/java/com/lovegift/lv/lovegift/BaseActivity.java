package com.lovegift.lv.lovegift;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/6/23.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntentData(savedInstanceState);
    }
    //得到Intent传入的数据
    protected abstract void getIntentData(Bundle savedInstanceState);
}

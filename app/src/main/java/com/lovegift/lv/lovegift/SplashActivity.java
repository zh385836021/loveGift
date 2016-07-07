package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.lovegift.lv.utils.SharedPrefUtils;

import cn.jpush.android.api.JPushInterface;

/**
 * 引导页面
 */
public class SplashActivity extends AppCompatActivity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // TODO 判断是否是首次打开应用
                if (SharedPrefUtils.getBoolean(SplashActivity.this, "isFirst", true)) {

                    //TODO 开启导航界面
                    Intent intent = new Intent(SplashActivity.this, GuideActivity.class);
                    startActivity(intent);
                    //TODO  设置isFirst值为false，下次直接进主页面;
                    SharedPrefUtils.saveBoolean(SplashActivity.this, "isFirst", false);
                    finish();

                } else {
                    //开启主界面
                    Intent intent = new Intent(SplashActivity.this, NavigationActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        },2000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }
}

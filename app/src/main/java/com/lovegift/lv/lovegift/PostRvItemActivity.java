package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facebook.drawee.view.SimpleDraweeView;

public class PostRvItemActivity extends AppCompatActivity {

    private AppBarLayout mPostRvAppbar;
    private CollapsingToolbarLayout mPostRvCtoolbar;
    private ImageView mPostRvSdv;
    private Toolbar mPostRvToolbar;
    private TextView mPostRvTitle;
    private WebView mPostRvWebView;

    private String img_url ;
    private String title;
    private String short_title;
    private String content_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_post_rv_item);
        assignViews();//初始化控件
        initToolbar();//toolbar有左上角返回键
        getDataFromRv();//从前一个recyclerview的适配器的点击事件传过来数据
    }

    //设置toolbar返回键
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initToolbar() {
        setSupportActionBar(mPostRvToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    public void getDataFromRv() {
        Intent intent = getIntent();
        img_url =intent.getStringExtra("img_url");
        title = intent.getStringExtra("title");
        short_title = intent.getStringExtra("short_title");
        content_url = intent.getStringExtra("content_url");

//        mPostRvSdv.setImageURI(img_url);
        Glide.with(this)
                .load(img_url)
                .fitCenter()
                .placeholder(R.mipmap.loading)
                .into(mPostRvSdv);
        mPostRvToolbar.setTitle(title);//toolbar上的短标题
        Log.i("mtag",img_url+"-----"+short_title+"short_title");
        mPostRvTitle.setText(title);//tv中的长标题
        mPostRvWebView.loadUrl(content_url);//下方webview中数据
    }

    private void assignViews() {
        mPostRvAppbar = (AppBarLayout) findViewById(R.id.post_rv_appbar);
        mPostRvCtoolbar = (CollapsingToolbarLayout) findViewById(R.id.post_rv_ctoolbar);
        mPostRvSdv = (ImageView) findViewById(R.id.post_rv_sdv);
        mPostRvToolbar = (Toolbar) findViewById(R.id.post_rv_toolbar);
        mPostRvTitle = (TextView) findViewById(R.id.post_rv_title);
        mPostRvWebView = (WebView) findViewById(R.id.post_rv_webView);
    }
}

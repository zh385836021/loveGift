package com.lovegift.lv.lovegift;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PurchaseActivity extends BaseActivity {


    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.wv_purchase)
    WebView wvPurchase;
    private String purchase_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_purchase);
        //使用ButterKnife初始化控件
        ButterKnife.bind(this);
        //初始化toolbar设置相关属性
        initToolBar();
        //初始化webView设置相关属性
        initWebView();
        //加载网址
        initData();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home://左侧返回箭头的点击事件
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initData() {
        wvPurchase.loadUrl(purchase_url);
    }

    private void initWebView() {
        WebSettings webSettings = wvPurchase.getSettings();
        webSettings.setDefaultTextEncodingName("UTF-8");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        wvPurchase.setWebViewClient(new WebViewClient());
    }

    private void initToolBar() {
        setSupportActionBar(toolbar);
        //不显示title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //显示左侧的返回箭头默认是不显示的
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // getSupportActionBar().setDisplayShowCustomEnabled(true);
}

    @Override
    protected void getIntentData(Bundle savedInstanceState) {
        purchase_url = getIntent().getStringExtra("purchase_url");
    }
}

package com.lovegift.lv.lovegift;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CollectionItemActivity extends AppCompatActivity {

    @Bind(R.id.collect_item_bg)
    SimpleDraweeView collectItemBg;
    @Bind(R.id.collect_item_toolbar)
    Toolbar collectItemToolbar;
    @Bind(R.id.collect_item_top_title2)
    TextView collectItemTopTitle2;
    @Bind(R.id.collect_item_webView)
    WebView collectItemWebView;
    private String webpUrl;
    private String titles;
    private String contentUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_collection_item);
        ButterKnife.bind(this);

        initToolbar();
        initData();

    }

    private void initData() {
         webpUrl=getIntent().getStringExtra("webpUrl");
         titles=getIntent().getStringExtra("title");
        contentUrl=getIntent().getStringExtra("contentUrl");
        Log.i("mtag", "contentUrl: "+contentUrl);

        collectItemToolbar.setTitle(titles);
        collectItemTopTitle2.setText(titles);
        collectItemBg.setImageURI(webpUrl);


        WebSettings webSettings = collectItemWebView.getSettings();
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //TODO WebView加载web资源
        collectItemWebView.loadUrl(contentUrl);
    }


    private void initToolbar() {
        setSupportActionBar(collectItemToolbar);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}

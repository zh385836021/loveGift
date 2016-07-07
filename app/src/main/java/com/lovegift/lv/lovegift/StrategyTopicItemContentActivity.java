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

public class StrategyTopicItemContentActivity extends AppCompatActivity {

    @Bind(R.id.stra_item_content_bg)
    SimpleDraweeView straItemContentBg;
    @Bind(R.id.stra_item_content_toolbar)
    Toolbar straItemContentToolbar;
    @Bind(R.id.stra_item_content_top_title2)
    TextView straItemContentTopTitle2;
    @Bind(R.id.stra_item_content_webView)
    WebView straItemContentWebView;

    private String webpUrl;
    private String titles;
    private String contentUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_strategy_topic_item_content);
        ButterKnife.bind(this);

        initToolbar();
        initData();
    }

    private void initData() {
        webpUrl=getIntent().getStringExtra("webpUrl");
        titles=getIntent().getStringExtra("title");
        contentUrl=getIntent().getStringExtra("contentUrl");

        straItemContentToolbar.setTitle(titles);
        straItemContentTopTitle2.setText(titles);
        straItemContentBg.setImageURI(webpUrl);


        WebSettings webSettings = straItemContentWebView.getSettings();
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //TODO WebView加载web资源
        straItemContentWebView.loadUrl(contentUrl);
    }


    private void initToolbar() {
        setSupportActionBar(straItemContentToolbar);
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

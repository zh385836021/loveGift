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

public class GloriousThingItemActivity extends AppCompatActivity {


    @Bind(R.id.glor_item_bg)
    SimpleDraweeView glorItemBg;
    @Bind(R.id.glor_item_toolbar)
    Toolbar glorItemToolbar;
    @Bind(R.id.glor_item_top_title)
    TextView glorItemTopTitle;
    @Bind(R.id.glor_item_webView)
    WebView glorItemWebView;

    private String webpUrl;
    private String titles;
    private String contentUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_glorious_thing_item);
        ButterKnife.bind(this);

        initToolbar();
        initData();
    }

    private void initData() {
        webpUrl=getIntent().getStringExtra("webpUrl");
        titles=getIntent().getStringExtra("title");
        contentUrl=getIntent().getStringExtra("contentUrl");
        Log.i("mtag", "contentUrl: "+contentUrl);

        glorItemToolbar.setTitle(titles);
        glorItemTopTitle.setText(titles);
        glorItemBg.setImageURI(webpUrl);


        WebSettings webSettings = glorItemWebView.getSettings();
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //TODO WebView加载web资源
        glorItemWebView.loadUrl(contentUrl);
    }


    private void initToolbar() {
        setSupportActionBar(glorItemToolbar);
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

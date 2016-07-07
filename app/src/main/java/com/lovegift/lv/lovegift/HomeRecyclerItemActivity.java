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

public class HomeRecyclerItemActivity extends AppCompatActivity {

    @Bind(R.id.home_recy_item_bg)
    SimpleDraweeView homeRecyItemBg;
    @Bind(R.id.home_recy_item_toolbar)
    Toolbar homeRecyItemToolbar;
    @Bind(R.id.home_recy_item_top_title)
    TextView homeRecyItemTopTitle;
    @Bind(R.id.home_recy_item_webView)
    WebView homeRecyItemWebView;

    private String webpUrl;
    private String titles;
    private String contentUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_recycler_item);
        ButterKnife.bind(this);

        initToolbar();
        initData();
    }

    private void initData() {
        webpUrl=getIntent().getStringExtra("webpUrl");
        titles=getIntent().getStringExtra("title");
        contentUrl=getIntent().getStringExtra("contentUrl");
        Log.i("mtag", "contentUrl: "+contentUrl);

        homeRecyItemToolbar.setTitle(titles);
        homeRecyItemTopTitle.setText(titles);
        homeRecyItemBg.setImageURI(webpUrl);


        WebSettings webSettings = homeRecyItemWebView.getSettings();
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //TODO WebView加载web资源
        homeRecyItemWebView.loadUrl(contentUrl);
    }


    private void initToolbar() {
        setSupportActionBar(homeRecyItemToolbar);
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

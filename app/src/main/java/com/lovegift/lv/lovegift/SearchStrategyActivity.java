package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.lovegift.lv.BaseApp.MyApplication;
import com.nostra13.universalimageloader.core.ImageLoader;

public class SearchStrategyActivity extends AppCompatActivity {
    private ImageLoader loader;
    private String url;
    private String title;
    private ImageView imageView;
    private TextView textView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_search_strategy);

        loader = ((MyApplication) getApplication()).getLoader();

        getData();
        initView();
        loader.displayImage(url, imageView);
        toolbar.setTitle(title);
        toolbar.setTitleTextColor(Color.WHITE);
        textView.setText(title);
        textView.setTextSize(20);

    }

    private void getData() {
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        title = intent.getStringExtra("title");
    }

    private void initView() {
        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
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
        return true;
    }
}

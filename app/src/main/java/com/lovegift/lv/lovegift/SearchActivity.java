package com.lovegift.lv.lovegift;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.lovegift.lv.fragment.HomeFragment;
import com.lovegift.lv.fragment.SearchEveryFragment;
import com.lovegift.lv.fragment.SearchGiftFragment;
import com.lovegift.lv.fragment.SearchPagerGiftFragment;
import com.lovegift.lv.url.Urls;

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "taggg";
    private FrameLayout search_fragment;
    private Toolbar toolbar;
    private FragmentManager manager;
    private TextView btn_search;
    private EditText editText;
    private SearchEveryFragment fragment = new SearchEveryFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_search);

        initView();

        setSearchListener();

        manager.beginTransaction().replace(R.id.search_fragment, fragment).commit();
    }

    private void setSearchListener() {
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText())) {
                    Toast.makeText(SearchActivity.this, "搜索内容不能为空", Toast.LENGTH_SHORT).show();
                } else {
                    SearchGiftFragment searchGiftFragment = new SearchGiftFragment();
                    searchGiftFragment.getSearchKey(editText.getText().toString());
                    manager.beginTransaction().replace(R.id.search_fragment, searchGiftFragment).commit();

                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                SearchActivity.this.finish();
                break;
        }

        return true;
    }

    private void initView() {
        search_fragment = (FrameLayout) findViewById(R.id.search_fragment);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        btn_search = (TextView) findViewById(R.id.btn_search);
        editText = (EditText) findViewById(R.id.editText);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        manager = getSupportFragmentManager();
    }
}

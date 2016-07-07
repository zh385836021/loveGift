package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import com.lovegift.lv.adapter.GiftRvRvItemRvAdapter;
import com.lovegift.lv.bean.GiftRvRvItemBean;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

public class GiftRvRvItemActivity extends AppCompatActivity {

    private SwipeRefreshLayout mRvRvAcSwip;
    private Toolbar mRvRvAcToolbar;
    private TextView mRvRvAcToolbarTitle;
    private RecyclerView mRvRvAcRv;


    private String url;
    private String title;
    //礼物页面recyclerview中每一个小图标点击 进入的 信息
    private List<GiftRvRvItemBean.DataBean.ItemsBean> item_bean = new ArrayList<>();
    //recyclerview的适配器
    private GiftRvRvItemRvAdapter rv_adapter;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_gift_rv_rv_item);
        assignViews();//初始化控件
        mRvRvAcSwip.setColorSchemeColors(Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW);//设置swiprefresh加载数据时候圈圈的渐变色
        getDataFromRv();//从前一个grid Recyclerview中获取数据,网址.标题
        initToolbar();//初始化toolbar并且让其可以返回
        initData();//下载网络数据
        initAdapter();//初始化recyclerview适配器
        setListener();//设置下拉更新监听事件【其实是假的】
    }

    private void setListener() {

        mRvRvAcSwip.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mRvRvAcSwip.setRefreshing(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRvRvAcSwip.setRefreshing(false);
                    }
                },3000);
            }
        });
    }

    private void initAdapter() {
        rv_adapter = new GiftRvRvItemRvAdapter(this,item_bean);
        mRvRvAcRv.setLayoutManager(new GridLayoutManager(this,2));
        mRvRvAcRv.setAdapter(rv_adapter);
        rv_adapter.notifyDataSetChanged();
    }

    private void initData() {
        RequestParams item_request = new RequestParams(url);
        x.http().get(item_request, new Callback.CommonCallback<GiftRvRvItemBean>() {
            @Override
            public void onSuccess(GiftRvRvItemBean result) {
                item_bean.addAll(result.getData().getItems());
                rv_adapter.notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
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
        setSupportActionBar(mRvRvAcToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void assignViews() {
        mRvRvAcSwip = (SwipeRefreshLayout) findViewById(R.id.rv_rv_ac_swip);
        mRvRvAcToolbar = (Toolbar) findViewById(R.id.rv_rv_ac_toolbar);
        mRvRvAcToolbarTitle = (TextView) findViewById(R.id.rv_rv_ac_toolbar_title);
        mRvRvAcRv = (RecyclerView) findViewById(R.id.rv_rv_ac_rv);
    }

    public void getDataFromRv() {
        Intent intent = getIntent();
        url = intent.getStringExtra("urlID");
        title = intent.getStringExtra("name");
        mRvRvAcToolbarTitle.setText(title);
    }
}

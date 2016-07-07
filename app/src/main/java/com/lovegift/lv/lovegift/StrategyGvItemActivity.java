package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.lovegift.lv.adapter.StrategyGvItemAdapter;
import com.lovegift.lv.bean.StrategyGvItemBean;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

public class StrategyGvItemActivity extends AppCompatActivity {

    private Toolbar mStrategyGvAcToolbar;
    private TextView mStrategyGvAcToolbarTitle;
    private SwipeRefreshLayout mStrategyGvAcSwip;
    private RecyclerView mStrategyGvAcRecyclerview;
    private FloatingActionButton mStrategyGvAcFloatbar;

    private void assignViews() {
        mStrategyGvAcToolbar = (Toolbar) findViewById(R.id.strategy_gv_ac_toolbar);
        mStrategyGvAcToolbarTitle = (TextView) findViewById(R.id.strategy_gv_ac_toolbar_title);
        mStrategyGvAcSwip = (SwipeRefreshLayout) findViewById(R.id.strategy_gv_ac_swip);
        mStrategyGvAcRecyclerview = (RecyclerView) findViewById(R.id.strategy_gv_ac_recyclerview);
        mStrategyGvAcFloatbar = (FloatingActionButton) findViewById(R.id.strategy_gv_ac_floatbar);
    }


    private String url;
    //Gridview中的每个点击数据存储的bean
    private List<StrategyGvItemBean.DataBean.ItemsBean> gv_item_list = new ArrayList<>();
    private StrategyGvItemAdapter item_adapter;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_strategy_gv_item);

        assignViews();//初始化控件
        initToolbar();//toolbar有左上角返回键
        mStrategyGvAcSwip.setColorSchemeColors(Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW);//设置swiprefresh加载数据时候圈圈的渐变色
        getDataFromGv();//从之前的gridview适配器点击时间中传进来网络所需要的数据和标题
        initData();//从网络下载数据并且加载到StrategyGvItemBean中
        initAdapter();//设置recycler的适配器
        setListener();//设置下拉更新监听事件【其实是假的】，标题返回键，回到顶部【可以实现】
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
        setSupportActionBar(mStrategyGvAcToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void setListener() {

        mStrategyGvAcFloatbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrategyGvAcRecyclerview.smoothScrollToPosition(0);
            }
        });

        mStrategyGvAcSwip.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mStrategyGvAcSwip.setRefreshing(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mStrategyGvAcSwip.setRefreshing(false);
                    }
                },3000);
            }
        });
    }

    private void initAdapter() {
        mStrategyGvAcRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        item_adapter = new StrategyGvItemAdapter(this,gv_item_list);
        mStrategyGvAcRecyclerview.setAdapter(item_adapter);
        item_adapter.notifyDataSetChanged();
    }

    private void initData() {
        RequestParams request_item = new RequestParams(url);
        x.http().get(request_item, new Callback.CommonCallback<StrategyGvItemBean>() {
            @Override
            public void onSuccess(StrategyGvItemBean result) {
                gv_item_list.addAll(result.getData().getItems());
                item_adapter.notifyDataSetChanged();
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

    public void getDataFromGv() {
        Intent intent = getIntent();
        mStrategyGvAcToolbarTitle.setText(intent.getStringExtra("name"));
        url = intent.getStringExtra("urlId");
    }


}

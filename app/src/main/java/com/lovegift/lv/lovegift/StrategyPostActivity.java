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

import com.lovegift.lv.adapter.StrategyPostAdapter;
import com.lovegift.lv.bean.StrategyPostBean;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;

/**
 * 分类页面 攻略专题 横向滚动条点击事件Activity,信息由CategoryStrategyRecyclerViewTopAdapter中点击事件传值
 */
public class StrategyPostActivity extends AppCompatActivity {

    private Toolbar mStrategyPostToolbar;
    private TextView mStrategyPostToolbarTitle;
    private SwipeRefreshLayout mStrategyPostSwip;
    private RecyclerView mStrategyPostRecyclerview;
    private FloatingActionButton mStrategyPostFloatbar;

    private String title;
    private String url;
    private Handler handler = new Handler();
    //post页面json数据的集合
    private ArrayList<StrategyPostBean.DataBean.PostsBean> post_list = new ArrayList<>();
    //recyclerview的适配器
    private StrategyPostAdapter post_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_strategy_post);

        assignViews();//初始化控件
        initToolbar();//toolbar有左上角返回键
        mStrategyPostSwip.setColorSchemeColors(Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW);//设置swiprefresh加载数据时候圈圈的渐变色
        setListener();//设置下拉更新监听事件【其实是假的】，标题返回键，回到顶部【可以实现】
        getDataFromFragment();//从攻略的滑动滚动条适配器点击事件中获取到的数据，包括json数据下载网址和抬头标题
        iniData();//网络获取recyclerview的数据,网址为前一个页面recyclerview通过适配器 传过来，此页面中的url
                    //并且将数据加载到StrategyPostBean中
        initAdapter();
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
        setSupportActionBar(mStrategyPostToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initAdapter() {
        mStrategyPostRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        post_adapter = new StrategyPostAdapter(this,post_list);
        mStrategyPostRecyclerview.setAdapter(post_adapter);
        mStrategyPostRecyclerview.setFocusable(false);
        post_adapter.notifyDataSetChanged();
    }

    private void iniData() {
        RequestParams request_post = new RequestParams(url);
        x.http().get(request_post, new Callback.CommonCallback<StrategyPostBean>() {
            @Override
            public void onSuccess(StrategyPostBean result) {
                post_list.addAll(result.getData().getPosts());
                post_adapter.notifyDataSetChanged();
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

    private void setListener() {


        mStrategyPostFloatbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrategyPostRecyclerview.smoothScrollToPosition(0);
            }
        });

        mStrategyPostSwip.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mStrategyPostSwip.setRefreshing(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mStrategyPostSwip.setRefreshing(false);
                    }
                },3000);
            }
        });
    }

    public void getDataFromFragment() {
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        url = intent.getStringExtra("id");
        mStrategyPostToolbarTitle.setText(title);
    }

    private void assignViews() {
        mStrategyPostToolbar = (Toolbar) findViewById(R.id.strategy_post_toolbar);
        mStrategyPostToolbarTitle = (TextView) findViewById(R.id.strategy_post_toolbar_title);
        mStrategyPostSwip = (SwipeRefreshLayout) findViewById(R.id.strategy_post_swip);
        mStrategyPostRecyclerview = (RecyclerView) findViewById(R.id.strategy_post_recyclerview);
        mStrategyPostFloatbar = (FloatingActionButton) findViewById(R.id.strategy_post_floatbar);
    }

}

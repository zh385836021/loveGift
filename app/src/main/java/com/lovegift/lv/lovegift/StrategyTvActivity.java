package com.lovegift.lv.lovegift;

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

import com.lovegift.lv.adapter.StrategyTvRvAdapter;
import com.lovegift.lv.bean.StrategyTvBean;
import com.lovegift.lv.url.Urls;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

public class StrategyTvActivity extends AppCompatActivity {

    private Toolbar mStrategyTvToolbar;
    private TextView mStrategyTvToolbarTitle;
    private SwipeRefreshLayout mStrategyTvSwip;
    private RecyclerView mStrategyTvRv;
    private FloatingActionButton mStrategyTvFloatbar;

    private List<StrategyTvBean.DataBean.CollectionsBean> rv_list = new ArrayList<>();
    private StrategyTvRvAdapter rv_adapter;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_strategy_tv);

        assignViews();//初始化控件
        initToolbar();//toolbar有左上角返回键
        mStrategyTvSwip.setColorSchemeColors(Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW);//设置swiprefresh加载数据时候圈圈的渐变色
        initData();//下载所需要的网址和横向滚动条加载的一样,将数据存储到bean中
        initAdapter();//加载并且初始化适配器
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
        setSupportActionBar(mStrategyTvToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void setListener() {


        mStrategyTvFloatbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrategyTvRv.smoothScrollToPosition(0);
            }
        });

        mStrategyTvSwip.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mStrategyTvSwip.setRefreshing(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mStrategyTvSwip.setRefreshing(false);
                    }
                },3000);
            }
        });

    }

    private void initAdapter() {
        mStrategyTvRv.setLayoutManager(new LinearLayoutManager(this));
        rv_adapter = new StrategyTvRvAdapter(this,rv_list);
        mStrategyTvRv.setAdapter(rv_adapter);
        rv_adapter.notifyDataSetChanged();
    }

    private void initData() {
        final RequestParams request_rv = new RequestParams(Urls.CLASSIFY_SUB);
        x.http().get(request_rv, new Callback.CommonCallback<StrategyTvBean>() {
            @Override
            public void onSuccess(StrategyTvBean result) {
                rv_list.addAll(result.getData().getCollections());
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

    private void assignViews() {
        mStrategyTvToolbar = (Toolbar) findViewById(R.id.strategy_tv_toolbar);
        mStrategyTvToolbarTitle = (TextView) findViewById(R.id.strategy_tv_title);
        mStrategyTvSwip = (SwipeRefreshLayout) findViewById(R.id.strategy_tv_swip);
        mStrategyTvRv = (RecyclerView) findViewById(R.id.strategy_tv_rv);
        mStrategyTvFloatbar = (FloatingActionButton) findViewById(R.id.strategy_tv_floatbar);
    }
}

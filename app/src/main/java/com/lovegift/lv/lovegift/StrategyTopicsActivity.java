package com.lovegift.lv.lovegift;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.lovegift.lv.adapter.StrategyTopicAdapter;
import com.lovegift.lv.bean.StrategyTopicsBean;
import com.lovegift.lv.url.Urls;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.gmariotti.recyclerview.adapter.SlideInBottomAnimatorAdapter;

public class StrategyTopicsActivity extends AppCompatActivity {

    @Bind(R.id.stra_toolbar)
    Toolbar straToolbar;
    @Bind(R.id.stra_recycler)
    RecyclerView straRecycler;
    @Bind(R.id.stra_fab)
    FloatingActionButton straFab;

    private List<StrategyTopicsBean.DataBean.CollectionsBean>straList=new ArrayList<>();
    private StrategyTopicAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_strategy_topics);
        ButterKnife.bind(this);


        initToolBar();
        initData();

    }

    private void initToolBar() {
        setSupportActionBar(straToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    private void initData() {
        RequestParams glor_Params = new RequestParams(Urls.URL_STRATEGY_TOPICS);
        x.http().get(glor_Params, new Callback.CommonCallback<StrategyTopicsBean>() {
            @Override
            public void onSuccess(StrategyTopicsBean result) {
                if (result != null) {
                    List<StrategyTopicsBean.DataBean.CollectionsBean> collections = result.getData().getCollections();
                    straList.addAll(collections);
                    setAdapter();
                }
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

    private void setAdapter() {
        straRecycler.setLayoutManager(new LinearLayoutManager(this));
        adapter=new StrategyTopicAdapter(this,straList);
        straRecycler.setAdapter(new SlideInBottomAnimatorAdapter(adapter,straRecycler));

        straFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                straRecycler.smoothScrollToPosition(0);
            }
        });
    }
}

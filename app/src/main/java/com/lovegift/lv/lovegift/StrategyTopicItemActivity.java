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
import android.widget.TextView;

import com.lovegift.lv.adapter.StrategyTopicAdapter;
import com.lovegift.lv.adapter.StrategyTopicItemAdapter;
import com.lovegift.lv.bean.StrategyItemBean;
import com.lovegift.lv.url.Urls;
import com.lovegift.lv.utils.LogUtils;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.gmariotti.recyclerview.adapter.SlideInBottomAnimatorAdapter;
import retrofit2.http.Url;

public class StrategyTopicItemActivity extends AppCompatActivity {

    @Bind(R.id.stra_item_title)
    TextView straItemTitle;
    @Bind(R.id.stra_item_toolbar)
    Toolbar straItemToolbar;
    @Bind(R.id.stra_item_recycler)
    RecyclerView straItemRecycler;
    @Bind(R.id.stra_item_fab)
    FloatingActionButton straItemFab;

    private List<StrategyItemBean.DataBean.PostsBean> posts_List=new ArrayList<>();
    private int ids;
    private StrategyTopicItemAdapter adapter;
    private int targetId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_strategy_topic_item);
        ButterKnife.bind(this);

        initToolBar();
        initData();
        registerListener();
    }


    private void initToolBar() {
        String title = getIntent().getStringExtra("title");
        LogUtils.i("mtag","straItem title：："+title);

        straItemTitle.setText(title);

        setSupportActionBar(straItemToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initData() {
        ids = getIntent().getIntExtra("id",0);
        LogUtils.i("mtag","StrategyItemActiviy=="+ids);

        String url= Urls.strategySubUrl(ids);
        LogUtils.i("mtag","StrategyItemActiviy url::"+url);

        RequestParams params=new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<StrategyItemBean>() {
            @Override
            public void onSuccess(StrategyItemBean result) {
                if (result!=null) {
                    List<StrategyItemBean.DataBean.PostsBean> posts = result.getData().getPosts();
                    LogUtils.i("mtag","StrategyItemBean result"+posts.toString());
                    posts_List.addAll(posts);
                    targetId= result.getData().getId();
                    LogUtils.i("mtag","targetId++"+targetId);
                    setAdapter();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                LogUtils.e("erro","xutils erro"+ex.fillInStackTrace());
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
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


    private void setAdapter() {
        straItemRecycler.setLayoutManager(new LinearLayoutManager(this));
        adapter=new StrategyTopicItemAdapter(this,posts_List,ids,targetId);
        straItemRecycler.setAdapter(new SlideInBottomAnimatorAdapter(adapter,straItemRecycler));
        adapter.notifyDataSetChanged();
    }

    private void registerListener() {
        straItemFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                straItemRecycler.smoothScrollToPosition(0);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}

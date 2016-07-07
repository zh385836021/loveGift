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

import com.lovegift.lv.adapter.GloriousAdapter;
import com.lovegift.lv.bean.GloriousThingBean;
import com.lovegift.lv.url.Urls;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.gmariotti.recyclerview.adapter.SlideInBottomAnimatorAdapter;

public class GloriousThingActivity extends AppCompatActivity {

    @Bind(R.id.glor_recycler)
    RecyclerView glorRecycler;
    @Bind(R.id.glor_fab)
    FloatingActionButton glorFab;
    @Bind(R.id.glor_toolbar)
    Toolbar glorToolbar;
    private List<GloriousThingBean.DataBean.PostsBean> postList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_glorious_thing);
        ButterKnife.bind(this);

        initToolBar();
        initData();

    }

    private void initToolBar() {
        setSupportActionBar(glorToolbar);
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
        RequestParams glor_Params = new RequestParams(Urls.URL_GLORIOUS);
        x.http().get(glor_Params, new Callback.CommonCallback<GloriousThingBean>() {
            @Override
            public void onSuccess(GloriousThingBean result) {
                if (result != null) {
                    List<GloriousThingBean.DataBean.PostsBean> posts = result.getData().getPosts();
                    postList.addAll(posts);
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
        glorRecycler.setLayoutManager(new LinearLayoutManager(this));
        glorRecycler.setAdapter(new SlideInBottomAnimatorAdapter(new GloriousAdapter(this, postList), glorRecycler));

        glorFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glorRecycler.smoothScrollToPosition(0);
            }
        });
    }
}

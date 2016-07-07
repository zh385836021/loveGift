package com.lovegift.lv.lovegift;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.lovegift.lv.adapter.Collect_Adapter;
import com.lovegift.lv.bean.CollectBean;
import com.lovegift.lv.url.Urls;
import com.lovegift.lv.utils.ToastUtil;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.gmariotti.recyclerview.adapter.SlideInBottomAnimatorAdapter;

/**
 * PostBean :
 * cover_image_url
 * likes_count
 * title
 */
public class AdActivity extends AppCompatActivity {

    @Bind(R.id.collect_toolbar)
    Toolbar collectToolbar;
    @Bind(R.id.collect_recycler)
    RecyclerView collectRecycler;
    @Bind(R.id.collect_fab)
    FloatingActionButton fabBtn;

    private int targetId;
    private static final String TAG="AdActivity";
    private List<CollectBean.DataBean.PostsBean>collect_List=new ArrayList<>();
    private Collect_Adapter adapter;
    private int data_Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ad);
        ButterKnife.bind(this);

        initToolbar();
        initData();
        initListener();

    }

    private void initListener() {
        //TODO 点击悬浮按钮页面置顶
        fabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                collectRecycler.smoothScrollToPosition(0);
            }
        });
    }

    private void initToolbar() {
        setSupportActionBar(collectToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
    private void initData() {
        targetId = getIntent().getIntExtra("target_id",0);
        String url = Urls.URL_AD_COLLECTION(targetId);
            Log.i(TAG, "Ad targetId: "+url);
            if (url != null) {
                RequestParams params=new RequestParams(url);
                x.http().get(params, new Callback.CommonCallback<CollectBean>() {
                    @Override
                    public void onSuccess(CollectBean result) {
                        if (result!=null) {
                            List<CollectBean.DataBean.PostsBean> posts = result.getData().getPosts();
                            CollectBean.DataBean data=result.getData();
                            collect_List.addAll(posts);
                             data_Id=data.getId();
                            setAdapter();
                        }

                    }

                    @Override
                    public void onError(Throwable ex, boolean isOnCallback) {
                        ToastUtil.show(AdActivity.this,"网络异常,暂无数据,请稍后再试..");
                    }

                    @Override
                    public void onCancelled(CancelledException cex) {

                    }

                    @Override
                    public void onFinished() {

                    }
                });
            }
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
        collectRecycler.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Collect_Adapter(this,collect_List,data_Id,targetId);
        collectRecycler.setAdapter(new SlideInBottomAnimatorAdapter(adapter,collectRecycler));
        adapter.notifyDataSetChanged();
    }
}

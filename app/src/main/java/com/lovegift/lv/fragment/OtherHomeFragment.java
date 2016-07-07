package com.lovegift.lv.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lovegift.lv.adapter.HomeRecyclerAdapter;
import com.lovegift.lv.bean.HomeContentBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.gmariotti.recyclerview.adapter.SlideInBottomAnimatorAdapter;

/**
 * Created by Zane on 2016/6/21.
 */
public class OtherHomeFragment extends Fragment {

    private static final String CHANNEL_ID = "channel";
    private static final String ARG_NAME = "args";
    private String mChannelName;
    private int mChannelId;
    private String nextUrl=null;

    @Bind(R.id.other_frag_recycler)
    RecyclerView otherFragRecycler;
    @Bind(R.id.other_frag_swipeRefresh)
    SwipeRefreshLayout otherFragSwipeRefresh;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    private Handler handler=new Handler();
    private ArrayList<HomeContentBean.DataBean.ItemsBean> updataList = new ArrayList<>();
    private HomeRecyclerAdapter recyAdapter;
    private LinearLayoutManager manager;

    //TODO 单例
    public static OtherHomeFragment newInstance(String arg, int channelId) {
        OtherHomeFragment fragment = new OtherHomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, arg);
        args.putInt(CHANNEL_ID, channelId);
        fragment.setArguments(args);
        Log.i("mtag", "OtherHomeFrag newInstance: "+args.toString());
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        manager = new LinearLayoutManager(getActivity());
        if (getArguments()!=null) {
            mChannelName=getArguments().getString(ARG_NAME);
            mChannelId=getArguments().getInt(CHANNEL_ID);
            Log.i("mtag", "OtherHomeFrag onViewCreated: "+mChannelName+"............"+mChannelId);
            updataRecycler(Urls.homeTabUrl(mChannelId));
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_other_home_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initListener();

    }

    private void initAdapter() {
        otherFragRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyAdapter=new HomeRecyclerAdapter(getActivity(),updataList);
        otherFragRecycler.setAdapter(new SlideInBottomAnimatorAdapter(recyAdapter,otherFragRecycler));
        recyAdapter.notifyDataSetChanged();
    }


    boolean isRefresh=false;

    private void initData() {
        otherFragRecycler.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int lastVisibleItemPosition = manager.findLastVisibleItemPosition();
                int itemCount = manager.getItemCount();
                if (lastVisibleItemPosition + 1 == itemCount) {
                    //加载下一页内容
                    if (!isRefresh) {
                        updataRecycler(nextUrl);
                    }
                }
            }
        });

    }

    private void initListener() {

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otherFragRecycler.smoothScrollToPosition(0);
            }
        });

        //TODO swipeRefresh 刷新效果
        otherFragSwipeRefresh.setColorSchemeColors(Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW);
        otherFragSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        otherFragSwipeRefresh.setRefreshing(false);
                    }
                }, 3000);
            }
        });


    }


    private void updataRecycler(String url) {
        if (url != null) {
            Log.i("mtag", "updataRecycler url: "+url.toString());
            RequestParams updata_Params = new RequestParams(url);
            x.http().get(updata_Params, new Callback.CommonCallback<HomeContentBean>() {
                @Override
                public void onSuccess(HomeContentBean result) {
                    if (result != null) {
                        List<HomeContentBean.DataBean.ItemsBean> ItemsBean = result.getData().getItems();
                        Log.i("mtag", "updataRecycler: "+ItemsBean.toString());
                        updataList.addAll(ItemsBean);
                        nextUrl =result.getData().getPaging().getNext_url();
                        initAdapter();
                        initData();

                    }
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {
                   // Snackbar.make(otherFragRecycler,"网络出现异常，加载数据失败！",Snackbar.LENGTH_SHORT).show();
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
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}

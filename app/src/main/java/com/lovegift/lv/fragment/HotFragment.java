package com.lovegift.lv.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.lovegift.lv.BaseApp.MyApplication;
import com.lovegift.lv.adapter.HotRecyclerViewAdapter;
import com.lovegift.lv.bean.HotCommodityData;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.request.GiftRequest;
import com.lovegift.lv.url.Urls;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lin-pc on 2016/6/20.
 */
public class HotFragment extends Fragment {
    private static final String TAG = "HotFragment";

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;
    private ArrayList<HotCommodityData.DatasEntity.ItemsEntity.DataEntity> listCommodityData=new ArrayList<>();
    private HotRecyclerViewAdapter adapter;
    private String next_url;
    private boolean isLoadingMore = false;
    private GridLayoutManager gridLayoutManager;
    private RequestQueue queue;
    private Handler handler=new Handler();
    private ImageLoader loader;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        queue=Volley.newRequestQueue(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //使用ButterKnife初始化控件
        ButterKnife.bind(this, view);
        //设置刷新等待过程中，颜色的渐变
        swipeRefreshLayout.setColorSchemeColors(Color.RED,Color.YELLOW,Color.GREEN);
        // 加载RecyclerView数据
        initData();
        loader=((MyApplication)getActivity().getApplication()).getLoader();
        //设置RecyclerView适配器
        setRecyclerViewAdapter();
        //设置下拉刷新监听方法
        setRefreshListener();
    }

    private void initData() {
        GiftRequest<HotCommodityData> request=new GiftRequest<HotCommodityData>(
                HotCommodityData.class,
                Urls.URL_HOT,
                new Response.Listener<HotCommodityData>() {
                    @Override
                    public void onResponse(HotCommodityData response) {
                        next_url=response.data.paging.next_url;
                        ArrayList<HotCommodityData.DatasEntity.ItemsEntity> items= (ArrayList<HotCommodityData.DatasEntity.ItemsEntity>) response.data.items;
                        for (int i = 0; i <items.size() ; i++) {
                            listCommodityData.add(items.get(i).data);
                        }
                        setRecyclerViewAdapter();
                        LoadMoreListener();
                        recyclerView.setAdapter(adapter);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "下载数据失败！", Toast.LENGTH_SHORT).show();
                    }
                });
        queue.add(request);
    }

    private void setRefreshListener() {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(swipeRefreshLayout.isRefreshing()){
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    }
                },2000);
            }
        });
    }

    private void setRecyclerViewAdapter() {
        //设置recyclerView的布局为网格,列数为2
        gridLayoutManager =new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter=new HotRecyclerViewAdapter(getActivity(),listCommodityData,loader);
    }

    //设置上拉加载监听方法
    private void LoadMoreListener() {
        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int lastItem=gridLayoutManager.findLastVisibleItemPosition();
                if(dy>0&(lastItem==adapter.getItemCount()-1)){
                    if(!isLoadingMore){
                        loadMore();
                    }
                }
            }
        });
    }

    private void loadMore() {
        isLoadingMore=true;

        GiftRequest<HotCommodityData> request=new GiftRequest<HotCommodityData>(
                HotCommodityData.class,
                next_url,
                new Response.Listener<HotCommodityData>() {
                    @Override
                    public void onResponse(HotCommodityData response) {
                        next_url=response.data.paging.next_url;
                        ArrayList<HotCommodityData.DatasEntity.ItemsEntity> items= (ArrayList<HotCommodityData.DatasEntity.ItemsEntity>) response.data.items;
                        ArrayList<HotCommodityData.DatasEntity.ItemsEntity.DataEntity> temp=new ArrayList<HotCommodityData.DatasEntity.ItemsEntity.DataEntity>();
                        for (int i = 0; i <items.size() ; i++) {
                        temp.add(items.get(i).data);
                        }
                        listCommodityData.addAll(temp);
                        adapter.notifyDataSetChanged();
                        isLoadingMore=false;
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "下载数据失败！", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        queue.add(request);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}

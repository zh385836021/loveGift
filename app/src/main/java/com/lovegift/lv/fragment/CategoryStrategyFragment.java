package com.lovegift.lv.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


import com.lovegift.lv.adapter.CategoryStrategyRecyclerViewTopAdapter;
import com.lovegift.lv.adapter.StrategyGridviewAdapter;
import com.lovegift.lv.bean.CategoryStrateryRecyclerViewTopBean;
import com.lovegift.lv.bean.StratergyGridviewBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyTvActivity;
import com.lovegift.lv.url.Urls;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Xu on 2016/6/21 0021.
 */
public class CategoryStrategyFragment extends Fragment {


    private RecyclerView mCategoryStrategyRecyclerviewTop;
    private TextView mCategoryStrategyTextview;
    private TextView mStrategyTypeTv;
    private GridView mStrategyTypeGv;
    private TextView mStrategyStyleTv;
    private GridView mStrategyStyleGv;
    private TextView mStrategyCharacterTv;
    private GridView mStrategyCharacterGv;

    //recyclerview中的数据集合，包括横向滚动条和图片点击跳转页面数据
    private ArrayList<CategoryStrateryRecyclerViewTopBean.DataBean.CollectionsBean> recyclerview_top_list = new ArrayList<>();
    //第一个gridview 品类中的数据集合
    private ArrayList<StratergyGridviewBean.DataBean.ChannelGroupsBean.ChannelsBean> gridview_type_list = new ArrayList<>();
    //第二个gridview 风格中的数据集合
    private ArrayList<StratergyGridviewBean.DataBean.ChannelGroupsBean.ChannelsBean> gridview_style_list = new ArrayList<>();
    //第三个gridview 对象中的数据集合
    private ArrayList<StratergyGridviewBean.DataBean.ChannelGroupsBean.ChannelsBean> gridview_character_list = new ArrayList<>();
    private String TAG = "mtag";
    //横向滚动条的适配器
    private CategoryStrategyRecyclerViewTopAdapter recycler_top_adapter;
    //品类适配器
    private StrategyGridviewAdapter type_adapter;
    //风格适配器
    private StrategyGridviewAdapter style_adapter;
    //对象适配器
    private StrategyGridviewAdapter character_adapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category_strategy, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        assignViews(view);//初始化控件

        initRecycler();//设置查看全部的recyclerview为横向滚动
        initRecyclerViewData();//下载recyclerview中所需的数据，并且加载到CategoryStrategyViewpagerBean中
        initGridViewData();//下载下方 三个gridview中的数据并且加载到StratergyGridviewBean中
        initAdapter();//设置recyclerview 的适配器,三个gridview的适配器
        setListener();// 设置 加载更多 tv的点击事件
    }

    private void setListener() {
        mCategoryStrategyTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), StrategyTvActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initAdapter() {
        recycler_top_adapter = new CategoryStrategyRecyclerViewTopAdapter(getActivity(),recyclerview_top_list);
        mCategoryStrategyRecyclerviewTop.setAdapter(recycler_top_adapter);
        recycler_top_adapter.notifyDataSetChanged();

        type_adapter = new StrategyGridviewAdapter(getActivity(),gridview_type_list);
        mStrategyTypeGv.setAdapter(type_adapter);
        type_adapter.notifyDataSetChanged();

        style_adapter = new StrategyGridviewAdapter(getActivity(),gridview_style_list);
        mStrategyStyleGv.setAdapter(style_adapter);
        style_adapter.notifyDataSetChanged();

        character_adapter = new StrategyGridviewAdapter(getActivity(),gridview_character_list);
        mStrategyCharacterGv.setAdapter(character_adapter);
        character_adapter.notifyDataSetChanged();

        mStrategyStyleGv.setFocusable(false);
        mStrategyCharacterGv.setFocusable(false);
    }

    private void initGridViewData() {
        //下载第一个gridview 品类数据
        RequestParams request_gridview_type = new RequestParams(Urls.CLASSIFY_CHANNELS);
        x.http().get(request_gridview_type, new Callback.CommonCallback<StratergyGridviewBean>() {
            @Override
            public void onSuccess(StratergyGridviewBean result) {
                Log.i(TAG, "onSuccess: "+result.toString());
                gridview_type_list.addAll(result.getData().getChannel_groups().get(0).getChannels());
                type_adapter.notifyDataSetChanged();
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

        //下载第二个gridview 风格中的数据
        RequestParams request_gridview_style = new RequestParams(Urls.CLASSIFY_CHANNELS);
        x.http().get(request_gridview_style, new Callback.CommonCallback<StratergyGridviewBean>() {
            @Override
            public void onSuccess(StratergyGridviewBean result) {
                Log.i(TAG, "onSuccess: "+result.toString());
                gridview_style_list.addAll(result.getData().getChannel_groups().get(1).getChannels());
                style_adapter.notifyDataSetChanged();
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

        //下载第三个gridview 对象中的数据

        RequestParams request_gridview_character = new RequestParams(Urls.CLASSIFY_CHANNELS);
        x.http().get(request_gridview_character, new Callback.CommonCallback<StratergyGridviewBean>() {
            @Override
            public void onSuccess(StratergyGridviewBean result) {
                Log.i(TAG, "onSuccess: "+result.toString());
                gridview_character_list.addAll(result.getData().getChannel_groups().get(2).getChannels());
                character_adapter.notifyDataSetChanged();
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

    private void initRecyclerViewData() {
        //获取数据并且下载存储到bean中
        RequestParams request_recycler_top = new RequestParams(Urls.CLASSIFY_SUB);
        x.http().get(request_recycler_top, new Callback.CommonCallback<CategoryStrateryRecyclerViewTopBean>() {
            @Override
            public void onSuccess(CategoryStrateryRecyclerViewTopBean result) {
                Log.i(TAG, "onSuccess: "+result.toString());
                recyclerview_top_list.addAll(result.getData().getCollections());
                recycler_top_adapter.notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(getActivity(), "攻略大全滚动获取失败", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private void initRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mCategoryStrategyRecyclerviewTop.setLayoutManager(linearLayoutManager);
    }

    private void assignViews(View v) {
        mCategoryStrategyRecyclerviewTop = (RecyclerView) v.findViewById(R.id.category_strategy_recyclerview_top);
        mCategoryStrategyTextview = (TextView) v.findViewById(R.id.category_strategy_textview);
        mStrategyTypeTv = (TextView) v.findViewById(R.id.strategy_type_tv);
        mStrategyTypeGv = (GridView) v.findViewById(R.id.strategy_type_gv);
        mStrategyStyleTv = (TextView) v.findViewById(R.id.strategy_style_tv);
        mStrategyStyleGv = (GridView) v.findViewById(R.id.strategy_style_gv);
        mStrategyCharacterTv = (TextView) v.findViewById(R.id.strategy_character_tv);
        mStrategyCharacterGv = (GridView) v.findViewById(R.id.strategy_character_gv);
    }
}

package com.lovegift.lv.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.lovegift.lv.adapter.CategoryGiftLvAdapter;
import com.lovegift.lv.adapter.CategoryGiftRvAdapter;
import com.lovegift.lv.bean.CategoryGiftBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xu on 2016/6/21 0021.
 */
public class CategoryGiftFragment extends Fragment {

    private ListView mCategoryGiftLv;
    private RecyclerView mCategoryGiftRv;
    private ScrollView gift_lv_sv;
    //gift主页面中数据的集合
    private List<CategoryGiftBean.DataBean.CategoriesBean> gift_list = new ArrayList<>();
    //listview适配器
    private CategoryGiftLvAdapter lv_adapter;
    //recyclerview适配器
    private CategoryGiftRvAdapter rv_adapter;
    private View lastView;
    private boolean isRight;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_category_gift, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        assignViews(view);//初始化部件
        initData();//gift中数据的下载
        initAdapter();//listview适配器的初始化
        setListener();//设置listview，recyclerview滑动滚动监听
    }

    private void setListener() {
        //listview滑动监听和recyclerview的滚动到相关位置
        mCategoryGiftLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (lastView != null) {
                    TextView tv = (TextView) lastView.findViewById(R.id.gift_lv_tv);//获取到lv中的每个tv对象
                    tv.setTextColor(Color.parseColor("#000000"));
                    mCategoryGiftRv.smoothScrollToPosition(position);
                }
                TextView tv = (TextView) view.findViewById(R.id.gift_lv_tv);//获取到lv中的每个tv对象
                tv.setTextColor(Color.parseColor("#F84E4E"));

                lastView = view;
            }
        });
        //recyclerview 的滑动监听

        mCategoryGiftRv.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                switch (newState) {
                    case RecyclerView.SCROLL_STATE_IDLE:
                        isRight = false;
                        break;
                    case RecyclerView.SCROLL_STATE_DRAGGING:
                        isRight = true;
                        break;
                    case RecyclerView.SCROLL_STATE_SETTLING:

                        break;
                    default:

                        break;
                }

            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (isRight) {
                    if (lastView != null) {
                        TextView tv = (TextView) lastView.findViewById(R.id.gift_lv_tv);//获取到lv中的每个tv对象
                        tv.setTextColor(Color.parseColor("#000000"));
                    }
                    int position = manager.findFirstVisibleItemPosition();

                    View v = mCategoryGiftLv.getChildAt(position);
                    TextView tv = (TextView) v.findViewById(R.id.gift_lv_tv);//获取到lv中的每个tv对象
                    tv.setTextColor(Color.parseColor("#F84E4E"));
                    int tmpheight = v.getHeight();
                    if (dy > 0 && position == (int) mCategoryGiftLv.getCount() / 2) {
                        gift_lv_sv.smoothScrollTo(0, tmpheight * 20);
//                    mCategoryGiftLv.setSelectionFromTop(position,tmpheight*20);
                    } else if (dy < 0 && position == (int) mCategoryGiftLv.getCount() / 2) {
                        gift_lv_sv.smoothScrollTo(0, -tmpheight * 20);
//                    mCategoryGiftLv.setSelectionFromTop(position,-tmpheight*20);
                    }
//                mCategoryGiftLv.smoothScrollToPosition(position);
                    lastView = v;
                }
            }

        });

    }

    private void initAdapter() {
        //listview中适配器操作
        lv_adapter = new CategoryGiftLvAdapter(getActivity(), gift_list);
        mCategoryGiftLv.setAdapter(lv_adapter);
        lv_adapter.notifyDataSetChanged();

        //recyclerview中适配器
        mCategoryGiftRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_adapter = new CategoryGiftRvAdapter(getActivity(), gift_list);
        mCategoryGiftRv.setAdapter(rv_adapter);
        rv_adapter.notifyDataSetChanged();
    }

    private void initData() {
        //gift中数据的下载
        RequestParams request_gift = new RequestParams(Urls.CLASSIFY_GIFT);
        x.http().get(request_gift, new Callback.CommonCallback<CategoryGiftBean>() {
            @Override
            public void onSuccess(CategoryGiftBean result) {
                gift_list.addAll(result.getData().getCategories());
                lv_adapter.notifyDataSetChanged();
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

    private void assignViews(View v) {
        mCategoryGiftLv = (ListView) v.findViewById(R.id.category_gift_lv);
        mCategoryGiftRv = (RecyclerView) v.findViewById(R.id.category_gift_rv);
        gift_lv_sv = (ScrollView) v.findViewById(R.id.gift_lv_sv);
    }
}

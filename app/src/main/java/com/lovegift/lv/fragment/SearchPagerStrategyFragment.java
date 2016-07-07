package com.lovegift.lv.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.lovegift.lv.BaseApp.MyApplication;
import com.lovegift.lv.adapter.SearchPagerStrategyAdapter;
import com.lovegift.lv.bean.SearchStrategyBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.request.GiftRequest;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin-pc on 2016/6/25.
 */
public class SearchPagerStrategyFragment extends Fragment {
    private SwipeRefreshLayout sfresh;
    private RecyclerView strategy_rcv;
    private RequestQueue queue;
    private ImageLoader loader;
    private List<SearchStrategyBean.DataBean.PostsBean> strategyList;
    private String word;
    private String url;
    private SearchPagerStrategyAdapter adapter;
    private Handler handler = new Handler();
    private static Bundle bundle;

    public static SearchPagerStrategyFragment getInstance(String defaultURL, String word) {
        SearchPagerStrategyFragment fragment = new SearchPagerStrategyFragment();
        bundle = new Bundle();
        bundle.putString("defaultURL", defaultURL);
        bundle.putString("word", word);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        queue = Volley.newRequestQueue(context);
        loader = ((MyApplication) getActivity().getApplication()).getLoader();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();

        String s = bundle.getString("word");
        word = s.trim();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_strategy, container, false);
        initView(view);
        setData();
        initAdapter();
        setFreshListener();
        return view;
    }

    private void setFreshListener() {
        sfresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                sfresh.setRefreshing(true);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        sfresh.setRefreshing(false);
                    }
                }, 2000);
            }
        });
    }

    private void initAdapter() {
        adapter = new SearchPagerStrategyAdapter(getActivity(), strategyList, loader);
        strategy_rcv.setAdapter(adapter);
    }

    private void setData() {
        strategyList = new ArrayList<>();
        try {
            String encode = URLEncoder.encode(word, "utf-8");
            url = bundle.getString("defaultURL") + encode;
            Log.i("123123", "strategy: " + url);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        GiftRequest<SearchStrategyBean> strategyRequset = new GiftRequest<>(
                SearchStrategyBean.class,
                url,
                new Response.Listener<SearchStrategyBean>() {
                    @Override
                    public void onResponse(SearchStrategyBean response) {
                        strategyList.addAll(response.getData().getPosts());
                        adapter.notifyDataSetChanged();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "网络错误！", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        queue.add(strategyRequset);
    }

    private void initView(View view) {
        sfresh = (SwipeRefreshLayout) view.findViewById(R.id.sfresh);
        strategy_rcv = (RecyclerView) view.findViewById(R.id.strategy_rcv);
        strategy_rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}

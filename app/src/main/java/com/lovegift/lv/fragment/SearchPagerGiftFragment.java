package com.lovegift.lv.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
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
import com.lovegift.lv.adapter.SearchPagerGiftAdapter;
import com.lovegift.lv.bean.SearchGiftBean;
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
public class SearchPagerGiftFragment extends Fragment {
    private RequestQueue queue;
    private SwipeRefreshLayout sfresh;
    private RecyclerView gift_rcv;
    private List<SearchGiftBean.DataBean.ItemsBean> giftList;
    private String word;
    private SearchPagerGiftAdapter adapter;
    private String url;
    private ImageLoader loader;
    private Handler handler = new Handler();
    private static Bundle bundle;

    public static SearchPagerGiftFragment getInstance(String defaultURL, String word) {
        SearchPagerGiftFragment fragment = new SearchPagerGiftFragment();
        bundle = new Bundle();
        bundle.putString("defaultURL", defaultURL);
        bundle.putString("word", word);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        queue = Volley.newRequestQueue(getActivity());
        loader = ((MyApplication) getActivity().getApplication()).getLoader();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        Log.i("123123", "onCreate: " + bundle.getString("word"));
        String s = bundle.getString("word");
        Log.i("123123", "pagerGift_word: " + s);
        word = s.trim();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gift, container, false);
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
        adapter = new SearchPagerGiftAdapter(getActivity(), giftList, loader);
        gift_rcv.setAdapter(adapter);
    }

    private void setData() {
        giftList = new ArrayList<>();

        try {
            String encode = URLEncoder.encode(word, "utf-8");
            url = bundle.getString("defaultURL") + encode;
            Log.i("123123", "setData: "+url);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        final GiftRequest<SearchGiftBean> giftRequest = new GiftRequest<>(
                SearchGiftBean.class,
                url,
                new Response.Listener<SearchGiftBean>() {
                    @Override
                    public void onResponse(SearchGiftBean response) {
                        giftList.addAll(response.getData().getItems());
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
        queue.add(giftRequest);
    }

    private void initView(View view) {
        sfresh = (SwipeRefreshLayout) view.findViewById(R.id.sfresh);
        gift_rcv = (RecyclerView) view.findViewById(R.id.gift_rcv);
        gift_rcv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
    }
}

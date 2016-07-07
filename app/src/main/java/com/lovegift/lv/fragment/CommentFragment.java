package com.lovegift.lv.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.lovegift.lv.adapter.CommentRecyclerViewAdapter;
import com.lovegift.lv.bean.Comments;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.request.GiftRequest;
import com.lovegift.lv.url.Urls;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/6/22.
 */
public class CommentFragment extends Fragment {
    @Bind(R.id.rcv_comment)
    RecyclerView rcvComment;
    private int commodityId ;
    private ArrayList<Comments.DataEntity.CommentsEntity> commentsList=new ArrayList<>();
    private CommentRecyclerViewAdapter adapter;
    private RequestQueue queue;
    private String next_url;
    private ImageLoader loader;


    public static CommentFragment getInstance(int commodityId) {
        CommentFragment commentFragment=new CommentFragment();
        Bundle args=new Bundle();
        args.putInt("commodityId",commodityId);
        commentFragment.setArguments(args);
        return commentFragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null){
            commodityId=getArguments().getInt("commodityId");
        }
        queue= Volley.newRequestQueue(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comment, container, false);
        //使用ButterKnife初始化控件
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
    }

    private void initData() {
        String url= Urls.commentUrl(commodityId);
        GiftRequest<Comments> request=new GiftRequest<Comments>(
                Comments.class,
                url,
                new Response.Listener<Comments>() {
                    @Override
                    public void onResponse(Comments response) {
                        next_url = response.data.paging.next_url;//下一页的url
                        commentsList = response.data.comments;
                        rcvComment.setLayoutManager(new LinearLayoutManager(getActivity()));
                        adapter = new CommentRecyclerViewAdapter(getActivity(),commentsList,loader);
                        rcvComment.setAdapter(adapter);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "网络下载数据失败！！！", Toast.LENGTH_SHORT).show();
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

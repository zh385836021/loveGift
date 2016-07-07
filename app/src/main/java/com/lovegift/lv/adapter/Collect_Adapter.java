package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.CollectBean;
import com.lovegift.lv.lovegift.CollectionItemActivity;
import com.lovegift.lv.lovegift.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Zane on 2016/6/24.
 */

public class Collect_Adapter extends RecyclerView.Adapter<Collect_Adapter.CollectHolder> {

    private LayoutInflater inflater;
    private List<CollectBean.DataBean.PostsBean> collect_List;
    private int dataBean_id;
    private Context context;
    private int targetId;

    public Collect_Adapter(Context context, List<CollectBean.DataBean.PostsBean> collect_List, int dataBean_id, int targetId) {
        this.context = context;
        this.collect_List = collect_List;
        this.targetId = targetId;
        this.dataBean_id = dataBean_id;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CollectHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new CollectHolder(inflater.inflate(R.layout.item_collect_recycler, parent, false));
    }

    @Override
    public void onBindViewHolder(CollectHolder holder, final int position) {
        if (targetId == dataBean_id) {
            //TODO 设置标题
            holder.collectTvTitle.setText(collect_List.get(position).getTitle());

            //TODO 设置背景图片
            holder.collectIvBg.setImageURI(collect_List.get(position).getCover_image_url());

            //TODO 设置点赞数
            if (holder.collectCbLiked.isChecked()) {
                holder.collectLikedNum.setText(collect_List.get(position).getLikes_count() + 1);
            }
            holder.collectLikedNum.setText(collect_List.get(position).getLikes_count() + "");
        } else {
            throw new IllegalArgumentException("targetId与dataBean_id不匹配");
        }

        holder.collectIvBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("webpUrl", collect_List.get(position).getCover_webp_url());
                intent.putExtra("title", collect_List.get(position).getTitle());
                intent.putExtra("contentUrl", collect_List.get(position).getContent_url());
                intent.setClass(context, CollectionItemActivity.class);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return collect_List == null ? 0 : collect_List.size();
    }

    class CollectHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.collect_iv_bg)
        SimpleDraweeView collectIvBg;
        @Bind(R.id.collect_tv_title)
        TextView collectTvTitle;
        @Bind(R.id.collect_cb_liked)
        CheckBox collectCbLiked;
        @Bind(R.id.collect_liked_num)
        TextView collectLikedNum;

        public CollectHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

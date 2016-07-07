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
import com.lovegift.lv.bean.GloriousThingBean;
import com.lovegift.lv.lovegift.GloriousThingItemActivity;
import com.lovegift.lv.lovegift.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Zane on 2016/6/24.
 */
public class GloriousAdapter extends RecyclerView.Adapter<GloriousAdapter.GlorHolder> {

    private LayoutInflater inflater;
    private List<GloriousThingBean.DataBean.PostsBean> list;
    private Context context;

    public GloriousAdapter(Context context, List<GloriousThingBean.DataBean.PostsBean> list) {
        inflater = LayoutInflater.from(context);
        this.list = list;
        this.context = context;

    }

    @Override
    public GlorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new GlorHolder(inflater.inflate(R.layout.item_glor_thing, parent, false));
    }

    @Override
    public void onBindViewHolder(GlorHolder holder, final int position) {
        holder.glorIvBg.setImageURI(list.get(position).getCover_image_url());

        holder.glorLikedNum.setText(list.get(position).getLikes_count()+"");

        holder.glorTvTitle.setText(list.get(position).getTitle());

        holder.glorIvBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("title",list.get(position).getTitle());
                intent.putExtra("webpUrl", list.get(position).getCover_webp_url());
                intent.putExtra("contentUrl",list.get(position).getContent_url());
                intent.setClass(context, GloriousThingItemActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class GlorHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.glor_iv_bg)
        SimpleDraweeView glorIvBg;
        @Bind(R.id.glor_tv_title)
        TextView glorTvTitle;
        @Bind(R.id.glor_cb_liked)
        CheckBox glorCbLiked;
        @Bind(R.id.glor_liked_num)
        TextView glorLikedNum;
        public GlorHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

}

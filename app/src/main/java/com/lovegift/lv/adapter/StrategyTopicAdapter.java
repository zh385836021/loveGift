package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.StrategyTopicsBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyTopicItemActivity;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Zane on 2016/6/24.
 */
public class StrategyTopicAdapter extends RecyclerView.Adapter<StrategyTopicAdapter.StrategyHolder> {

    private LayoutInflater inflater;
    private List<StrategyTopicsBean.DataBean.CollectionsBean> straList;
    private Context context;

    public StrategyTopicAdapter(Context context, List<StrategyTopicsBean.DataBean.CollectionsBean> straList) {
        inflater = LayoutInflater.from(context);
        this.straList = straList;
        this.context = context;

    }

    @Override
    public StrategyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new StrategyHolder(inflater.inflate(R.layout.item_stra_topic, parent, false));
    }

    @Override
    public void onBindViewHolder(StrategyHolder holder, final int position) {
        holder.straIvBg.setImageURI(straList.get(position).getCover_image_url());

        holder.straMainTitle.setText(straList.get(position).getTitle());

        holder.straMainTitle.setText(straList.get(position).getTitle());

        holder.straSubTitle.setText(straList.get(position).getSubtitle());

        //TODO 点击事件

        holder.straIvBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("id",straList.get(position).getId());
                intent.putExtra("title",straList.get(position).getTitle());
                intent.setClass(context, StrategyTopicItemActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return straList == null ? 0 : straList.size();
    }

    class StrategyHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.stra_iv_bg)
        SimpleDraweeView straIvBg;
        @Bind(R.id.stra_main_title)
        TextView straMainTitle;
        @Bind(R.id.stra_sub_title)
        TextView straSubTitle;

        public StrategyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

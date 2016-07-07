package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.StrategyItemBean;
import com.lovegift.lv.lovegift.HomeRecyclerItemActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyTopicItemContentActivity;
import com.lovegift.lv.utils.LogUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Zane on 2016/6/27.
 */
public class StrategyTopicItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private int id;
    private List<StrategyItemBean.DataBean.PostsBean> pos_List;
    private int ids;


    public StrategyTopicItemAdapter(Context context, List<StrategyItemBean.DataBean.PostsBean> pos_List, int id,int ids) {
        this.id = id;
        this.ids=ids;
        this.pos_List = pos_List;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyStrategyTopicItemHolder(inflater.inflate(R.layout.item_stra_topic_items, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        LogUtils.i("mtag","StrategyItemAdapter==="+pos_List.get(position).toString());
        final String url =pos_List.get(position).getCover_image_url();
        final int count = pos_List.get(position).getLikes_count();

        LogUtils.i("idid","id=="+id+"---------"+ids);
        if (id==ids) {
            //TODO 图片
            ((MyStrategyTopicItemHolder) holder).straItemIvBg.setImageURI(url);

            LogUtils.i("mtag","StrategyItemAdapter ImageURI----:"+url);

            //TODO 标题
            ((MyStrategyTopicItemHolder) holder).straItemTvTitle.setText(pos_List.get(position).getTitle());
            LogUtils.i("mtag","StrategyItemAdapter straItemTvTitle -----:"+pos_List.get(position).getTitle());

        //TODO 图片监听
        ((MyStrategyTopicItemHolder) holder).straItemIvBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("webpUrl", pos_List.get(position).getCover_webp_url());
                intent.putExtra("title", pos_List.get(position).getTitle());
                intent.putExtra("contentUrl", pos_List.get(position).getContent_url());
                intent.setClass(context, StrategyTopicItemContentActivity.class);
                context.startActivity(intent);
            }
        });


            ((MyStrategyTopicItemHolder) holder).straItemCbLiked.setChecked(pos_List.get(position).isLiked());
            ((MyStrategyTopicItemHolder) holder).straItemLikedNum.setText(count + "");

            //TODO 喜爱
            ((MyStrategyTopicItemHolder) holder).straItemCbLiked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    int num = count;
                    if (isChecked) {
                        ((MyStrategyTopicItemHolder) holder).straItemLikedNum.setText(String.valueOf(++num));
                    } else {
                        ((MyStrategyTopicItemHolder) holder).straItemLikedNum.setText(String.valueOf(num));
                    }
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return pos_List==null?0:pos_List.size();
    }

    class MyStrategyTopicItemHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.stra_item_iv_bg)
        SimpleDraweeView straItemIvBg;
        @Bind(R.id.stra_item_tv_title)
        TextView straItemTvTitle;
        @Bind(R.id.stra_item_cb_liked)
        CheckBox straItemCbLiked;
        @Bind(R.id.stra_item_liked_num)
        TextView straItemLikedNum;

        public MyStrategyTopicItemHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}

package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.HomeContentBean;
import com.lovegift.lv.lovegift.CollectionItemActivity;
import com.lovegift.lv.lovegift.HomeRecyclerItemActivity;
import com.lovegift.lv.lovegift.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Zane on 2016/6/20.
 */
public class HomeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private LayoutInflater inflater;
    private Context context;
    private ArrayList<HomeContentBean.DataBean.ItemsBean> data_List;

    public HomeRecyclerAdapter(Context context, ArrayList<HomeContentBean.DataBean.ItemsBean> data_List) {
        this.context = context;
        this.data_List = data_List;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new MyHolder(inflater.inflate(R.layout.layout_home_recy_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        HomeContentBean.DataBean.ItemsBean items=data_List.get(position);
        if (holder instanceof MyHolder) {
            final String url=items.getCover_image_url();
            final int count =data_List.get(position).getLikes_count();

            //TODO 图片
           ((MyHolder) holder).ivHomeRecyBg.setImageURI(url);

            //TODO 标题
            ((MyHolder) holder).recy_title.setText(data_List.get(position).getTitle());

            //TODO 图片监听
            ((MyHolder) holder).ivHomeRecyBg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent();
                    intent.putExtra("webpUrl", data_List.get(position).getCover_webp_url());
                    intent.putExtra("title", data_List.get(position).getTitle());
                    intent.putExtra("contentUrl", data_List.get(position).getContent_url());
                    intent.setClass(context, HomeRecyclerItemActivity.class);
                    context.startActivity(intent);
                }
            });


            ((MyHolder) holder).checkBoxLiked.setChecked(data_List.get(position).isLiked());
            ((MyHolder) holder).tvLikedNum.setText(count+"");

            //TODO 喜爱
            ((MyHolder) holder).checkBoxLiked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    int num=count;
                    if(isChecked){
                        ((MyHolder) holder).tvLikedNum.setText(String.valueOf(++num));
                    }else{
                        ((MyHolder) holder).tvLikedNum.setText(String .valueOf(num));
                    }
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return data_List == null ? 0 : data_List.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.iv_home_recy_bg)
        SimpleDraweeView ivHomeRecyBg;
        @Bind(R.id.checkBox_liked)
        CheckBox checkBoxLiked;
        @Bind(R.id.tv_liked_num)
        TextView tvLikedNum;
        @Bind(R.id.tv_home_recy_title)
        TextView recy_title;

        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}

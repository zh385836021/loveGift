package com.lovegift.lv.adapter;

/**
 * Created by Administrator on 2016/6/22 0022.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.StrategyTvBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyPostActivity;
import com.lovegift.lv.url.Urls;

import java.util.List;

/**
 * 攻略中加载更多点击事件跳转的recyclerview的适配器
 */
public class StrategyTvRvAdapter extends RecyclerView.Adapter<StrategyTvRvAdapter.MyHolder>{

    private List<StrategyTvBean.DataBean.CollectionsBean> data;
    private Context context;

    public StrategyTvRvAdapter(Context context,List<StrategyTvBean.DataBean.CollectionsBean> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.strategy_tv_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.tvtop.setText(data.get(position).getTitle());
        holder.tvbottom.setText(data.get(position).getSubtitle());
        holder.sdv.setImageURI(data.get(position).getCover_image_url());

        holder.sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,StrategyPostActivity.class);
                intent.putExtra("title",data.get(position).getTitle());
                intent.putExtra("id", Urls.strategySubUrl(data.get(position).getId()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size()==0?0:data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        private SimpleDraweeView sdv;
        private TextView tvtop,tvbottom;

        public MyHolder(View itemView) {
            super(itemView);

            sdv = (SimpleDraweeView) itemView.findViewById(R.id.strategy_tv_rv_sdv);
            tvtop = (TextView) itemView.findViewById(R.id.strategy_tv_rv_tvtop);
            tvbottom = (TextView) itemView.findViewById(R.id.strategy_tv_rv_tvbottom);
        }
    }

}

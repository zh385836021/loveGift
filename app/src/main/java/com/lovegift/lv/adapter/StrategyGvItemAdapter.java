package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.StrategyGvItemBean;
import com.lovegift.lv.lovegift.PostRvItemActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyGvItemPostActivity;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Xu on 2016/6/22 0022.
 */
public class StrategyGvItemAdapter extends RecyclerView.Adapter<StrategyGvItemAdapter.MyHolder>{

    private List<StrategyGvItemBean.DataBean.ItemsBean> data;
    private Context context;

    public StrategyGvItemAdapter(Context context,List<StrategyGvItemBean.DataBean.ItemsBean> data){
        this.context = context;
        this.data =data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.strategy_gv_item_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.tv.setText(data.get(position).getTitle());
        holder.sdv.setImageURI(data.get(position).getCover_image_url());

        final String img_url = data.get(position).getCover_image_url();//跳转页面后抬头图片
        final String title = data.get(position).getTitle();//跳转页面后图片下方的标题
        final String short_title = data.get(position).getShort_title();//折叠上toolbar的标题
        final String content_url = data.get(position).getContent_url();//跳转页面后文字网页

        holder.sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击事件 继续跳转页面
                Intent intent = new Intent(context, StrategyGvItemPostActivity.class);//跳转到每一个item的详细页面
//                Toast.makeText(context, "dianjile ", Toast.LENGTH_SHORT).show();
                intent.putExtra("img_url",img_url);
                intent.putExtra("title",title);
                intent.putExtra("short_title",short_title);
                intent.putExtra("content_url",content_url);
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
        private TextView tv;

        public MyHolder(View itemView) {
            super(itemView);

            sdv = (SimpleDraweeView) itemView.findViewById(R.id.strategy_gv_item_rv_sdv);
            tv = (TextView) itemView.findViewById(R.id.strategy_gv_item_rv_tv);
        }
    }
}

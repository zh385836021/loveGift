package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.CategoryGiftBean;
import com.lovegift.lv.lovegift.GiftRvRvItemActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;

import java.util.List;

/**
 * Created by Administrator on 2016/6/23 0023.
 */
public class CategoryGiftRvRvAdapter extends RecyclerView.Adapter<CategoryGiftRvRvAdapter.MyHolder> {

    private List<CategoryGiftBean.DataBean.CategoriesBean.SubcategoriesBean> data;
    private Context context;

    public CategoryGiftRvRvAdapter(Context context,List<CategoryGiftBean.DataBean.CategoriesBean.SubcategoriesBean> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.gift_rv_gv,parent,false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.tv.setText(data.get(position).getName());
        holder.sdv.setImageURI(data.get(position).getIcon_url());

        holder.sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GiftRvRvItemActivity.class);
                intent.putExtra("urlID", Urls.giftRecycUrl(data.get(position).getId()));
                intent.putExtra("name",data.get(position).getName());
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
            sdv = (SimpleDraweeView) itemView.findViewById(R.id.gift_rv_gv_sdv);
            tv = (TextView) itemView.findViewById(R.id.gift_rv_gv_tv);
        }
    }

}

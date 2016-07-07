package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.GiftRvRvItemBean;
import com.lovegift.lv.lovegift.CommodityActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;

import java.util.List;

/**
 * Created by Xu on 2016/6/23 0023.
 */
public class GiftRvRvItemRvAdapter extends RecyclerView.Adapter<GiftRvRvItemRvAdapter.MyHolder> {

    private List<GiftRvRvItemBean.DataBean.ItemsBean> data;
    private Context context;

    public GiftRvRvItemRvAdapter(Context context,List<GiftRvRvItemBean.DataBean.ItemsBean> data){
        this.context = context;
        this.data= data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.rv_item_post,parent,false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.name.setText(data.get(position).getName());
        holder.price.setText(data.get(position).getPrice()+"");
        holder.count.setText(data.get(position).getFavorites_count()+"");
        holder.sdv.setImageURI(data.get(position).getCover_image_url());

        holder.sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = data.get(position).getId();
                String url_commodity = Urls.URL_COMMODITY + "/" + id;
                Intent intent = new Intent(context, CommodityActivity.class);
                intent.putExtra("url_commodity", url_commodity);
                intent.putExtra("COMMODITYID", id);
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
        private TextView name,price,count;

        public MyHolder(View itemView) {
            super(itemView);
            sdv = (SimpleDraweeView) itemView.findViewById(R.id.rv_item_post_sdv);
            name = (TextView) itemView.findViewById(R.id.rv_item_post_name);
            price = (TextView) itemView.findViewById(R.id.rv_item_post_price);
            count = (TextView) itemView.findViewById(R.id.rv_item_post_count);
        }
    }
}

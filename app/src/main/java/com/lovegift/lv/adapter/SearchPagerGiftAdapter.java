package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lovegift.lv.bean.SearchGiftBean;
import com.lovegift.lv.lovegift.CommodityActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by lin-pc on 2016/6/27.
 */
public class SearchPagerGiftAdapter extends RecyclerView.Adapter<SearchPagerGiftAdapter.GiftHolder> {
    private List<SearchGiftBean.DataBean.ItemsBean> giftList;
    private Context context;
    private LayoutInflater inflater;
    private ImageLoader loader;

    public SearchPagerGiftAdapter(Context context, List<SearchGiftBean.DataBean.ItemsBean> giftList,ImageLoader loader) {
        this.context = context;
        this.giftList = giftList;
        this.loader = loader;
        inflater = inflater.from(context);

    }

    @Override
    public GiftHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.search_pager_gift, parent, false);
        return new GiftHolder(view);
    }

    @Override
    public void onBindViewHolder(GiftHolder holder, final int position) {
        holder.tv_name.setText(giftList.get(position).getName());
        holder.tv_price.setText(giftList.get(position).getPrice());
        holder.tv_favorites_count.setText(giftList.get(position).getFavorites_count()+"");

        loader.displayImage(giftList.get(position).getCover_image_url(),holder.imageView);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = giftList.get(position).getId();
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
        return giftList == null ? 0 : giftList.size();
    }

    class GiftHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tv_name;
        TextView tv_price;
        TextView tv_favorites_count;

        public GiftHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_price = (TextView) itemView.findViewById(R.id.tv_price);
            tv_favorites_count = (TextView) itemView.findViewById(R.id.tv_favorites_count);
        }
    }
}

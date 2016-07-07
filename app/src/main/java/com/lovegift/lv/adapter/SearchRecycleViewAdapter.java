package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.lovegift.lv.fragment.SearchGiftFragment;
import com.lovegift.lv.fragment.SearchPagerGiftFragment;
import com.lovegift.lv.lovegift.R;

import java.util.List;

/**
 * Created by lin-pc on 2016/6/24.
 */
public class SearchRecycleViewAdapter extends RecyclerView.Adapter<SearchRecycleViewAdapter.Myholder> implements View.OnClickListener{
    private Context context;
    private List<String> word;

    public SearchRecycleViewAdapter(Context context, List<String> word) {
        this.context = context;
        this.word = word;
    }

    private OnRecyclerViewItemClickListener mOnItemClickListener = null;

    //define interface
    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view, String word);
    }

    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.search_button, parent, false);
        Myholder mh = new Myholder(view);
        view.setOnClickListener(this);
        return mh;
    }

    @Override
    public void onBindViewHolder(Myholder holder, final int position) {
        holder.btn.setText(word.get(position));
        holder.itemView.setTag(word.get(position));
    }


    @Override
    public void onClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(view, (String) view.getTag());
        }
    }

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
    @Override
    public int getItemCount() {
        return word.size();
    }

    class Myholder extends RecyclerView.ViewHolder {
        Button btn;
        public Myholder(View itemView) {
            super(itemView);
            btn = (Button ) itemView.findViewById(R.id.btn);
        }
    }
}

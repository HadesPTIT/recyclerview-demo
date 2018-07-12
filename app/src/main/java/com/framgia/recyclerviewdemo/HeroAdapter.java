package com.framgia.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.MyViewHolder> {

    private List<Hero> mLists;
    private Context mCtx;
    private LayoutInflater mInflater;


    public HeroAdapter(Context context, List<Hero> mLists) {
        this.mLists = mLists;
        this.mCtx = context;
        mInflater = LayoutInflater.from(mCtx);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = mInflater.inflate(R.layout.item_hero, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(HeroAdapter.MyViewHolder holder, int position) {
        Hero hero = mLists.get(position);
        holder.mIds.setImageResource(hero.getIds());
        holder.mName.setText(hero.getName());
    }

    @Override
    public int getItemCount() {
        return mLists.size();
    }

    private int getDisplayWidth() {
        return mCtx.getResources().getDisplayMetrics().widthPixels;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mName;
        ImageView mIds;
        int mWidthRatio = 9, mHeightRatio = 16;

        MyViewHolder(View itemView) {
            super(itemView);
            mIds = itemView.findViewById(R.id.image_hero);
            mName = itemView.findViewById(R.id.text_hero);

            mIds.getLayoutParams().width = getDisplayWidth();
            mIds.getLayoutParams().height = getDisplayWidth() * mWidthRatio / mHeightRatio;
        }
    }

}

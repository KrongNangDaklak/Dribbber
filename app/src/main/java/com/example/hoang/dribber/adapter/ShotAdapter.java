package com.example.hoang.dribber.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.hoang.dribber.R;
import com.example.hoang.dribber.model.Shot;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hoang on 2/22/2017.
 */

public class ShotAdapter extends RecyclerView.Adapter<ShotAdapter.ViewHolder> {
    private static final String TAG = "TweetAdapter";
    private List<Shot> tweets;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public ShotAdapter(Context context, List<Shot> tweetList) {
        mContext = context;
        tweets = tweetList;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.row_item_shot, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Shot tweet = tweets.get(position);

        holder.tvBody.setText(tweet.getUser().getName());
        Glide.with(mContext)
                .load(tweet.getImages().getTeaser())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.ivprofile);
    }

    @Override
    public int getItemCount() {
        return tweets.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvText) TextView tvBody;
        @BindView(R.id.ivPost) ImageView ivprofile;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
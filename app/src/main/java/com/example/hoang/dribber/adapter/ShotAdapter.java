package com.example.hoang.dribber.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.hoang.dribber.R;
import com.example.hoang.dribber.activity.ShotDetailActivity;
import com.example.hoang.dribber.model.Shot;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hoang on 2/22/2017.
 */

public class ShotAdapter extends RecyclerView.Adapter<ShotAdapter.ViewHolder> {
    private static final String TAG = "TweetAdapter";
    private List<Shot> shotList;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public ShotAdapter(Context context, List<Shot> tweetList) {
        mContext = context;
        shotList = tweetList;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.row_item_shot, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Shot shot = shotList.get(position);

        holder.tvTitle.setText("id: " + String.valueOf(shot.getId())); // change to getTitle later
        holder.tvCmtCount.setText(String.valueOf(shot.getCommentsCount()));
        holder.tvLikeCount.setText(String.valueOf(shot.getLikesCount()));
        Glide.with(mContext)
                .load(shot.getImages().getTeaser())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.ivprofile);
        holder.ivprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, String.valueOf(shot.getId()), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(mContext, ShotDetailActivity.class);
                i.putExtra("id", shot.getId());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return shotList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.ivPost)
        ImageView ivprofile;
        @BindView(R.id.likeCount)
        TextView tvLikeCount;
        @BindView(R.id.cmtCount)
        TextView tvCmtCount;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
package com.example.hoang.dribber.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hoang.dribber.R;
import com.example.hoang.dribber.model.Shot;

import java.util.ArrayList;

/**
 * Created by Hoang on 2/22/2017.
 */

public class ShotAdapter extends RecyclerView.Adapter<ShotAdapter.ViewHolder> {
    Context context;
    ArrayList<Shot> shotArrayList;

    public ShotAdapter(Context context, ArrayList<Shot> shotArrayList) {
        this.context = context;
        this.shotArrayList = shotArrayList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.it_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(shotArrayList.get(position).getAttachmentsCount());

    }

    @Override
    public int getItemCount() {
        return shotArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tvText);
            imageView = (ImageView) itemView.findViewById(R.id.ivPost);
        }
    }
}

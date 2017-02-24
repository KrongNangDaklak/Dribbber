package com.example.hoang.dribber.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.hoang.dribber.R;
import com.example.hoang.dribber.adapter.ShotAdapter;
import com.example.hoang.dribber.model.Shot;
import com.example.hoang.dribber.remote.DribberApi;
import com.example.hoang.dribber.utils.EndlessRecyclerViewScrollListener;
import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hoang on 2/24/2017.
 */

public class ShotRecentFragment extends Fragment {
    static final boolean GRID_LAYOUT = true;
    private static final int ITEM_COUNT = 100;
    private RecyclerView mRecyclerView;
    private String sortMode = "recent";
    @BindView(R.id.pbLoarMore)
    ProgressBar progressBar;


    // adding
    private ShotAdapter mShotAdapter;
    ArrayList<Shot> shotArrayList;
    @BindView(R.id.recyclerView)
    RecyclerView rvShot;
    private EndlessRecyclerViewScrollListener scrollListener;
    private GridLayoutManager linearLayoutManager;
    private int currentThisPage;

    // adding xong
    public static ShotRecentFragment newInstance() {
        return new ShotRecentFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recyclerview_shot, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager;

        if (GRID_LAYOUT) {
            layoutManager = new GridLayoutManager(getActivity(), 2);
        } else {
            layoutManager = new LinearLayoutManager(getActivity());
        }
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

        //Use this now
        mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
        //create song data

        currentThisPage = 1;
        configRecyclerView();
        fetchData(sortMode, currentThisPage);
        loadMore();
    }

    private void configRecyclerView() {
        shotArrayList = new ArrayList<>();
        mShotAdapter = new ShotAdapter(getContext(), shotArrayList);
        rvShot.setAdapter(mShotAdapter);
        linearLayoutManager = new GridLayoutManager(getContext(), 2, LinearLayoutManager.VERTICAL, false);
        rvShot.setLayoutManager(linearLayoutManager);
    }

    private void fetchData(String viewMode, int curentPage) {
        DribberApi.Factory.getInstance().getShot(DribberApi.ACCESS_TOKEN, viewMode, curentPage).enqueue(new Callback<List<Shot>>() {
            @Override
            public void onResponse(Call<List<Shot>> call, Response<List<Shot>> response) {
                Log.d("HuuRetro", String.valueOf(response.isSuccessful()));
                shotArrayList.addAll(response.body());
                mShotAdapter.notifyDataSetChanged();
                progressBar.setVisibility(View.GONE);

//                Toast.makeText(getContext(), String.valueOf(linearLayoutManager.getItemCount()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Shot>> call, Throwable t) {
                Log.d("HuuRetro", t.getLocalizedMessage() + t.getMessage() + t.getCause() + t.getStackTrace());
            }
        });

    }

    private void loadMore() {
        scrollListener = new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                progressBar.setVisibility(View.VISIBLE);
                fetchData(sortMode, currentThisPage++);
            }
        };
        rvShot.addOnScrollListener(scrollListener);

    }


}

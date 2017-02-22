package com.example.hoang.dribber.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.hoang.dribber.R;
import com.example.hoang.dribber.adapter.ShotAdapter;
import com.example.hoang.dribber.model.Shot;
import com.example.hoang.dribber.remote.DribberApi;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hoang on 2/22/2017.
 */

public class MainActivity extends AppCompatActivity {
    private ShotAdapter mShotAdapter;
    ArrayList<Shot> shotArrayList;
    @BindView(R.id.rcShot)
    RecyclerView rvShot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        FetchData();
    }

    private void rvSetup() {
        mShotAdapter = new ShotAdapter(this, shotArrayList);
        rvShot.setAdapter(mShotAdapter);
        rvShot.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void FetchData() {
        DribberApi.Factory.getInstance().getShot(DribberApi.ACCESS_TOKEN, "views", 3).enqueue(new Callback<List<Shot>>() {
            @Override
            public void onResponse(Call<List<Shot>> call, Response<List<Shot>> response) {
                Log.d("HuuRetro", String.valueOf(response.isSuccessful()));
                List shots = response.body();
                shotArrayList = new ArrayList<>();
                shotArrayList.addAll(shots);
                rvSetup();
                mShotAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Shot>> call, Throwable t) {
                Log.d("HuuRetro", t.getLocalizedMessage() + t.getMessage() + t.getCause() + t.getStackTrace());
            }
        });
    }
}

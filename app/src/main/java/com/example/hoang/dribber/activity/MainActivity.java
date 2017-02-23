package com.example.hoang.dribber.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.hoang.dribber.R;
import com.example.hoang.dribber.adapter.ShotAdapter;
import com.example.hoang.dribber.model.Shot;
import com.example.hoang.dribber.remote.DribberApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        shotArrayList = new ArrayList<>();
        mShotAdapter = new ShotAdapter(getApplicationContext(), shotArrayList);
        rvShot.setAdapter(mShotAdapter);
        rvShot.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        fetchData("recent",1);

    }

    private void fetchData(String viewMode, int curentPage) {
        DribberApi.Factory.getInstance().getShot(DribberApi.ACCESS_TOKEN, viewMode, curentPage).enqueue(new Callback<List<Shot>>() {
            @Override
            public void onResponse(Call<List<Shot>> call, Response<List<Shot>> response) {
                Log.d("HuuRetro", String.valueOf(response.isSuccessful()));
                shotArrayList.addAll(response.body());
                mShotAdapter.notifyDataSetChanged();

            }
            @Override
            public void onFailure(Call<List<Shot>> call, Throwable t) {
                Log.d("HuuRetro", t.getLocalizedMessage() + t.getMessage() + t.getCause() + t.getStackTrace());
            }
        });

    }


}

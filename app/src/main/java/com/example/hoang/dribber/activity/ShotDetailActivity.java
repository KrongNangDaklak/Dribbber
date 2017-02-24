package com.example.hoang.dribber.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hoang.dribber.R;
import com.example.hoang.dribber.model.Shot;
import com.example.hoang.dribber.remote.DribberApi;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShotDetailActivity extends AppCompatActivity {
    @BindView(R.id.tvDetail)
    TextView textView;
    @BindView(R.id.listviewPro)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot_detail);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 123);
        textView.setText(String.valueOf(id));


        DribberApi.Factory.getInstance().getShotDetail(id, DribberApi.ACCESS_TOKEN).enqueue(new Callback<Shot>() {
            @Override
            public void onResponse(Call<Shot> call, Response<Shot> response) {
                Log.d("HuuDetail", String.valueOf(response.isSuccessful()));
                String[] abc = {
                        String.valueOf(response.body().getId()),
                        String.valueOf(response.body().getTitle()),
                        String.valueOf(response.body().getDescription()),
                        String.valueOf(response.body().getWidth()),
                        String.valueOf(response.body().getHeight()),
                        String.valueOf(response.body().getImages().getHidpi()),
                        String.valueOf(response.body().getImages().getNormal()),
                        String.valueOf(response.body().getImages().getTeaser()),
                        String.valueOf(response.body().getViewsCount()),
                        String.valueOf(response.body().getLikesCount()),
                        String.valueOf(response.body().getCommentsCount()),
                        String.valueOf(response.body().getAttachmentsCount()),
                        String.valueOf(response.body().getReboundsCount()),
                        String.valueOf(response.body().getBucketsCount()),
                        String.valueOf(response.body().getCreatedAt()),
                        String.valueOf(response.body().getUpdatedAt()),
                        String.valueOf(response.body().getHtmlUrl()),
                        String.valueOf(response.body().getAttachmentsUrl()),
                        String.valueOf(response.body().getCommentsUrl()),
                        String.valueOf(response.body().getLikesUrl()),
                        String.valueOf(response.body().getProjectsUrl()),
                        String.valueOf(response.body().getReboundsUrl()),
                        String.valueOf(response.body().isAnimated()),
                        String.valueOf(response.body().getTags().toString()),
                        String.valueOf(response.body().getTags().toString()),
                        String.valueOf(response.body().getTags().toString()),

                };
                Toast.makeText(ShotDetailActivity.this, "" + abc.toString(), Toast.LENGTH_SHORT).show();


                Toast.makeText(ShotDetailActivity.this, "" + String.valueOf(response.body().getAttachmentsUrl()), Toast.LENGTH_SHORT).show();


                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, android.R.id.text1, abc);
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Shot> call, Throwable t) {
                Log.d("HuuDetail", t.getLocalizedMessage() + t.getMessage() + t.getCause() + t.getStackTrace());
            }
        });

    }
}

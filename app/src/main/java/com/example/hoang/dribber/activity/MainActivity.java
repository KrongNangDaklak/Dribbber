package com.example.hoang.dribber.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.example.hoang.dribber.R;
import com.example.hoang.dribber.model.Shot;
import com.example.hoang.dribber.remote.DribberApi;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edt)
    EditText editText;
    String TAG = MainActivity.class.getSimpleName();
    String URL_GET_PRODUCT = DribberApi.BASE_URL + "/shots" + "?access_token=" + DribberApi.ACCESS_TOKEN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        editText.setText(URL_GET_PRODUCT);
        mFunction();
    }

    private void mFunction() {
        DribberApi.Factory.getInstance().getMovies(DribberApi.ACCESS_TOKEN,"views",3).enqueue(new Callback<List<Shot>>() {
            @Override
            public void onResponse(Call<List<Shot>> call, Response<List<Shot>> response) {
                Log.d("HuuRetro", String.valueOf(response.isSuccessful()));
            }

            @Override
            public void onFailure(Call<List<Shot>> call, Throwable t) {
                Log.d("HuuRetro", t.getLocalizedMessage() + t.getMessage() + t.getCause() + t.getStackTrace());

            }
        });
    }


}
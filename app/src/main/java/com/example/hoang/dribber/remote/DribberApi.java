package com.example.hoang.dribber.remote;

import com.example.hoang.dribber.model.Shot;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Hoang on 2/22/2017.
 */

public interface DribberApi {
    final String BASE_URL = "https://api.dribbble.com/v1/";
    final String ACCESS_TOKEN = "8b71d82c6326a32a58494b88ef17829e4b27c47afc1cf73722da92eb259f18e0";
    @GET("shots")
    Call<List<Shot>> getMovies(@Query("access_token") String apiKey, @Query("sort") String sortMode,@Query("page") int curentPage);
    @GET("shots")
    Call<List<Shot>> getMovies(@Query("access_token") String apiKey);


    class Factory {
        private static DribberApi service;
        public static DribberApi getInstance() {
            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASE_URL)
                        .build();
                service = retrofit.create(DribberApi.class);
                return service;
            } else {
                return service;
            }
        }
    }
}

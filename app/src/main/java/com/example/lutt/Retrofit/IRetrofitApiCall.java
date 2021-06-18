package com.example.lutt.Retrofit;


import com.example.lutt.Models.ResultResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IRetrofitApiCall {


    @GET("result.getTodaysResult.php")
    Call<ResultResponse> getTodaysResult(
            @Query("gameNo") int gameNo
    );

}

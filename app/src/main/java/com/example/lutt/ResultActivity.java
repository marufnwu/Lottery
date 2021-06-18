package com.example.lutt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.example.lutt.Models.Result;
import com.example.lutt.Models.ResultResponse;
import com.example.lutt.Retrofit.IRetrofitApiCall;
import com.example.lutt.Retrofit.RetrofitClient;
import com.example.lutt.databinding.ActivityResultBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultActivity extends AppCompatActivity {
    public static String GAME_NO = "GameNo";
    ActivityResultBinding resultBinding;
    int gameNo = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resultBinding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(resultBinding.getRoot());

        gameNo = getIntent().getIntExtra(GAME_NO, 0);

        getResultImage();


    }

    private void getResultImage() {
        RetrofitClient.getRetrofit()
                .create(IRetrofitApiCall.class)
                .getTodaysResult(gameNo)
                .enqueue(new Callback<ResultResponse>() {
                    @Override
                    public void onResponse(Call<ResultResponse> call, Response<ResultResponse> response) {
                        if (response.isSuccessful() && response.body()!=null){
                            ResultResponse resultResponse = response.body();
                            if (!resultResponse.error){
                                //no error
                                if (resultResponse.hasResult){
                                    //Given gameNo result image found
                                    Result result = resultResponse.result;
                                    //Bind image with view
                                    Glide.with(getApplicationContext())
                                            .load(result.result_url)
                                            .into(resultBinding.imgResult);
                                }else{
                                    //result not found
                                }


                            }else{
                                //has error show error message with resultResponse.error_description
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ResultResponse> call, Throwable t) {

                    }
                });
    }
}
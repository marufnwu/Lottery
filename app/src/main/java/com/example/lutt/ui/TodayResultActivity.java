package com.example.lutt.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.lutt.R;
import com.example.lutt.ResultActivity;
import com.example.lutt.databinding.ActivityTodayResultBinding;

public class TodayResultActivity extends AppCompatActivity {
    ActivityTodayResultBinding binding;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTodayResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("আজকের ফলাফল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24);
        handler = new Handler();
        binding.setHandler(handler);
    }


    public class Handler{
        public void onClick(int gameNo){
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
            intent.putExtra(ResultActivity.GAME_NO, gameNo);
            startActivity(intent);
        }
    }
}
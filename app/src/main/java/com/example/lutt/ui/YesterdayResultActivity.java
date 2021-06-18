package com.example.lutt.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lutt.R;
import com.example.lutt.databinding.ActivityYesterdayResultBinding;

public class YesterdayResultActivity extends AppCompatActivity {
    ActivityYesterdayResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityYesterdayResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("গতকালের ফলাফল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24);
    }
}
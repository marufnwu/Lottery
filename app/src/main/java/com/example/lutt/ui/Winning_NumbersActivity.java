package com.example.lutt.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lutt.R;
import com.example.lutt.databinding.ActivityWinningNumbersBinding;

public class Winning_NumbersActivity extends AppCompatActivity {
    ActivityWinningNumbersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWinningNumbersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("বিজয় সংখ্যাগুলি");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24);
    }
}
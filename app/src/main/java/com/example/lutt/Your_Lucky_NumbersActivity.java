package com.example.lutt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lutt.databinding.ActivityYourLuckyNumbersBinding;

public class Your_Lucky_NumbersActivity extends AppCompatActivity {
    ActivityYourLuckyNumbersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityYourLuckyNumbersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("আপনার শুভ সংখ্যা গুলি");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24);

    }
}
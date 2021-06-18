package com.example.lutt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lutt.databinding.ActivityFstPrizeWinnersBinding;

public class Fst_Prize_WinnersActivity extends AppCompatActivity {
    ActivityFstPrizeWinnersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFstPrizeWinnersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("আপনার শুভ সংখ্যা গুলি");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24);
    }
}
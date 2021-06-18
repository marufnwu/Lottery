package com.example.lutt.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lutt.R;
import com.example.lutt.databinding.ActivityYesVsPreBinding;

public class YesVsPreActivity extends AppCompatActivity {
ActivityYesVsPreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityYesVsPreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("গতকাল vs আগের দিনের ফলাফল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24);
    }
}
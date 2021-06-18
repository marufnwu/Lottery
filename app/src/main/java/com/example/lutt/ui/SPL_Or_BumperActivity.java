package com.example.lutt.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lutt.R;
import com.example.lutt.databinding.ActivitySPLOrBumperBinding;

public class SPL_Or_BumperActivity extends AppCompatActivity {
    ActivitySPLOrBumperBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySPLOrBumperBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("স্পেশাল ও বাম্পার");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24);
    }
}
package com.example.lutt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.lutt.databinding.ActivityTodayNumberCheckBinding;

public class Today_Number_CheckActivity extends AppCompatActivity {
    ActivityTodayNumberCheckBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTodayNumberCheckBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar1);
        getSupportActionBar().setTitle(" আজকের ফলাফল চেক");
    }

}
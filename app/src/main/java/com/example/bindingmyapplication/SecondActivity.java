package com.example.bindingmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.bindingmyapplication.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String src=getIntent().getStringExtra("name");
        binding.tv.setText(src);
    }
}
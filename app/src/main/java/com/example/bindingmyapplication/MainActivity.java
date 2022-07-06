package com.example.bindingmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bindingmyapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

        ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());;
        setContentView(binding.getRoot());
        binding.btn.setOnClickListener(view -> {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("name",binding.et1.getText().toString());
            startActivity(i);
        });
    }
}
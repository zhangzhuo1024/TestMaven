package com.example.testmaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidutils.AppUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppUtils.getAppName(this);
    }
}
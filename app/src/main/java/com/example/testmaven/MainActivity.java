package com.example.testmaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidutils.AppUtils;
import com.quarkboom.androidsoutils.AppSoUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //引用AndroidUtils的
        AppUtils.getAppName(this);

        //引用AndroidSoUtils的
        AppSoUtils.getNumber(1, 2);
    }
}
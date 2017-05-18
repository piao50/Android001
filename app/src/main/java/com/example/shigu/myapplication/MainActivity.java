package com.example.shigu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // gushi
        setContentView(R.layout.activity_main);
        // hello how are you!!
        // 1234
        Log.i("MSG", "hello gushi!");
    }
}

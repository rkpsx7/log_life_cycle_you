package com.example.log_life_cycle_you;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Third_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d("Third_Activity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Third_Activity", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Third_Activity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Third_Activity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Third_Activity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Third_Activity", "onDestroy");
    }
}
package com.example.log_life_cycle_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class First_Activity extends AppCompatActivity {

    private Button mBtn2ndActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d("First_Activity", "onCreate");
        mBtn2ndActivity = findViewById(R.id.btn2ndActivity);

        mBtn2ndActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_Activity.this, Second_Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("First_Activity", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("First_Activity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("First_Activity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("First_Activity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("First_Activity", "onDestroy");
    }
}
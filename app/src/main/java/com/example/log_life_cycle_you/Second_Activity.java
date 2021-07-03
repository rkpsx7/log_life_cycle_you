package com.example.log_life_cycle_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Second_Activity extends AppCompatActivity {
    private Button mBtn3rdActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("Second_Activity", "onCreate");
        mBtn3rdActivity = findViewById(R.id.btn3rddActivity);

        mBtn3rdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, Third_Activity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Second_Activity", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Second_Activity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Second_Activity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Second_Activity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Second_Activity", "onDestroy");
    }
}
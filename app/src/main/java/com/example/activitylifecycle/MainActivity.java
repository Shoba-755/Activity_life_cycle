package com.example.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("TAG","App is Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("TAG","APP IS START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("TAG","APP IS RESUMED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("TAG","APP IS STOPPED");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("TAG","APP IS RESTARTED");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("TAG","APP IS DESTROYED");
    }
}
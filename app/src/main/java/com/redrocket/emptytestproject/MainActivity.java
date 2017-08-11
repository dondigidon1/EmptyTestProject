package com.redrocket.emptytestproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ViewGroup mContentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContentContainer = (ViewGroup) findViewById(R.id.container_content);
    }

    public void onButton1Click(View v) {
        Log.i(TAG, "onButton1Click: ");
    }

    public void onButton2Click(View v) {
        Log.i(TAG, "onButton2Click: ");
    }

    public void onButton3Click(View v) {
        Log.i(TAG, "onButton3Click: ");
    }

    public void onButton4Click(View v) {
        Log.i(TAG, "onButton4Click: ");
    }

    public void onButton5Click(View v) {
        Log.i(TAG, "onButton5Click: ");
    }
}

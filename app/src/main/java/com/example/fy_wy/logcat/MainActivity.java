package com.example.fy_wy.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
     final String tag="MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(tag,"VERBOSE Message.");
        Log.v(tag,"Verbose Message");
        Log.d(tag,"Debug Message");
        Log.i(tag,"Info Message");
        Log.w(tag,"Warning Message");
        Log.e(tag,"Error Message");


    }
}

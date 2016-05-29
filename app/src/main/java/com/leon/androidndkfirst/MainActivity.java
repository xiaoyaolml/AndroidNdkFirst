package com.leon.androidndkfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvNative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNative = (TextView) findViewById(R.id.tvNative);
        tvNative.setText(NdkTest.getStringFromNative());
    }
}

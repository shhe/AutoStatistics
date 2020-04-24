package com.auto.statistics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.auto.statistics.proxy.AutoLogAgent;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_static).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v != null) {
                    AutoLogAgent.trackViewOnClick(v);
                }
            }
        });
    }
}

package com.auto.statistics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.auto.statistics.activity.RecyclerViewActivity;
import com.auto.statistics.proxy.AutoLogAgent;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_static).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_recycler_view).setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_static:
                    AutoLogAgent.trackViewOnClick(v);
                    break;
                case R.id.tv_recycler_view:
                    RecyclerViewActivity.launch(MainActivity.this);
                    break;
                default:
                    break;
            }
        }
    };
}

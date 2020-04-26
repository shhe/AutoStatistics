package com.auto.statistics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.auto.statistics.activity.RecyclerViewActivity;
import com.auto.statistics.annotation.AutoStatisticsEvent;
import com.auto.statistics.annotation.NonInjection;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_static).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_recycler_view).setOnClickListener(mOnClickListener);
        findViewById(R.id.ignore_static).setOnClickListener(new View.OnClickListener() {
            @NonInjection
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "忽略此埋点", Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.auto_static).setOnClickListener(mOnClickListener);

    }

    @AutoStatisticsEvent(eventName = "autoStatistics", properties = "{\n" +
            "\t\"status\": {\n" +
            "\t\t\"code\": 0,\n" +
            "\t\t\"message\": \"\"\n" +
            "\t},\n" +
            "\t\"results\": {\n" +
            "\t\t\"query\": {\n" +
            "\t\t\t\"sortCriterial\": \"  publish_time desc \",\n" +
            "\t\t\t\"DEFAULT_PAGE_SIZE\": 10,\n" +
            "\t\t\t\"DEFAULT_PAGE_INDEX\": 1,\n" +
            "\t\t\t\"DEFAULT_TOTLE_PAGE_COUNT\": 1,\n" +
            "\t\t\t\"DEFAULT_TOTLE_COUNT\": 0,\n" +
            "\t\t\t\"DEFAULT_OFFSET\": 0,\n" +
            "\t\t\t\"pageSize\": 20,\n" +
            "\t\t\t\"pageIndex\": 1,\n" +
            "\t\t\t\"totlePageCount\": 1,\n" +
            "\t\t\t\"totleCount\": 1,\n" +
            "\t\t\t\"offset\": 0,\n" +
            "\t\t\t\"limit\": 20\n" +
            "\t\t},\n" +
            "\t\t\"list\": [{\n" +
            "\t\t\t\"id\": 1219927816,\n" +
            "\t\t\t\"gmtCreate\": 1585024784122,\n" +
            "\t\t\t\"gmtModified\": null,\n" +
            "\t\t\t\"title\": \"加入专享社群，每周定期答疑\",\n" +
            "\t\t\t\"publishTime\": 1586349052333,\n" +
            "\t\t\t\"status\": 1\n" +
            "\t\t}]\n" +
            "\t},\n" +
            "\t\"extraInfo\": null\n" +
            "}")
    private void autoStatistics() {
        Toast.makeText(MainActivity.this, "通过注解自动埋点", Toast.LENGTH_LONG).show();
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_static:
//                    AutoStatisticsAgent.trackViewOnClick(v);
                    break;
                case R.id.tv_recycler_view:
                    RecyclerViewActivity.launch(MainActivity.this);
                    break;
                case R.id.auto_static:
                    autoStatistics();
                    break;
                default:
                    break;
            }
        }
    };
}

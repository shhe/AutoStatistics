package com.auto.statistics.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.auto.statistics.R;
import com.auto.statistics.adapter.RecyclerAdapter;

/**
 * @author shhe
 * @Date 2020-04-24 11:11
 * @Description:
 */
public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;

    public static void launch(Context context) {
        Intent intent = new Intent(context, RecyclerViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity);
        mRecyclerView = findViewById(R.id.recycler_view);
        mAdapter = new RecyclerAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this));
        mRecyclerView.setAdapter(mAdapter);
    }
}

package com.auto.statistics.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.auto.statistics.R;

/**
 * @author shhe
 * @Date 2020-04-24 11:16
 * @Description:
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).render();
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView mTvItemName;

        public ItemViewHolder(@NonNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.item_view_holder, parent, false));
            mTvItemName = itemView.findViewById(R.id.tv_item_name);
        }

        public void render() {
            mTvItemName.setText("ite "+getAdapterPosition());
        }
    }

}

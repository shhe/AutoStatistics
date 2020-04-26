package com.auto.statistics.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.auto.statistics.R;
import com.auto.statistics.proxy.informative.TrackableViewHolder;
import com.auto.statistics.proxy.informative.ViewHolderOnClickListener;

import org.json.JSONException;
import org.json.JSONObject;

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

    static class ItemViewHolder extends RecyclerView.ViewHolder implements TrackableViewHolder {

        private TextView mTvItemName;

        public ItemViewHolder(@NonNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.item_view_holder, parent, false));
            mTvItemName = itemView.findViewById(R.id.tv_item_name);
        }

        public void render() {
            mTvItemName.setText("item "+getAdapterPosition());
            itemView.setOnClickListener(new ViewHolderOnClickListener() {
                @Override
                public void onClick(View v) {
//                    AutoStatisticsAgent.trackRecyclerView(ItemViewHolder.this, getAdapterPosition(), v);
                    Toast.makeText(itemView.getContext(), "item: "+getAdapterPosition(), Toast.LENGTH_LONG).show();
                }
            });
        }

        @Override
        public JSONObject getItemTrackProperties(int position) throws JSONException {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("current position: ", position);
            return jsonObject;
        }
    }

}

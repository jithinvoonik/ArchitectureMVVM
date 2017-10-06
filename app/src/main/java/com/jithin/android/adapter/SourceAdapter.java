package com.jithin.android.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jithin.android.R;
import com.jithin.core.model.Source;

import java.util.List;

/**
 * Created by Jithin on 05/10/17.
 */

public class SourceAdapter extends RecyclerView.Adapter<SourceAdapter.Holder> {

    private List<Source> sources;
    private String TAG = SourceAdapter.class.getSimpleName();

    public void setProducts(List<Source> sources) {
        this.sources = sources;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_source, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.text_name.setText(sources.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return sources.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        TextView text_name;

        public Holder(View itemView) {
            super(itemView);
            text_name = itemView.findViewById(R.id.text_source_name);
        }
    }

}
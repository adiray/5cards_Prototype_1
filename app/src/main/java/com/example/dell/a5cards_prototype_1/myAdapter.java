package com.example.dell.a5cards_prototype_1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.dell.a5cards_prototype_1.utility.Response;

import java.util.ArrayList;

/**
 * Created by DELL on 11/27/2017.
 */

public class myAdapter extends RecyclerView.Adapter<myViewholder> {

    ArrayList<Response> dataSource;
    Context context;

    public myAdapter(ArrayList<Response> dataSource, Context context) {
        this.dataSource = dataSource;
        this.context = context;
    }

    @Override
    public myViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new myViewholder(v);

    }

    @Override
    public void onBindViewHolder(myViewholder holder, int position) {

        holder.vh_price.setText(dataSource.get(position).getPRODUCTPRICE());
        holder.vh_name.setText(dataSource.get(position).getPRODUCTNAME());
        Glide.with(context).load(dataSource.get(position).getPRODUCTIMAGEREFERENCE()).apply(RequestOptions.noTransformation()).into(holder.vh_image);


    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}

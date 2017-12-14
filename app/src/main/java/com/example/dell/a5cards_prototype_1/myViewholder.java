package com.example.dell.a5cards_prototype_1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DELL on 11/27/2017.
 */

public class myViewholder extends RecyclerView.ViewHolder {
    TextView vh_price, vh_name;
    ImageView vh_image;



    public myViewholder(View itemView) {
        super(itemView);
        vh_image = itemView.findViewById(R.id.single_item_image);
        vh_name= itemView.findViewById(R.id.single_item_name);
        vh_price = itemView.findViewById(R.id.single_item_price);


    }
}

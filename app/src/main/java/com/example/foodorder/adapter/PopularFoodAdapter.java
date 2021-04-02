package com.example.foodorder.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorder.DetailsActivity;
import com.example.foodorder.R;
import com.example.foodorder.model.PopularFood;

import java.util.List;


public class PopularFoodAdapter extends RecyclerView.Adapter<PopularFoodAdapter.PopularFoodViewHolder> {
    Context context;
    List<PopularFood> popularFoodList;

    public PopularFoodAdapter(Context context, List<PopularFood> popularFoodList) {
        this.context = context;
        this.popularFoodList = popularFoodList;
    }

    public static final class PopularFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public PopularFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
        }
    }

    @NonNull
    @Override
    public PopularFoodAdapter.PopularFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_food_row_item, parent, false);
        return new PopularFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularFoodAdapter.PopularFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(popularFoodList.get(position).getImageUrl());
        holder.name.setText(popularFoodList.get(position).getName());
        holder.price.setText(popularFoodList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("Name",popularFoodList.get(position).getName());
                i.putExtra("Price",popularFoodList.get(position).getPrice());
                i.putExtra("Image",popularFoodList.get(position).getImageUrl().toString());
                i.putExtra("Detail",popularFoodList.get(position).getDetail());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return popularFoodList.size();
    }
}


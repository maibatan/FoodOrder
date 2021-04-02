package com.example.foodorder.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.foodorder.DetailsActivity;
import com.example.foodorder.R;
import com.example.foodorder.model.Food;


import java.util.List;
public class AnotherFoodAdapter extends RecyclerView.Adapter<AnotherFoodAdapter.AnotherFoodViewHolder>{
    Context context;
    List<Food> anotherFoodList;

    public AnotherFoodAdapter(Context context, List<Food> anotherFoodList) {
        this.context = context;
        this.anotherFoodList = anotherFoodList;
    }

    public static final class AnotherFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name, rating, restaurantName;

        public AnotherFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image_1);
            name = itemView.findViewById(R.id.name_1);
            price = itemView.findViewById(R.id.price_1);
            rating = itemView.findViewById(R.id.rating);
            restaurantName = itemView.findViewById(R.id.restaurant_name);
        }
    }

    @NonNull
    @Override
    public AnotherFoodAdapter.AnotherFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.another_food_row_item, parent, false);
        return new AnotherFoodAdapter.AnotherFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnotherFoodAdapter.AnotherFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(anotherFoodList.get(position).getImageUrl());
        holder.name.setText(anotherFoodList.get(position).getName());
        holder.price.setText(anotherFoodList.get(position).getPrice());
        holder.rating.setText(anotherFoodList.get(position).getRating());
        holder.restaurantName.setText(anotherFoodList.get(position).getRestaurantName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("Name",anotherFoodList.get(position).getName());
                i.putExtra("Price",anotherFoodList.get(position).getPrice());
                i.putExtra("Image",anotherFoodList.get(position).getImageUrl().toString());
                i.putExtra("Detail",anotherFoodList.get(position).getDetail());
                i.putExtra("Title",anotherFoodList.get(position).getTitle());
                i.putExtra("Rating",anotherFoodList.get(position).getRating());
                context.startActivity(i);
            }
        });
    }


    @Override
    public int getItemCount() {
        return anotherFoodList.size();
    }

}

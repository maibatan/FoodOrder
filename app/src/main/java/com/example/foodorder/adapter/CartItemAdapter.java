package com.example.foodorder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodorder.R;
import com.example.foodorder.model.Cart_Item;


import java.util.List;

public class CartItemAdapter extends RecyclerView.Adapter<CartItemAdapter.CartItemViewHolder> {
    Context context;
    List<Cart_Item> cartItem;

    public CartItemAdapter(Context context, List<Cart_Item> cartItem) {
        this.context = context;
        this.cartItem = cartItem;
    }

    public static final class CartItemViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name, amount;

        public CartItemViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image_1);
            name = itemView.findViewById(R.id.name_1);
            price = itemView.findViewById(R.id.price_1);
            amount = itemView.findViewById(R.id.amount);

        }
    }

    @NonNull
    @Override
    public CartItemAdapter.CartItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cart_item, parent, false);
        return new CartItemAdapter.CartItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartItemAdapter.CartItemViewHolder holder, int position) {
        holder.foodImage.setImageResource(cartItem.get(position).getImageUrl());
        holder.name.setText(cartItem.get(position).getName());
        holder.price.setText(cartItem.get(position).getPrice());
        holder.amount.setText(cartItem.get(position).getAmount());
    }





    @Override
    public int getItemCount() {
        return cartItem.size();
    }

}

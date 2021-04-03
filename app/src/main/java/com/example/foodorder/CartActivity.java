package com.example.foodorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodorder.adapter.CartItemAdapter;
import com.example.foodorder.model.Cart_Item;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Bundle bundle=getIntent().getExtras();
        List<Cart_Item> cartItem = new ArrayList<>();
        cartItem.add(new Cart_Item(bundle.getString("Name"),bundle.getString("Price"),Integer.parseInt(bundle.getString("Image")),bundle.getString("Amount")));
        setCartRecycler(cartItem);
    }
    private  void  setCartRecycler(List<Cart_Item> cartItem){
        RecyclerView foodRecycler = findViewById(R.id.food_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        foodRecycler.setLayoutManager(layoutManager);
        CartItemAdapter cartItemAdapter = new CartItemAdapter(this, cartItem);
        foodRecycler.setAdapter(cartItemAdapter);
    }
    public void onClick(View v)
    {
        Bundle bundle=getIntent().getExtras();
        Intent intent=new Intent(getApplicationContext(),OrderActivity.class);

        intent.putExtra("Name",bundle.getString("Name"));
        intent.putExtra("Amount",bundle.getString("Amount"));

        startActivity(intent);

    }
    public  void onClickReturn(View v)
    {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}
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

    private static List<Cart_Item> list =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Bundle bundle=getIntent().getExtras();

        //List<Cart_Item> cartItem = new ArrayList<>();
        //cartItem.add(new Cart_Item(bundle.getString("Name"),bundle.getString("Price"),Integer.parseInt(bundle.getString("Image")),bundle.getString("Amount")));
        list.add(new Cart_Item(bundle.getString("Name"),bundle.getString("Price"),Integer.parseInt(bundle.getString("Image")),bundle.getString("Amount")));
        //setCartRecycler(cartItem);
        setCartRecycler(list);
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

        Intent intent=new Intent(getApplicationContext(),OrderActivity.class);

        for ( int i=0;i<list.size();i++)
        {
            intent.putExtra("Name"+i,list.get(i).getName());
            intent.putExtra("Amount"+i,list.get(i).getAmount());
        }


        startActivity(intent);

    }
    public  void onClickReturn(View v)
    {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
    public static void Empty()
    {
       list.removeAll(list);
    }

}
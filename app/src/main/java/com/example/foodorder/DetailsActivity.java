package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bundle=getIntent().getExtras();



        TextView food=(TextView) findViewById(R.id.foodName);
        food.setText(bundle.getString("Name"));
        TextView foodPrice=(TextView) findViewById(R.id.textView15);
        foodPrice.setText(bundle.getString("Price"));
        ImageView imageView=(ImageView) findViewById(R.id.imageView7);
        imageView.setImageResource(Integer.parseInt(bundle.getString("Image")));
        TextView detail=(TextView) findViewById(R.id.detail);
        detail.setText(bundle.getInt("Detail"));
        TextView title=(TextView) findViewById(R.id.tilte);
        title.setText(bundle.getString("Title"));
        TextView rating=(TextView) findViewById(R.id.rating);
        rating.setText(bundle.getString("Rating"));

        ImageButton plus= (ImageButton) findViewById(R.id.plus);
        ImageButton del= (ImageButton) findViewById(R.id.del);
        plus.setOnClickListener(this::onClickPlus);
        del.setOnClickListener(this::onClickDel);

    }

    public void onClick(View v)
    {
        Intent intent =new Intent(getApplicationContext(), OrderActivity.class);
        TextView amount=(TextView) findViewById(R.id.amount);
        TextView dishes=(TextView) findViewById(R.id.foodName);
        intent.putExtra("amount",amount.getText());
        intent.putExtra("dishes",dishes.getText());
        startActivity(intent);
    }
    public void onClickPlus(View v)
    {
        TextView amount=(TextView) findViewById(R.id.amount);
        int temp=Integer.parseInt(amount.getText().toString());
        temp++;
        amount.setText(String.valueOf(temp));
    }
    public void onClickDel(View v)
    {
        TextView amount=(TextView) findViewById(R.id.amount);
        int temp=Integer.parseInt(amount.getText().toString());
        if(temp>1)temp--;
        amount.setText(String.valueOf(temp));
    }
}
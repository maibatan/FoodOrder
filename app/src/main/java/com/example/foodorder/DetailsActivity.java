package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bundle=getIntent().getExtras();



        TextView food=(TextView) findViewById(R.id.textView12);
        food.setText(bundle.getString("Name"));
        TextView foodPrice=(TextView) findViewById(R.id.textView15);
        foodPrice.setText(bundle.getString("Price"));
        ImageView imageView=(ImageView) findViewById(R.id.imageView7);
        imageView.setImageResource(Integer.parseInt(bundle.getString("Image")));

    }

    public void onClick(View v)
    {
        Intent intent =new Intent(getApplicationContext(), OrderActivity.class);
        TextView amount=(TextView) findViewById(R.id.textView14);
        TextView dishes=(TextView) findViewById(R.id.textView12);
        intent.putExtra("amount",amount.getText());
        intent.putExtra("dishes",dishes.getText());
        startActivity(intent);
    }

}
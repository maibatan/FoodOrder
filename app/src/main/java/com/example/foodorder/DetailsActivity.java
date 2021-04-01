package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
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
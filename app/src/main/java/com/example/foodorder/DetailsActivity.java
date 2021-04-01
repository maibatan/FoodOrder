package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    public void onClick(View v)
    {
        String url="https://www.google.com/maps/dir/"+"/Saigon+University,+273+An+D.+V%C6%B0%C6%A1ng,+Ph%C6%B0%E1%BB%9Dng+3,+Qu%E1%BA%ADn+5,+Th%C3%A0nh+ph%E1%BB%91+H%E1%BB%93+Ch%C3%AD+Minh+700000,+Vietnam";
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
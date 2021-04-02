package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Button btn=(Button) findViewById(R.id.order);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numerphone =(EditText) findViewById(R.id.editTextNumber);
                if(!numerphone.getText().equals("") )
                {
                    Bundle bundle=getIntent().getExtras();
                    String amount=bundle.getString("amount");
                    String dishes=bundle.getString("dishes");
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage("5556", null,
                            "I want "+amount+" "+dishes+"\nMy numer phone is "+numerphone.getText(),

                            null, null);

                }
            }
        });



        ImageButton returnbtn=(ImageButton) findViewById(R.id.back);
        returnbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DetailsActivity.class);
                startActivity(intent);
            }
        });
    }



}
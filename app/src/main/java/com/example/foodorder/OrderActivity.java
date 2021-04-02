package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
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
        btn.setOnClickListener(this::onClick);



        ImageButton returnBtn=(ImageButton) findViewById(R.id.back);
        returnBtn.setOnClickListener(this::onClickReturn);


    }
    public void onClick(View v) {
        EditText numerPhone =(EditText) findViewById(R.id.editTextNumber);
        if(!numerPhone.getText().equals("") )
        {
            Bundle bundle=getIntent().getExtras();
            String amount=bundle.getString("amount");
            String dishes=bundle.getString("dishes");
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage("0707160100", null,
                    "I want "+amount+" "+dishes+"\nMy numer phone is "+numerPhone.getText(),

                    null, null);



        }
        else {

        }
    }
    public void onClickReturn(View v) {
        Intent intent=new Intent(getApplicationContext(),DetailsActivity.class);
        startActivity(intent);
    }


}
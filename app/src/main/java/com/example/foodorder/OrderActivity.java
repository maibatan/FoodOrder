package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
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
        EditText numerPhone = (EditText) findViewById(R.id.editTextNumber);
        EditText name = (EditText) findViewById(R.id.editTextName);


        if (!name.getText().toString().equals("") && !numerPhone.getText().toString().equals("")) {

                Bundle bundle = getIntent().getExtras();
                String amount = bundle.getString("Amount");
                String dishes = bundle.getString("Name");




            String phoneNumber = "5556";
            String message = "My name is " + name.getText() + ". My numer phone is " + numerPhone.getText() + "\n" + amount + " " + dishes;
            Intent intent = new Intent(Intent.ACTION_SENDTO,

                    Uri.parse("sms:" + phoneNumber));

            intent.putExtra("sms_body", message);
            startActivity(intent);


        }
    }




    public void onClickReturn(View v) {
        
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


}
package com.dextol.dextol.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.dextol.dextol.R;

public class Order_medicines extends AppCompatActivity
{

    RadioButton rb_home, rb_walkin;
    Button b_upload, b_order;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_medicines);

        et1 = findViewById(R.id.order_medic_medic_req);
        b_order = findViewById(R.id.btn_order_medic_order);
        b_upload = findViewById(R.id.btn_order_medic_upload);
        b_upload.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("file/*");
                startActivity(intent);

            }
        });
        b_order.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(Order_medicines.this, "order placed", Toast.LENGTH_SHORT).show();

            }
        });

    }



}

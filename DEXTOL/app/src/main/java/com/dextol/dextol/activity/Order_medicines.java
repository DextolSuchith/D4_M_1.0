package com.dextol.dextol.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dextol.dextol.R;

public class Order_medicines extends AppCompatActivity
{

    String A_type[]={"--Select Appointment Type--","Online","Walkin",};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_medicines);
    }
}

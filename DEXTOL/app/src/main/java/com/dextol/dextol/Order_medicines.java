package com.dextol.dextol;

import android.app.Activity;
import android.os.Bundle;

public class Order_medicines extends Activity
{

    String A_type[]={"--Select Appointment Type--","Online","Walkin",};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_medicines);
    }
}

package com.dextol.dextol.activity;

import android.app.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dextol.dextol.R;


public class Registration extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);

    }
}

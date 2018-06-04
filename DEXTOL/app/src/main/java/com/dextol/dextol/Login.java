package com.dextol.dextol;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import android.support.v7.app.AppCompatActivity ;
import android.view.View;
import android.widget.FrameLayout;

public class Login extends AppCompatActivity{


    FrameLayout simpleFrameLayout;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }

    public void Loginn(View view)
    {
        Intent it=new Intent(this,MainActivity.class);
        startActivity(it);
    }

    public void Register(View view)
    {
        Intent it=new Intent(this,Registration.class);
        startActivity(it);

    }
}

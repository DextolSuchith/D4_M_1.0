package com.dextol.dextol.activity;

import android.support.v7.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dextol.dextol.R;

public class Add_Family extends AppCompatActivity
{




    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add__family);

        ActionBar acb=getSupportActionBar();
        acb.setTitle("Family Form");

    }

    public void AddFamily(View view)
    {

        Intent it=new Intent(this,Family_form1.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);



    }
}

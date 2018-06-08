package com.dextol.dextol.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.dextol.dextol.R;

public class Doctor_profile extends AppCompatActivity {
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_profile);

    }


    public void Sort(View view)
    {
        LayoutInflater li=  (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v=li.inflate(R.layout.doctor_list_style,null,false);
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setView(v);
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void filter(View view)
    {

        Intent it=new Intent(this,Doctor_Booking.class);
        startActivity(it);
    }
}

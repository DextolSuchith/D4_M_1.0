package com.dextol.dextol;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    public void Update_Details(View view)
    {
        LayoutInflater li=  (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v=li.inflate(R.layout.update_user_details,null,false);
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setView(v);
        AlertDialog ad=adb.create();
        ad.show();

    }

    public void Change_password(View view)
    {
        LayoutInflater li=  (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v=li.inflate(R.layout.change_password,null,false);
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setView(v);

        AlertDialog ad=adb.create();
        ad.show();
    }
}

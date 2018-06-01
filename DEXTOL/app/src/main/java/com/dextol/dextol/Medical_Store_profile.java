package com.dextol.dextol;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class Medical_Store_profile extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicalstore_profile);
    }


    public void sort(View view) {
        LayoutInflater li=  (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v=li.inflate(R.layout.medical_list_style,null,false);
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setView(v);
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void filter(View view)
    {
        Intent it=new Intent(this,Order_medicines.class);
        startActivity(it);

    }
}

package com.dextol.dextol;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class Medical_Reports extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical__reports);
    }

    public void Upload(View view)
    {
        LayoutInflater li=  (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v=li.inflate(R.layout.adding__medical__reports,null,false);
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setView(v);
        AlertDialog ad=adb.create();
        ad.show();

    }
}

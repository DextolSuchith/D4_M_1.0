package com.dextol.dextol.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dextol.dextol.R;

public class Medical_Store_profile extends AppCompatActivity
{
LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicalstore_profile);


    }


    public void sort(View view)
    {
        Button b1;
        TextView tv_pharma,tv_mblno,tv_location,tv_timings,tv_discount;
        ImageView  iv;

        LayoutInflater li=  (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v=li.inflate(R.layout.medical_list_style,null,false);
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setView(v);
        final  AlertDialog ad=adb.create();
        ad.show();

        tv_pharma=v.findViewById(R.id.medic_list_pharmacy);
        tv_mblno=v.findViewById(R.id.medic_list_mblno);
        tv_location=v.findViewById(R.id.medic_list_location);
        tv_timings=v.findViewById(R.id.medic_list_timings);
        tv_discount=v.findViewById(R.id.medic_list_discount);

        b1=v.findViewById(R.id.btn_medic_list);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               Intent it=new Intent(Medical_Store_profile.this,Order_medicines.class);
               startActivity(it);
               ad.dismiss();

            }
        });

    }

    public void filter(View view)
    {
        Intent it=new Intent(this,Order_medicines.class);
        startActivity(it);

    }
}

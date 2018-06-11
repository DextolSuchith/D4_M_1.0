package com.dextol.dextol.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dextol.dextol.R;

public class Medical_Reports extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical__reports);
    }

    public void Upload(View view)
    {
        Button b1, b2;
        EditText et1, et2, et3;

        LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.adding__medical__reports, null, false);
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setView(v);
        AlertDialog ad = adb.create();
        ad.show();

        et1 = v.findViewById(R.id.medic_rcrd_name);
        et2 = v.findViewById(R.id.medic_rcrd_date);
        et3 = v.findViewById(R.id.medic_rcrd_desc);

        b1 = v.findViewById(R.id.medic_upload_prescription);
        b2 = v.findViewById(R.id.btn_add_medic);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(Medical_Reports.this, "select medical file", Toast.LENGTH_SHORT).show();

            }
        });


        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(Medical_Reports.this, "medical report uploaded", Toast.LENGTH_SHORT).show();

            }
        });

    }
}

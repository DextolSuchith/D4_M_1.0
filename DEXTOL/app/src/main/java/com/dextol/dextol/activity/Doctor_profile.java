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
import android.widget.RatingBar;
import android.widget.TextView;

import com.dextol.dextol.R;

public class Doctor_profile extends AppCompatActivity
{
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_profile);

    }


    public void Sort(View view)
    {
        Button b1;
        TextView tv_spec, tv_name, tv_location, tv_exp, tv_fee, tv_avail;
        ImageView iv1;
        RatingBar rb1;


        LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.doctor_list_style, null, false);
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setView(v);
        final AlertDialog ad = adb.create();
        ad.show();


        b1 = v.findViewById(R.id.doc_lst_btn_book);
        tv_spec = findViewById(R.id.doc_lst_speclist);
        tv_name = findViewById(R.id.doc_lst_d_name);
        tv_fee = findViewById(R.id.doc_lst_fee);
        tv_exp = findViewById(R.id.doc_lst_exp);
        tv_avail = findViewById(R.id.doc_lst_avail);
        tv_location = findViewById(R.id.doc_lst_location);
        iv1 = v.findViewById(R.id.doc_lst_img);
        rb1 = v.findViewById(R.id.doc_lst_ratingbar);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(Doctor_profile.this, Doctor_Booking.class);
                startActivity(it);
                ad.dismiss();

            }
        });


    }

    public void filter(View view)
    {

        Intent it = new Intent(this, Doctor_Booking.class);
        startActivity(it);
    }
}

package com.dextol.dextol.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.dextol.dextol.R;

public class View_All_Specialization extends AppCompatActivity
{
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__all__specialization);


        iv1=findViewById(R.id.dermatology_img_spec);
        iv2=findViewById(R.id.cardiology_img_spec);
        iv3=findViewById(R.id.gynacology_img_spec);
        iv4=findViewById(R.id.orthopedics_img_spec);
        iv5=findViewById(R.id.ent_img_spec);
        iv6=findViewById(R.id.pulmonology_img_spec);
        iv7=findViewById(R.id.urology_img_spec);
        iv8=findViewById(R.id.general_img_spec);

        iv1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(View_All_Specialization.this,Doctor_profile.class);
                startActivity(it);
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}



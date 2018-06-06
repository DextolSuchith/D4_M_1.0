package com.dextol.dextol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Family_form1 extends AppCompatActivity
{
    String Gender[]={"--Select Gender-- ","Male","Female","Others"};
    String Relation[]={"--Select Relation-- ","Father","Mother","Brother","Sister"};
    String Blood[]={"--Select Blood Group-- ","A+","A-","B+","B-","AB+","AB-","O+","O-"};
    Spinner sp1,sp2,sp3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_form1);

        sp1=findViewById(R.id.spgender);
        sp2=findViewById(R.id.sprelation);
        sp3=findViewById(R.id.spblood);
        b1=findViewById(R.id.alertb1);

        ArrayAdapter<String> a1=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Gender);
        sp1.setAdapter(a1);

        ArrayAdapter<String> a2=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Relation);
        sp2.setAdapter(a2);

        ArrayAdapter<String> a3=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Blood);
        sp3.setAdapter(a3);

        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

               Intent it=new Intent(Family_form1.this,Family_Form2.class);
               startActivity(it);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                finish();


            }
        });

    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);

    }
}

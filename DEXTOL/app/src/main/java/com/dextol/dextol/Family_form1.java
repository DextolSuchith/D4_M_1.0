package com.dextol.dextol;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class Family_form1 extends Fragment
{


    String Gender[]={"--Select Gender-- ","Male","Female","Others"};
    String Relation[]={"--Select Relation-- ","Father","Mother","Brother","Sister"};
    String Blood[]={"--Select Blood Group-- ","A+","A-","B+","B-","AB+","AB-","O+","O-"};
    Spinner sp1,sp2,sp3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
       View v=inflater.inflate(R.layout.fragment_family_form1, container, false);



        sp1=v.findViewById(R.id.spgender);
        sp2=v.findViewById(R.id.sprelation);
        sp3=v.findViewById(R.id.spblood);

        ArrayAdapter a1=new ArrayAdapter(getContext(),android.R.layout.simple_dropdown_item_1line,Gender);
        sp1.setAdapter(a1);

        ArrayAdapter a2=new ArrayAdapter(getContext(),android.R.layout.simple_dropdown_item_1line,Relation);
        sp2.setAdapter(a2);

        ArrayAdapter a3=new ArrayAdapter(getContext(),android.R.layout.simple_dropdown_item_1line,Blood);
        sp3.setAdapter(a3);
        Button b1=v.findViewById(R.id.alertb1);
        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.f_fragment,new Family_form2());
                ft.commit();

            }
        });






       return v;
    }


}

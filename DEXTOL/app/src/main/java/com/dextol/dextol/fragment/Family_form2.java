package com.dextol.dextol.fragment;


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
import android.widget.Toast;

import com.dextol.dextol.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Family_form2 extends Fragment
{

    Button b1,b2;
    String Country[]={"--Select Country-- "};
    String State[]={"--Select State-- "};
    String District[]={"--Select District-- "};
    Spinner sp1,sp2,sp3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_family_form2, container, false);

                   sp1=v.findViewById(R.id.spcountry);
                sp2=v.findViewById(R.id.spstate);
                sp3=v.findViewById(R.id.spdistrict);
        b1=v.findViewById(R.id.previous_b2);
        b2=v.findViewById(R.id.register_form_b1);

         ArrayAdapter<String> a1=new ArrayAdapter<>(getContext(),android.R.layout.simple_dropdown_item_1line,Country);
         sp1.setAdapter(a1);

         ArrayAdapter<String> a2=new ArrayAdapter<>(getContext(),android.R.layout.simple_dropdown_item_1line,State);
          sp2.setAdapter(a2);

          ArrayAdapter<String> a3=new ArrayAdapter<>(getContext(),android.R.layout.simple_dropdown_item_1line,District);
          sp3.setAdapter(a3);

          b1.setOnClickListener(new View.OnClickListener()
          {
              @Override
              public void onClick(View view)
              {
                  
              }
          });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getContext(), "Family Form Saved", Toast.LENGTH_SHORT).show();
            }
        });


        return v;
    }

}

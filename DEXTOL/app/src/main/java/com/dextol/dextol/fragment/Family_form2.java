package com.dextol.dextol.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.dextol.dextol.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Family_form2 extends Fragment
{


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



         ArrayAdapter<String> a1=new ArrayAdapter<>(getContext(),android.R.layout.simple_dropdown_item_1line,Country);
         sp1.setAdapter(a1);

         ArrayAdapter<String> a2=new ArrayAdapter<>(getContext(),android.R.layout.simple_dropdown_item_1line,State);
          sp2.setAdapter(a2);

          ArrayAdapter<String> a3=new ArrayAdapter<>(getContext(),android.R.layout.simple_dropdown_item_1line,District);
          sp3.setAdapter(a3);

        return v;
    }

}

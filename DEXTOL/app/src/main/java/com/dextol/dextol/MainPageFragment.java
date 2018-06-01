package com.dextol.dextol;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainPageFragment extends Fragment
{
    Button b1,b2,b3,b4;


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.main_page_fragment, container, false);
        b1=v.findViewById(R.id.b1docpf);
        b2=v.findViewById(R.id.b2dgnpf);
        b3=v.findViewById(R.id.b3mspf);
        b4=v.findViewById(R.id.b4treatpf);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(getActivity(),Doctor_profile.class);
                startActivity(it);
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(getActivity(),Diagnostics_profile.class);
                startActivity(it);
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(getActivity(),Medical_Store_profile.class);
                startActivity(it);
            }
        });

        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(getActivity(),Treatment_profile.class);
                startActivity(it);
            }
        });


        return v;

    }



}

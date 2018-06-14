package com.dextol.dextol.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dextol.dextol.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeadFragment extends Fragment
{
    Button b1, b2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_head, container, false);


        b1 = v.findViewById(R.id.userreg);
        b2 = v.findViewById(R.id.servicereg);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.setCustomAnimations(R.anim.slide_from_left,R.anim.slide_to_right,R.anim.slide_from_right,R.anim.slide_to_left);
                ft.add(R.id.userf2, new UserFragment());
                ft.commit();

            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.setCustomAnimations(R.anim.slide_from_right,R.anim.slide_to_left,R.anim.slide_from_left,R.anim.slide_to_right);
                ft.add(R.id.userf2, new serviceproviderFragment());
                ft.commit();

            }
        });

        return v;

    }

}

package com.dextol.dextol.fragment;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.dextol.dextol.Diagnostics_profile;
import com.dextol.dextol.Doctor_profile;
import com.dextol.dextol.Medical_Store_profile;
import com.dextol.dextol.R;
import com.dextol.dextol.Treatment_profile;
import com.dextol.dextol.View_All_Specialization;
import com.dextol.dextol.activity.Slide_animation;

public class MainPageFragment extends Fragment
{
    Button b1,b2,b3,b4,b5;
    View  v,v1;
    LinearLayout ll;
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState)
    {

        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
         v = inflater.inflate(R.layout.main_page_fragment, container, false);
        ll=v.findViewById(R.id.main_page_ll);
        b1=v.findViewById(R.id.b1docpf);
        b2=v.findViewById(R.id.b2dgnpf);
        b3=v.findViewById(R.id.b3mspf);
        b4=v.findViewById(R.id.b4treatpf);
        b5=v.findViewById(R.id.b1view_all);

        Animation fadein= AnimationUtils.loadAnimation(getContext(),R.anim.zoom_in);
        ll.startAnimation(fadein);

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
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

             Intent it=new Intent(getActivity(), View_All_Specialization.class);
             startActivity(it);


            }
        });


        return v;

    }



}

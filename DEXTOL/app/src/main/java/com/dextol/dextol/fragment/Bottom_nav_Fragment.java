package com.dextol.dextol.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.dextol.dextol.R;
import com.dextol.dextol.activity.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bottom_nav_Fragment extends Fragment
{


    public Bottom_nav_Fragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_nav_, container, false);

    }


}

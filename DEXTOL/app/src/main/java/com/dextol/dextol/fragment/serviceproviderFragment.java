package com.dextol.dextol.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dextol.dextol.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class serviceproviderFragment extends Fragment
{

//
//    public serviceproviderFragment()
//    {
//        // Required empty public constructor
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_serviceprovider, container, false);

        return v;
    }

}

package com.dextol.dextol.fragment;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.dextol.dextol.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment
{

    Button b1;





    public UserFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        View v=inflater.inflate(R.layout.fragment_user, container, false);

        b1=  v.findViewById(R.id.urb1);
      b1.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View view)
          {

             final View v1=inflater.inflate(R.layout.user_otp,container,false);

              Animation fadein= AnimationUtils.loadAnimation(getContext(),R.anim.zoom_in);
             v1.startAnimation(fadein);

              AlertDialog.Builder adb=new AlertDialog.Builder(getContext());
              adb.setView(v1);
              final AlertDialog ad=adb.create();

              ad.show();


                Button b=v1.findViewById(R.id.otpb1);
                b.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {



                        Toast.makeText(getContext(), "OTP", Toast.LENGTH_SHORT).show();
                      ad.dismiss();

                    }
                });
          }
      });

























        return v;
    }

}

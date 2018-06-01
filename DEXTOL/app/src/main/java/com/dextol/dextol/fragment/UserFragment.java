package com.dextol.dextol.fragment;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

              View v1=inflater.inflate(R.layout.user_otp,container,false);

              AlertDialog.Builder adb=new AlertDialog.Builder(getContext());
              adb.setTitle("OTP Generation");
              adb.setView(v1);
             final AlertDialog ad=adb.create();
              ad.show();




             //EditText et1= v1.findViewById(R.id.otpet1);
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

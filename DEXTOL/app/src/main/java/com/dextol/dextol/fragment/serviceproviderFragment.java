package com.dextol.dextol.fragment;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.Toast;

import com.dextol.dextol.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class serviceproviderFragment extends Fragment
{

    CheckBox cb1, cb2, cb3, cb4;
    Button b1;
    Spinner sp1, sp2, sp3, sp4;

    String Diagnostics_medical[] = {"--Select-- ", "Individual", "Multiple"};
    String Doctor_Treatment[] = {"--Select-- ", "Individual", "Clinic/Hospital"};


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_serviceprovider, container, false);
        sp1 = v.findViewById(R.id.spdoctor);
        sp2 = v.findViewById(R.id.spdiagnostic);
        sp3 = v.findViewById(R.id.spmedical_store);
        sp4 = v.findViewById(R.id.sptreetment);
        b1 = v.findViewById(R.id.sp_otp_gen_b1);

        ArrayAdapter<String> a11 = new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Diagnostics_medical);

        ArrayAdapter<String> a12 = new ArrayAdapter<>(getContext(), android.R.layout.simple_dropdown_item_1line, Doctor_Treatment);

        sp1.setAdapter(a12);
        sp2.setAdapter(a11);
        sp3.setAdapter(a12);
        sp4.setAdapter(a11);


        Button b1 = v.findViewById(R.id.sp_otp_gen_b1);
        cb1 = v.findViewById(R.id.cb1);
        cb2 = v.findViewById(R.id.cb2);
        cb3 = v.findViewById(R.id.cb3);
        cb4 = v.findViewById(R.id.cb4);


        cb1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (cb1.isChecked())
                {
                    sp1.setVisibility(View.VISIBLE);
                    cb4.setChecked(false);
                    sp4.setVisibility(View.GONE);
                } else {
                    sp1.setVisibility(View.GONE);
                }

            }
        });

        cb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (cb2.isChecked())
                {
                    sp2.setVisibility(View.VISIBLE);
                } else
                    {
                    sp2.setVisibility(View.GONE);
                }

            }
        });

        cb3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (cb3.isChecked())
                {
                    sp3.setVisibility(View.VISIBLE);
                } else {
                    sp3.setVisibility(View.GONE);
                }

            }
        });

        cb4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (cb4.isChecked())
                {
                    cb1.setChecked(false);
                    sp1.setVisibility(View.GONE);
                    sp4.setVisibility(View.VISIBLE);
                } else
                    {
                    sp4.setVisibility(View.GONE);
                }

            }
        });

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {

                if (sp1.getSelectedItemPosition() == 2)
                {
                    cb2.setChecked(true);
                    cb3.setChecked(true);
                    sp2.setVisibility(View.VISIBLE);
                    sp3.setVisibility(View.VISIBLE);
                    sp2.setSelection(2);
                    sp3.setSelection(2);
                } else
                    {
                    cb2.setChecked(false);
                    cb3.setChecked(false);
                    sp2.setVisibility(View.GONE);
                    sp3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }
        });
        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                if (sp4.getSelectedItemPosition() == 2)
                {
                    cb2.setChecked(true);
                    cb3.setChecked(true);
                    sp2.setVisibility(View.VISIBLE);
                    sp3.setVisibility(View.VISIBLE);
                    sp2.setSelection(2);
                    sp3.setSelection(2);
                } else
                    {
                    cb2.setChecked(false);
                    cb3.setChecked(false);
                    sp2.setVisibility(View.GONE);
                    sp3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Button btn1, btn2;
                EditText et1;

                final View v1 = inflater.inflate(R.layout.service_otp, container, false);
                AlertDialog.Builder adb = new AlertDialog.Builder(getContext());
                adb.setView(v1);
                final AlertDialog ad = adb.create();
                ad.show();

                Animation fadein = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
                v1.startAnimation(fadein);

                et1 = v1.findViewById(R.id.servie_otp_et);
                btn1 = v1.findViewById(R.id.service_resend_otp);
                btn2 = v1.findViewById(R.id.service_otp_b1);

                btn1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Toast.makeText(getContext(), "resend OTP", Toast.LENGTH_SHORT).show();
                        ad.dismiss();
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener()
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

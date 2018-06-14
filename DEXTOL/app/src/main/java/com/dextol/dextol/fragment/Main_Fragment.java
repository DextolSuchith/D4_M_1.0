package com.dextol.dextol.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dextol.dextol.R;
import com.dextol.dextol.activity.Diagnostics_profile;
import com.dextol.dextol.activity.Doctor_profile;
import com.dextol.dextol.activity.Medical_Store_profile;
import com.dextol.dextol.activity.Treatment_profile;

/**
 * A simple {@link Fragment} subclass.
 */
public class Main_Fragment extends Fragment
{

    BottomSheetDialog bsd;
    LinearLayout ll;
    ImageView b1, b2, b3, b4;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8;
    Button b5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main_, container, false);


        ll = v.findViewById(R.id.main_page_ll);
        b1 = v.findViewById(R.id.doc_profile_img);
        b2 = v.findViewById(R.id.diag_profile_img);
        b3 = v.findViewById(R.id.medic_profile_img);
        b4 = v.findViewById(R.id.treat_profile_img);
        b5 = v.findViewById(R.id.b1view_all);

        iv1 = v.findViewById(R.id.dermatology_img);
        iv2 = v.findViewById(R.id.cardiology_img);
        iv3 = v.findViewById(R.id.gynacology_img);
        iv4 = v.findViewById(R.id.orthopedics_img);
        iv5 = v.findViewById(R.id.ent_img);
        iv6 = v.findViewById(R.id.pulmonology_img);
        iv7 = v.findViewById(R.id.urology_img);
        iv8 = v.findViewById(R.id.general_img);




        Animation fadein = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
        ll.startAnimation(fadein);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Diagnostics_profile.class);
                startActivity(it);
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Medical_Store_profile.class);
                startActivity(it);
            }
        });

        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Treatment_profile.class);
                startActivity(it);
            }
        });

        iv1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });
        iv7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });
        iv8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(getActivity(), Doctor_profile.class);
                startActivity(it);
            }
        });


        //view all by specialization//
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;

                bsd = new BottomSheetDialog(getContext());
                bsd.setCancelable(true);
                bsd.setCanceledOnTouchOutside(true);
                View v = LayoutInflater.from(getContext()).inflate(R.layout.activity_view__all__specialization, null);
                bsd.setContentView(v);
                bsd.show();

                iv1=v.findViewById(R.id.dermatology_img_spec);
                iv2=v.findViewById(R.id.cardiology_img_spec);
                iv3=v.findViewById(R.id.gynacology_img_spec);
                iv4=v.findViewById(R.id.orthopedics_img_spec);
                iv5=v.findViewById(R.id.ent_img_spec);
                iv6=v.findViewById(R.id.pulmonology_img_spec);
                iv7=v.findViewById(R.id.urology_img_spec);
                iv8=v.findViewById(R.id.general_img_spec);


                iv1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });
                iv2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });
                iv3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });
                iv4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });
                iv5.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });
                iv6.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });
                iv7.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });
                iv8.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent it=new Intent(getActivity(),Doctor_profile.class);
                        startActivity(it);
                    }
                });

            }
        });


        return v;


    }


}

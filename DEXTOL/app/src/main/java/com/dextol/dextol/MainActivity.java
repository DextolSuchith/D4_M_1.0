package com.dextol.dextol;


import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener


{

    BottomNavigationView btm_nav;
    LinearLayout ll;
    ImageView b1,b2,b3,b4;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;
    Button b5;
    private DrawerLayout drawer;
    ImageView iv;
    FrameLayout fc;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle drawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nvDrawer = findViewById(R.id.nav_view);
        nvDrawer.setNavigationItemSelectedListener(this);
        fc = findViewById(R.id.fragment_container);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
//        if (savedInstanceState == null)
//        {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                    new MainPageFragment()).commit();
//            // nvDrawer.setCheckedItem(R.id.);
//        }
        btm_nav=findViewById(R.id.b_nav);
        ll=findViewById(R.id.main_page_ll);
        b1=findViewById(R.id.doc_profile_img);
        b2=findViewById(R.id.diag_profile_img);
        b3=findViewById(R.id.medic_profile_img);
        b4=findViewById(R.id.treat_profile_img);
        b5=findViewById(R.id.b1view_all);

        iv1=findViewById(R.id.dermatology_img);
        iv2=findViewById(R.id.cardiology_img);
        iv3=findViewById(R.id.gynacology_img);
        iv4=findViewById(R.id.orthopedics_img);
        iv5=findViewById(R.id.ent_img);
        iv6=findViewById(R.id.pulmonology_img);
        iv7=findViewById(R.id.urology_img);
        iv8=findViewById(R.id.general_img);



        Animation fadein= AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        ll.startAnimation(fadein);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(MainActivity.this,Diagnostics_profile.class);
                startActivity(it);
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(MainActivity.this,Medical_Store_profile.class);
                startActivity(it);
            }
        });

        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(MainActivity.this,Treatment_profile.class);
                startActivity(it);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

             Intent it=new Intent(MainActivity.this, View_All_Specialization.class);
             startActivity(it);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });


            //bottom navigation view//

    btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
{
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.btm_nav1:
                Intent it = new Intent(MainActivity.this, Bottom_nav1.class);
                startActivity(it);
                break;

            case R.id.btm_nav2:
                Intent it1 = new Intent(MainActivity.this, Bottom_nav1.class);
                startActivity(it1);
                break;

            case R.id.btm_nav3:
                Intent it2 = new Intent(MainActivity.this, Bottom_nav1.class);
                startActivity(it2);
                break;

            case R.id.btm_nav4:
                Intent it3 = new Intent(MainActivity.this, Bottom_nav1.class);
                startActivity(it3);
                break;
            case R.id.ibtm_nav5:
                Intent it4 = new Intent(MainActivity.this, Bottom_nav1.class);
                startActivity(it4);
                break;


        }

        return true;
    }
});

//
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });
        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,Doctor_profile.class);
                startActivity(it);
            }
        });




    }

                //navigation drawer//
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {

            case R.id.idfamily:
                Intent it = new Intent(this, Add_Family.class);
                startActivity(it);
                break;

            case R.id.iddash:

                Intent it1 = new Intent(this, Dashboard.class);
                startActivity(it1);
                break;

            case R.id.idappointment:

                Intent it2 = new Intent(this, Appointments.class);
                startActivity(it2);
                break;

            case R.id.idconsulttion:
                Intent it3 = new Intent(this, Consultation.class);
                startActivity(it3);
                break;

            case R.id.idorder:

                Intent it4 = new Intent(this, Orders.class);
                startActivity(it4);
                break;

            case R.id.idfavourite:
                Intent it5 = new Intent(this, Favourites.class);
                startActivity(it5);
                break;

            case R.id.idmedical:

                Intent it6 = new Intent(this, Medical_Reports.class);
                startActivity(it6);
                break;

            case R.id.idsettings:

                Intent it7 = new Intent(this, Settings.class);
                startActivity(it7);
                break;


        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed()
    {
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        } else
            {
                super.onBackPressed();
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);

            }

    }




}
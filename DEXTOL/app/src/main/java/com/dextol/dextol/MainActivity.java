package com.dextol.dextol;


import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.dextol.dextol.fragment.MainPageFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

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
        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new MainPageFragment()).commit();
            // nvDrawer.setCheckedItem(R.id.);
        }
    }
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
            }

    }


}

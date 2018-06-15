package com.dextol.dextol.activity;


import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.content.Intent;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dextol.dextol.R;
import com.dextol.dextol.fragment.Bottom_nav_Fragment;
import com.dextol.dextol.fragment.Bottom_nav_Fragment_1;
import com.dextol.dextol.fragment.Bottom_nav_Fragment_2;
import com.dextol.dextol.fragment.Bottom_nav_Fragment_3;
import com.dextol.dextol.fragment.Main_Fragment;
import ru.dimorinny.showcasecard.ShowCaseView;
import ru.dimorinny.showcasecard.position.Position;
import ru.dimorinny.showcasecard.position.ShowCasePosition;
import ru.dimorinny.showcasecard.radius.Radius;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener


{
    BottomNavigationView btm_nav;
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


        showtool(new ShowCasePosition() {
            @Override
            public PointF getPosition(Activity activity) {
                return null;

            }
        });

        showtool1(new ShowCasePosition() {
            @Override
            public PointF getPosition(Activity activity) {
                return null;
            }
        });

        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Main_Fragment()).commit();

        }



                              btm_nav = findViewById(R.id.b_nav);

        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.btm_nav1:

                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container,
                                new Main_Fragment()).commit();

                        break;

                    case R.id.btm_nav2:
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.slide_from_right,R.anim.slide_to_left,R.anim.slide_from_right,R.anim.slide_to_left)
                                .replace(R.id.fragment_container,
                                new Bottom_nav_Fragment_1()).commit();

                        break;

                    case R.id.btm_nav3:
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.slide_from_right,R.anim.slide_to_left,R.anim.slide_from_left,R.anim.slide_to_right)
                                .replace(R.id.fragment_container,
                                new Bottom_nav_Fragment_2()).commit();

                        break;

                    case R.id.btm_nav4:
                        getSupportFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.slide_from_right,R.anim.slide_to_left,R.anim.slide_from_left,R.anim.slide_to_right)
                                .replace(R.id.fragment_container,
                                new Bottom_nav_Fragment_3()).commit();
                        break;
                }
                return true;
            }

        });

    }
    private void showtool1(ShowCasePosition position)

    {

        position =new Position(new PointF( 350.0F, 550.20F));
        new ShowCaseView.Builder(MainActivity.this)
                .withTypedPosition(position)
                .withTypedRadius(new Radius(200F))
                .withContent("these are profiles")
                .build()
                .show(MainActivity.this);

    }

    private void showtool(ShowCasePosition position)
    {
        position =new Position(new PointF( 70.0F, 100.0F));
        new ShowCaseView.Builder(MainActivity.this)
                .withTypedPosition(position)
                 .withTypedRadius(new Radius(60F))
                .withContent("this is Navigatipon Drawer")
                .build()
                .show(MainActivity.this);
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
              overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
            }

    }
}
//



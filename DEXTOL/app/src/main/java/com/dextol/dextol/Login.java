package com.dextol.dextol;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import android.support.transition.Fade;
import android.support.v7.app.AppCompatActivity ;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.transition.Transition;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {

    LinearLayout ll;
    FrameLayout simpleFrameLayout;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ll=findViewById(R.id.login_ll);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Animation fadein= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        ll.startAnimation(fadein);
    }

    public void Loginn(View view)
    {
        Intent it=new Intent(this,MainActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);


    }

    public void Register(View view)
    {
        Intent it=new Intent(this,Registration.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);

    }
}

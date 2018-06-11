package com.dextol.dextol.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.dextol.dextol.R;


public class Home extends Activity
{
    ImageView ll;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ll = findViewById(R.id.welcome_img);
        Animation fadein = AnimationUtils.loadAnimation(this, R.anim.rotate);
        ll.startAnimation(fadein);
        //Slide_animation.slideInFromLeft(context, view);
    }

    public void img(View view)
    {
        Intent it = new Intent(this, Login.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

}

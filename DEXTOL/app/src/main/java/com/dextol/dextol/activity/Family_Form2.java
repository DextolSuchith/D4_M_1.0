package com.dextol.dextol.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

import com.dextol.dextol.R;

public class Family_Form2 extends AppCompatActivity
{
    Button b1,b2;
    String Country[]={"--Select Country-- "};
    String State[]={"--Select State-- "};
    String District[]={"--Select District-- "};
    Spinner sp1,sp2,sp3;
    NestedScrollView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family__form2);

        sp1=findViewById(R.id.spcountry);
        sp2=findViewById(R.id.spstate);
        sp3=findViewById(R.id.spdistrict);
        b1=findViewById(R.id.previous_b2);
        b2=findViewById(R.id.register_form_b1);
        sv=findViewById(R.id.ff2_sv);

        ArrayAdapter<String> a1=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,Country);
        sp1.setAdapter(a1);

        ArrayAdapter<String> a2=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,State);
        sp2.setAdapter(a2);

        ArrayAdapter<String> a3=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,District);
        sp3.setAdapter(a3);

        Animation fadein= AnimationUtils.loadAnimation(this,R.anim.slide_from_left);
        sv.startAnimation(fadein);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it=new Intent(Family_Form2.this,Family_form1.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_from_left,R.anim.zoom_in);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(Family_Form2.this, "form saved", Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}

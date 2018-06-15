package com.dextol.dextol.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
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

import java.io.IOException;

public class Family_Form2 extends AppCompatActivity
{
    Button b1, b2;
    String Country[] = {" Select Country "};
    String State[] = {" Select State "};
    String District[] = {" Select District "};
    Spinner sp1, sp2, sp3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family__form2);

        sp1 = findViewById(R.id.spcountry);
        sp2 = findViewById(R.id.spstate);
        sp3 = findViewById(R.id.spdistrict);
        b1 = findViewById(R.id.previous_b2);
        b2 = findViewById(R.id.register_form_b1);


        ArrayAdapter<String> a1 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, Country);
        sp1.getBaseline();
        sp1.getPopupBackground();
        sp1.setAdapter(a1);

        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, State);
        sp2.setAdapter(a2);

        ArrayAdapter<String> a3 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, District);
        sp3.setAdapter(a3);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent it = new Intent(Family_Form2.this, Family_form1.class);
                startActivity(it);
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
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    public void takepic(View view)
    {

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//
        startActivityForResult(Intent.createChooser(intent, "Select Picture"),1212);


    }
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1212)
        {
            if (resultCode == Activity.RESULT_OK)
            {
                if (data != null)
                {
                    try
                    {

                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), data.getData());

                    } catch (IOException e)
                    {
                        e.printStackTrace();
                    }

                }
            } else if (resultCode == Activity.RESULT_CANCELED)
            {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

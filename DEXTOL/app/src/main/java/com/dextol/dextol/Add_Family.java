package com.dextol.dextol;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Add_Family extends Activity
{


    

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add__family);


    }

    public void AddFamily(View view)
    {

        Intent it=new Intent(this,Family_Form_holder.class);
        startActivity(it);



    }
}

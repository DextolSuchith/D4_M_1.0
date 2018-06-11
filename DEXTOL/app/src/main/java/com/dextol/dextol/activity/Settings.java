package com.dextol.dextol.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dextol.dextol.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class Settings extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    public void Update_Details(View view)
    {
        EditText et1, et2, et3;
        Button b1;
        LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.update_user_details, null, false);
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setView(v);
        AlertDialog ad = adb.create();
        ad.show();

        et1 = v.findViewById(R.id.update_name);
        et2 = v.findViewById(R.id.update_mblno);
        et3 = v.findViewById(R.id.update_email);
        b1 = v.findViewById(R.id.btn_user_update);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(Settings.this, "details  has been updated", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void Change_password(View view)
    {
        EditText et1, et2, et3;
        Button b1;
        LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.change_password, null, false);
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setView(v);

        AlertDialog ad = adb.create();
        ad.show();
        et1 = v.findViewById(R.id.old_pwd_changepwd);
        et2 = v.findViewById(R.id.pwd_changepwd);
        et3 = v.findViewById(R.id.confirm_pwd_changepwd);
        b1 = v.findViewById(R.id.btn_change_pwd);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(Settings.this, "password has been changed", Toast.LENGTH_SHORT).show();

            }
        });

    }


}

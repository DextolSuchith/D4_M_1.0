package com.dextol.dextol.activity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.dextol.dextol.R;

import java.time.Year;
import java.util.Calendar;

public class Family_form1 extends AppCompatActivity
{
    RadioGroup rg;
    RadioButton r1,r2;
    int year, day, month;
    String Relation[] = {" Select Relation ", "Father", "Mother", "Brother", "Sister"};
    String Blood[] = {" Select Blood Group ", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
    Spinner sp2, sp3;
    Button b1;
    LinearLayout ll;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_form1);


        rg=findViewById(R.id.f_radio_grp);
        sp2 = findViewById(R.id.sprelation);
        sp3 = findViewById(R.id.spblood);
        b1 = findViewById(R.id.alertb1);
        tv1= findViewById(R.id.f_form_dob);
        r1=findViewById(R.id.f_sex_m);
        r2=findViewById(R.id.f_sex_f);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.f_sex_m:
                        String male=r1.getText().toString().trim();
                        Toast.makeText(Family_form1.this, male, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.f_sex_f:
                        String f_male=r2.getText().toString().trim();
                        Toast.makeText(Family_form1.this, f_male, Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        tv1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                DatePickerDialog dp = new DatePickerDialog(Family_form1.this, new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2)
                    {
                        i1 = i1 + 1;
                        tv1.setText(i2+"/"+i1+"/"+i);
                    }
                }, year, month, day);
                dp.show();


            }
        });



        ll = (LinearLayout) findViewById(R.id.ff1_ll);

        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, Relation);
        sp2.setAdapter(a2);

        ArrayAdapter<String> a3 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, Blood);
        sp3.setAdapter(a3);

        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

                Intent it = new Intent(Family_form1.this, Family_Form2.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                finish();


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
}

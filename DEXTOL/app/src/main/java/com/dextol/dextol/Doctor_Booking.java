package com.dextol.dextol;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class Doctor_Booking extends Activity {
    String A_type[]={"--Select Appointment Type--","Online","Walkin","Home Visit"};
TextView tv;
Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor__booking);
        tv=findViewById(R.id.tvdate);
       sp1= findViewById(R.id.A_typesp);

        ArrayAdapter a=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,A_type);
        sp1.setAdapter(a);

    }

    public void select(View view)
    {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);
        int date=c.get(Calendar.DATE);
        DatePickerDialog dp=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

            }
        },year,month,day);
    DatePicker d=dp.getDatePicker();

    }
}

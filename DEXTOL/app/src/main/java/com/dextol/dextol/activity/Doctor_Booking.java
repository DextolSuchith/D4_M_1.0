package com.dextol.dextol.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.dextol.dextol.R;

import java.util.Calendar;

public class Doctor_Booking extends AppCompatActivity

{

    String A_type[] = {"--Select Appointment Type--", "Online", "Walkin", "Home Visit"};
    TextView tv;
    Spinner sp1;
    int year, day, month;
    Button b1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor__booking);
        tv = findViewById(R.id.tvdate);
        sp1 = findViewById(R.id.A_typesp);
        b1 = findViewById(R.id.btn_book);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Doctor_Booking.this, "booked", Toast.LENGTH_SHORT).show();

            }
        });

        ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, A_type);
        sp1.setAdapter(a);

        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        tv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                DatePickerDialog dp = new DatePickerDialog(Doctor_Booking.this, new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2)
                    {
                        i1 = i1 + 1;
                        tv.setText(i2 + "/" + i1 + "/" + i);
                    }
                }, year, month, day);
                dp.show();


            }
        });


    }

}


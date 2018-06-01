package com.dextol.dextol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Register(View view) {
        Intent it = new Intent(this, Registration.class);
        startActivity(it);
    }

    public void Login(View view) {

        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);

    }
}

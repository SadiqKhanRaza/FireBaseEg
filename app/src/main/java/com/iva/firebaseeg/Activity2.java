package com.iva.firebaseeg;

import android.app.usage.NetworkStatsManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    EditText etName,etPass,etConPass,etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        etName=findViewById(R.id.etName);
        etPass=findViewById(R.id.etP1);
        etConPass=findViewById(R.id.etP2);
        etEmail=findViewById(R.id.etEmail);

        ConnectivityManager network = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
    }
    boolean login()
    {
        String pass=etPass.getText().toString();
        if(pass.equals(etConPass.getText().toString()))
        {

            return true;
        }
        return false;
    }
}

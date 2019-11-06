package com.nillsimon.concrete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener {


    Button passengerButton;
    Button driverButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);

        passengerButton = findViewById(R.id.passengerButton);
        driverButton = findViewById(R.id.driverButton);

        passengerButton.setOnClickListener(this);
        driverButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.passengerButton:
                startActivity(new Intent(ChooseActivity.this, SealerActivity.class));
                break;
            case R.id.driverButton:
                startActivity(new Intent(ChooseActivity.this, ManagerActivity.class));
        }
    }
}

package com.nnn.ngocnam.event;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set click listener for buttons
        Button button = findViewById(R.id.btn_b1);
        button.setOnClickListener(this);
        button = findViewById(R.id.btn_b2);
        button.setOnClickListener(this);
        button = findViewById(R.id.btn_b3);
        button.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Button1 clicked
        if (v.getId()==R.id.btn_b1)
        {
            Intent myIntent = new Intent(MainActivity.this, Example1Activity.class);
            MainActivity.this.startActivity(myIntent);
        }
        //Button2 clicked
        else if (v.getId()==R.id.btn_b2){
            Intent myIntent = new Intent(MainActivity.this, Example2Activity.class);
            MainActivity.this.startActivity(myIntent);
        }
        //Button3 clicked
        else if (v.getId()==R.id.btn_b3){
            Intent myIntent = new Intent(MainActivity.this, Example3Activity.class);
            MainActivity.this.startActivity(myIntent);
        }

    }
}

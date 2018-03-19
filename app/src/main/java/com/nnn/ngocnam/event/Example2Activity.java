package com.nnn.ngocnam.event;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
// This activity is an example for using annomynous OnClickListener to handle click event of an button in Android
public class Example2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example3);
        Button resultButton = findViewById(R.id.btn_result);
        // set application title
        getSupportActionBar().setTitle("Annomynous Listener");
        // set annomynous OnClickListener
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultTv = findViewById(R.id.tv_result);
                EditText numberAEdit =findViewById(R.id.edt_numbera);
                EditText numberBEdit =findViewById(R.id.edt_numberb);
                int number1 = 0;
                int number2 = 0;
                // get input number
                try {
                    number1 = Integer.parseInt(numberAEdit.getText().toString());
                } catch (NumberFormatException e){
                    //TODO add code to handle the error
                }
                try {
                    number2 = Integer.parseInt(numberBEdit.getText().toString());
                } catch (NumberFormatException e){
                    //TODO add code to handle the error
                }
                int result = number1+number2;
                // display the result
                resultTv.setText(String.valueOf(result));
            }
        });
    }



}
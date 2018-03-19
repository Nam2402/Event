package com.nnn.ngocnam.event;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
// This activty is an example of how to use handle click event of an button in right xml file
public class Example1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);
        //set application title
        getSupportActionBar().setTitle("OnClick in xml");
    }
    // result_button click handle
    public void onResultButtonClick(View v) {

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

}
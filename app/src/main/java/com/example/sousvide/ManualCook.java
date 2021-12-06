package com.example.sousvide;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class ManualCook extends AppCompatActivity implements View.OnClickListener{
    //creating public constant
    public static final String EXTRA_TEXT = "com.example.sousvide.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.sousvide.EXTRA_NUMBER";
    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_cook);

        Button Cook = findViewById(R.id.Cook);

        Cook.setOnClickListener(this);
        EditText ManualTemp = findViewById(R.id.ManualTemp);
        EditText ManualTime = findViewById(R.id.ManualTime);







    }

    @Override
    public void onClick(View v) {
        isAllFieldsChecked = CheckAllFields();

        if(isAllFieldsChecked){

                openDisplayCook();}

        }

    public void openDisplayCook() {
        EditText ManualTemp = findViewById(R.id.ManualTemp);
        //takes text out of Manual Temp and saves as ManualTempvar (variable)
        int ManualTempvar = Integer.parseInt(ManualTemp.getText().toString());

        EditText ManualTime = findViewById(R.id.ManualTime);
        //takes editText input, converts to string and then converts to integer
        int ManualTimevar = Integer.parseInt(ManualTime.getText().toString());



                    Intent intent = new Intent(this, DisplayCook.class);
                    intent.putExtra(EXTRA_TEXT,ManualTempvar);
                    intent.putExtra(EXTRA_NUMBER,ManualTimevar);

                    startActivity(intent); }





    private boolean CheckAllFields() {
        EditText ManualTemp = findViewById(R.id.ManualTemp);
        EditText ManualTime = findViewById(R.id.ManualTime);
        if (ManualTemp.length() == 0) {
            ManualTemp.setError("This field is required");
            return false;
        }

        if (ManualTime.length() == 0) {
            ManualTime.setError("This field is required");
            return false;
        }

        return true;}}






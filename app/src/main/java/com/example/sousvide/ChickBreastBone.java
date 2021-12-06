package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.lang.reflect.Array;

public class ChickBreastBone extends AppCompatActivity implements View.OnClickListener {
    Spinner spinBreastBone;
    Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int ChickBreastBoneTemp, ChickBreastBoneTime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_breast_bone);



        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinBreastBone = (Spinner) findViewById(R.id.spinBreastBone);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);
        //String[] ChBrBoneThick = getResources().getStringArray(R.array.BreastBoneThick);
        //create array for breast thickness & pulls values from text file
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBoneThick);
       // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinBreastBone.setAdapter(adapter);
        spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(ChickBreastBone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinTimeCook.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedDiv = parent.getItemAtPosition(position).toString();

                switch(selectedDiv)
                {
                    case "Lowest Time/ Juicy":
                        if (x.equals(".50 inch / 13 mm"))
                        { ChickBreastBoneTemp = 10;
                            ChickBreastBoneTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickBreastBoneTemp = 30;
                            ChickBreastBoneTime = 40;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickBreastBoneTemp = 50;
                            ChickBreastBoneTime = 60;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickBreastBoneTemp = 70;
                            ChickBreastBoneTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickBreastBoneTemp = 90;
                            ChickBreastBoneTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickBreastBoneTemp = 110;
                            ChickBreastBoneTime = 120;}
                            break;

                        case "Medium Time/ Medium Cook":
                            if (x.equals(".50 inch / 13 mm")) {
                                ChickBreastBoneTemp = 130;
                                    ChickBreastBoneTime = 140;

                                }

                                if (x.equals("1.00 inch / 25 mm")) {
                                    ChickBreastBoneTemp = 150;
                                    ChickBreastBoneTime = 160;

                                }

                                if (x.equals("1.50 inch / 38 mm")) {
                                    ChickBreastBoneTemp =170;
                                    ChickBreastBoneTime = 180;

                                }

                                if (x.equals("2.00 inch / 51 mm")) {
                                    ChickBreastBoneTemp = 190;
                                    ChickBreastBoneTime = 200;
                                }

                                if (x.equals("2.50 inch / 63 mm")) {
                                    ChickBreastBoneTemp = 210;
                                    ChickBreastBoneTime = 220;
                                }

                                if (x.equals("3.00 inch / 76 mm")) {
                                    ChickBreastBoneTemp = 230;
                                    ChickBreastBoneTime = 240;
                                }

                                break;
                            case "Highest Time/ Thorough Cook":
                                if (x.equals(".50 inch / 13 mm")) {
                                    ChickBreastBoneTemp = 250;
                                    ChickBreastBoneTime = 260;

                                }

                                if (x.equals("1.00 inch / 25 mm")) {
                                    ChickBreastBoneTemp = 270;
                                    ChickBreastBoneTime = 280;

                                }

                                if (x.equals("1.50 inch / 38 mm")) {
                                    ChickBreastBoneTemp = 290;
                                    ChickBreastBoneTime = 300;

                                }

                                if (x.equals("2.00 inch / 51 mm")) {
                                    ChickBreastBoneTemp = 310;
                                    ChickBreastBoneTime = 320;
                                }

                                if (x.equals("2.50 inch / 63 mm")) {
                                    ChickBreastBoneTemp = 330;
                                    ChickBreastBoneTime = 340;
                                }

                                if (x.equals("3.00 inch / 76 mm")) {
                                    ChickBreastBoneTemp = 350;
                                    ChickBreastBoneTime = 360;
                                }


                                break;


                        }
                        Toast.makeText(ChickBreastBone.this, "\n Class: \t " + booyah +
                            "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickBreastBoneTemp + "\n Time: \t" + ChickBreastBoneTime, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });










        //spinTimeCook = findViewById(R.id.spinTimeCook);
        //String[] ChBrBoneTime = getResources().getStringArray(R.array.BreastBoneTime);
        //creates array for breast time cook & pulls values from breastbonetime txt file
        //ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBoneTime);
        //adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinTimeCook.setAdapter(adapter1);
    }


    //String example = spinBreastBone.getSelectedItem().toString();

    //public class MySpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

        //public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            //String selected = parent.getItemAtPosition(pos).toString();


        //public void onNothingSelected(AdapterView parent) {
            // Do nothing.





    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CookDisplaypage:

                Intent ChickBreastintent = new Intent(this, DisplayCook.class);
                //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                startActivity(ChickBreastintent);
                //break;
        }}}










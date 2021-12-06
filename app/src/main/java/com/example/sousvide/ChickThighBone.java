package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ChickThighBone extends AppCompatActivity implements View.OnClickListener{
    Spinner spinChickThighBone;
    Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int ChickThighBoneTemp, ChickThighBoneTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_thigh_bone);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinChickThighBone = (Spinner) findViewById(R.id.spinChickThighBone);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);
        spinChickThighBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(ChickThighBone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
                        break;
                }
                spinTimeCook.setVisibility(View.VISIBLE);
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
                        { ChickThighBoneTemp = 10;
                            ChickThighBoneTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickThighBoneTemp = 30;
                            ChickThighBoneTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickThighBoneTemp = 50;
                            ChickThighBoneTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickThighBoneTemp = 70;
                            ChickThighBoneTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickThighBoneTemp = 90;
                            ChickThighBoneTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBoneTemp = 110;
                            ChickThighBoneTime = 120;}
                        break;

                    case "Medium Time/ Medium Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickThighBoneTemp = 130;
                            ChickThighBoneTime = 140;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickThighBoneTemp = 150;
                            ChickThighBoneTime = 160;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickThighBoneTemp =170;
                            ChickThighBoneTime = 180;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickThighBoneTemp = 190;
                            ChickThighBoneTime = 200;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickThighBoneTemp = 210;
                            ChickThighBoneTime = 220;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBoneTemp = 230;
                            ChickThighBoneTime = 240;
                        }

                        break;
                    case "Highest Time/ Thorough Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickThighBoneTemp = 250;
                            ChickThighBoneTime = 260;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickThighBoneTemp = 270;
                            ChickThighBoneTime = 280;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickThighBoneTemp = 290;
                            ChickThighBoneTime = 300;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickThighBoneTemp = 310;
                            ChickThighBoneTime = 320;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickThighBoneTemp = 330;
                            ChickThighBoneTime = 340;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBoneTemp = 350;
                            ChickThighBoneTime = 360;
                        }


                        break;


                }
                Toast.makeText(ChickThighBone.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickThighBoneTemp + "\n Time: \t" + ChickThighBoneTime, Toast.LENGTH_LONG).show();

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





    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CookDisplaypage:

                Intent ChickBreastintent = new Intent(this, DisplayCook.class);
                //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                startActivity(ChickBreastintent);
                //break;
        }}}

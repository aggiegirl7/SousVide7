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

public class DuckBreast extends AppCompatActivity implements View.OnClickListener{
    Spinner spinDuckBreast;
    Spinner spinTimeCook;

    String selectedDiv, selectedClass, booyah, booyah1,x;
    int DuckBreastTemp, DuckBreastTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duck_breast);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinDuckBreast = (Spinner) findViewById(R.id.spinDuckBreast);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinDuckBreast.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(DuckBreast.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.DuckTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(DuckBreast.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.DuckTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(DuckBreast.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.DuckTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(DuckBreast.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.DuckTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(DuckBreast.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.DuckTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(DuckBreast.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.DuckTime6)));
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
                        { DuckBreastTemp = 10;
                            DuckBreastTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { DuckBreastTemp = 30;
                            DuckBreastTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {DuckBreastTemp = 50;
                            DuckBreastTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {DuckBreastTemp = 70;
                            DuckBreastTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {DuckBreastTemp = 90;
                            DuckBreastTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm")) {
                            DuckBreastTemp = 110;
                            DuckBreastTime = 120;}
                        break;

                    case "Medium Time/ Medium Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            DuckBreastTemp = 130;
                            DuckBreastTime = 140;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            DuckBreastTemp = 150;
                            DuckBreastTime = 160;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            DuckBreastTemp =170;
                            DuckBreastTime = 180;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            DuckBreastTemp = 190;
                            DuckBreastTime = 200;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            DuckBreastTemp = 210;
                            DuckBreastTime = 220;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            DuckBreastTemp = 230;
                            DuckBreastTime = 240;
                        }

                        break;
                    case "Highest Time/ Thorough Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            DuckBreastTemp = 250;
                            DuckBreastTime = 260;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            DuckBreastTemp = 270;
                            DuckBreastTime = 280;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            DuckBreastTemp = 290;
                            DuckBreastTime = 300;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            DuckBreastTemp = 310;
                            DuckBreastTime = 320;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            DuckBreastTemp = 330;
                            DuckBreastTime = 340;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            DuckBreastTemp = 350;
                            DuckBreastTime = 360;
                        }


                        break;


                }
                Toast.makeText(DuckBreast.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + DuckBreastTemp + "\n Time: \t" + DuckBreastTime, Toast.LENGTH_LONG).show();

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

        /*spinDuckBreast = findViewById(R.id.spinDuckBreast);
        String[] DkBrThick = getResources().getStringArray(R.array.DuckBreastThick);
        //create array for breast thickness & pulls values from text file
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, DkBrThick);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinDuckBreast.setAdapter(adapter);

        spinTimeCook= findViewById(R.id.spinTimeCook);
        String[] ChBrBoneTime = getResources().getStringArray(R.array.BreastBoneTime);
        //creates array for breast time cook & pulls values from breastbonetime txt file
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBoneTime);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTimeCook.setAdapter(adapter1);*/

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

public class ChickThighBoneless extends AppCompatActivity implements View.OnClickListener{
    Spinner spinChickThighBoneless;
    Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int ChickThighBonelessTemp, ChickThighBonelessTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_thigh_boneless);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinChickThighBoneless = (Spinner) findViewById(R.id.spinChickThighBoneless);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);
        spinChickThighBoneless.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickThighBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
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
                        { ChickThighBonelessTemp = 10;
                            ChickThighBonelessTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickThighBonelessTemp = 30;
                            ChickThighBonelessTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickThighBonelessTemp = 50;
                            ChickThighBonelessTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickThighBonelessTemp = 70;
                            ChickThighBonelessTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickThighBonelessTemp = 90;
                            ChickThighBonelessTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBonelessTemp = 110;
                            ChickThighBonelessTime = 120;}
                        break;

                    case "Medium Time/ Medium Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickThighBonelessTemp = 130;
                            ChickThighBonelessTime = 140;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickThighBonelessTemp = 150;
                            ChickThighBonelessTime = 160;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickThighBonelessTemp =170;
                            ChickThighBonelessTime = 180;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickThighBonelessTemp = 190;
                            ChickThighBonelessTime = 200;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickThighBonelessTemp = 210;
                            ChickThighBonelessTime = 220;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBonelessTemp = 230;
                            ChickThighBonelessTime = 240;
                        }

                        break;
                    case "Highest Time/ Thorough Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickThighBonelessTemp = 250;
                            ChickThighBonelessTime = 260;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickThighBonelessTemp = 270;
                            ChickThighBonelessTime = 280;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickThighBonelessTemp = 290;
                            ChickThighBonelessTime = 300;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickThighBonelessTemp = 310;
                            ChickThighBonelessTime = 320;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickThighBonelessTemp = 330;
                            ChickThighBonelessTime = 340;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBonelessTemp = 350;
                            ChickThighBonelessTime = 360;
                        }


                        break;


                }
                Toast.makeText(ChickThighBoneless.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickThighBonelessTemp + "\n Time: \t" + ChickThighBonelessTime, Toast.LENGTH_LONG).show();

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

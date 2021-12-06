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

public class ChickBreastBoneless extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinBreastBoneless;
    private Spinner spinTimeCook;
    //create spinner variables for breast boneless
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int ChickBreastBonelessTemp, ChickBreastBonelessTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_breast_boneless);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinBreastBoneless = (Spinner) findViewById(R.id.spinBreastBoneless);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        //spinBreastBoneless = findViewById(R.id.spinBreastBoneless);
        //String[] ChBrBonelessThick = getResources().getStringArray(R.array.BreastBonelessThick);
        //create array for breast thickness & pulls values from text file
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBonelessThick);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinBreastBoneless.setAdapter(adapter);

        //spinTimeCook= findViewById(R.id.spinTimeCook);
        //String[] ChBrBonelessTime = getResources().getStringArray(R.array.BreastBonelessTime);
        //creates array for breast time cook & pulls values from breastbonelesstime txt file
        //ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBonelessTime);
        //adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinTimeCook.setAdapter(adapter1);

        spinBreastBoneless.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(ChickBreastBone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBoneless.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
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
                        { ChickBreastBonelessTemp = 10;
                            ChickBreastBonelessTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickBreastBonelessTemp = 30;
                            ChickBreastBonelessTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickBreastBonelessTemp = 50;
                            ChickBreastBonelessTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickBreastBonelessTemp = 70;
                            ChickBreastBonelessTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickBreastBonelessTemp = 90;
                            ChickBreastBonelessTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickBreastBonelessTemp = 110;
                            ChickBreastBonelessTime = 120;}
                        break;

                    case "Medium Time/ Medium Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickBreastBonelessTemp = 130;
                            ChickBreastBonelessTime = 140;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickBreastBonelessTemp = 150;
                            ChickBreastBonelessTime = 160;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickBreastBonelessTemp =170;
                            ChickBreastBonelessTime = 180;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickBreastBonelessTemp = 190;
                            ChickBreastBonelessTime = 200;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickBreastBonelessTemp = 210;
                            ChickBreastBonelessTime = 220;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickBreastBonelessTemp = 230;
                            ChickBreastBonelessTime = 240;
                        }

                        break;
                    case "Highest Time/ Thorough Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickBreastBonelessTemp = 250;
                            ChickBreastBonelessTime = 260;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickBreastBonelessTemp = 270;
                            ChickBreastBonelessTime = 280;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickBreastBonelessTemp = 290;
                            ChickBreastBonelessTime = 300;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickBreastBonelessTemp = 310;
                            ChickBreastBonelessTime = 320;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickBreastBonelessTemp = 330;
                            ChickBreastBonelessTime = 340;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickBreastBonelessTemp = 350;
                            ChickBreastBonelessTime = 360;
                        }


                        break;


                }
                Toast.makeText(ChickBreastBoneless.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickBreastBonelessTemp + "\n Time: \t" + ChickBreastBonelessTime, Toast.LENGTH_LONG).show();

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
        }}


            }

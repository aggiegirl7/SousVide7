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
    String selectedDiv, selectedClass, booyah, booyah1,x, done,thick;
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
                        {
                            ChickThighBoneTemp = 140;                        // passing temp variable in F
                            ChickThighBoneTime = 65 * 60000;//6600000;
                            //passing variable in minutes
                            done = "Lowest Time/ Juicy";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch/ 13 mm";
                            //will pass string to show user "thickness" selection

                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickThighBoneTemp = 140;
                            ChickThighBoneTime = 115*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickThighBoneTemp = 140;
                            ChickThighBoneTime = 170*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickThighBoneTemp = 140;
                            ChickThighBoneTime = 220*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickThighBoneTemp = 140;
                            ChickThighBoneTemp = 285*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBoneTemp = 140;
                            ChickThighBoneTime = 350*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "3.00 inch / 76 mm";}
                        break;

                    case "Medium Time/ Medium Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickThighBoneTemp = 147;
                            ChickThighBoneTime = 45*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = ".50 inch / 13 mm";

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickThighBoneTemp = 147;
                            ChickThighBoneTime = 95*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "1.00 inch / 25 mm";

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickThighBoneTemp =147;
                            ChickThighBoneTime = 135*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "1.50 inch / 38 mm";

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickThighBoneTemp = 147;
                            ChickThighBoneTime = 175*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickThighBoneTemp = 147;
                            ChickThighBoneTime = 235*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBoneTemp = 147;
                            ChickThighBoneTime = 275*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "3.00 inch / 76 mm";
                        }

                        break;
                    case "Highest Time/ Thorough Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickThighBoneTemp = 175;
                            ChickThighBoneTime = 20*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = ".50 inch / 13 mm";

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickThighBoneTemp = 155;
                            ChickThighBoneTime = 80*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "1.00 inch / 25 mm";

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickThighBoneTemp = 155;
                            ChickThighBoneTime = 120*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "1.50 inch / 38 mm";

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickThighBoneTemp = 155;

                            ChickThighBoneTime = 185*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickThighBoneTemp =155 ;
                            ChickThighBoneTime = 215*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickThighBoneTemp = 155;
                            ChickThighBoneTime = 260*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "3.00 inch / 76 mm";
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

                Intent ChickBreastintent = new Intent(this, DisplayPreset.class);
                //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                startActivity(ChickBreastintent);
                //break;
        }}}

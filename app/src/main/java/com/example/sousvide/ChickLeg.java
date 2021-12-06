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

public class ChickLeg extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinChickLeg;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int ChickLegTemp, ChickLegTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_leg);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinChickLeg = (Spinner) findViewById(R.id.spinChickLeg);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinChickLeg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
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
                        { ChickLegTemp = 10;
                            ChickLegTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickLegTemp = 30;
                            ChickLegTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickLegTemp = 50;
                            ChickLegTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickLegTemp = 70;
                            ChickLegTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickLegTemp = 90;
                            ChickLegTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickLegTemp = 110;
                            ChickLegTime = 120;}
                        break;

                    case "Medium Time/ Medium Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickLegTemp = 130;
                            ChickLegTime = 140;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickLegTemp = 150;
                            ChickLegTime = 160;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickLegTemp =170;
                            ChickLegTime = 180;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickLegTemp = 190;
                            ChickLegTime = 200;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickLegTemp = 210;
                            ChickLegTime = 220;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickLegTemp = 230;
                            ChickLegTime = 240;
                        }

                        break;
                    case "Highest Time/ Thorough Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickLegTemp = 250;
                            ChickLegTime = 260;

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickLegTemp = 270;
                            ChickLegTime = 280;

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickLegTemp = 290;
                            ChickLegTime = 300;

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickLegTemp = 310;
                            ChickLegTime = 320;
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickLegTemp = 330;
                            ChickLegTime = 340;
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickLegTemp = 350;
                            ChickLegTime = 360;
                        }


                        break;


                }
                Toast.makeText(ChickLeg.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickLegTemp + "\n Time: \t" + ChickLegTime, Toast.LENGTH_LONG).show();

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

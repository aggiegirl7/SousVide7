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

public class PorkRibs extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinPorkRibs;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int PorkRibsTemp, PorkRibsTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork_ribs);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinPorkRibs = (Spinner) findViewById(R.id.spinPorkRibs);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinPorkRibs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Tbone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkRibs.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkRibs.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkRibs.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkRibs.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkRibs.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkRibs.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime6)));
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
                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkRibsTemp = 10;
                            PorkRibsTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkRibsTemp = 30;
                            PorkRibsTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkRibsTemp = 50;
                            PorkRibsTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkRibsTemp = 70;
                            PorkRibsTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkRibsTemp = 90;
                            PorkRibsTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkRibsTemp = 110;
                            PorkRibsTime = 120;}
                        break;

                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkRibsTemp = 130;
                            PorkRibsTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkRibsTemp = 150;
                            PorkRibsTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkRibsTemp = 170;
                            PorkRibsTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkRibsTemp = 190;
                            PorkRibsTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkRibsTemp = 210;
                            PorkRibsTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkRibsTemp = 230;
                            PorkRibsTime = 240;}

                        break;
                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkRibsTemp = 250;
                            PorkRibsTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkRibsTemp = 270;
                            PorkRibsTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkRibsTemp = 290;
                            PorkRibsTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkRibsTemp = 310;
                            PorkRibsTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkRibsTemp = 330;
                            PorkRibsTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkRibsTemp = 350;
                            PorkRibsTime = 360;}

                        break;






                }
                Toast.makeText(PorkRibs.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + PorkRibsTemp + "\n Time: \t" + PorkRibsTime, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });











    }




    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CookDisplaypage:

                Intent ChickBreastintent = new Intent(this, DisplayCook.class);
                //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                startActivity(ChickBreastintent);
                //break;
        }


    }



}

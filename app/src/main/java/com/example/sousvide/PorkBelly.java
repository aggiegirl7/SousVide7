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

public class PorkBelly extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinPorkBelly;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int PorkBellyTemp, PorkBellyTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork_belly);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinPorkBelly = (Spinner) findViewById(R.id.spinPorkBelly);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);



        spinPorkBelly.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkBelly.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkBelly.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkBelly.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkBelly.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkBelly.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkBelly.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime6)));
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
                        { PorkBellyTemp = 10;
                            PorkBellyTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkBellyTemp = 30;
                            PorkBellyTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkBellyTemp = 50;
                            PorkBellyTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkBellyTemp = 70;
                            PorkBellyTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkBellyTemp = 90;
                            PorkBellyTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkBellyTemp = 110;
                            PorkBellyTime = 120;}
                        break;

                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkBellyTemp = 130;
                            PorkBellyTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkBellyTemp = 150;
                            PorkBellyTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkBellyTemp = 170;
                            PorkBellyTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkBellyTemp = 190;
                            PorkBellyTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkBellyTemp = 210;
                            PorkBellyTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkBellyTemp = 230;
                            PorkBellyTime = 240;}

                        break;
                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkBellyTemp = 250;
                            PorkBellyTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkBellyTemp = 270;
                            PorkBellyTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkBellyTemp = 290;
                            PorkBellyTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkBellyTemp = 310;
                            PorkBellyTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkBellyTemp = 330;
                            PorkBellyTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkBellyTemp = 350;
                            PorkBellyTime = 360;}

                        break;






                }
                Toast.makeText(PorkBelly.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + PorkBellyTemp + "\n Time: \t" + PorkBellyTime, Toast.LENGTH_LONG).show();

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

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

public class PorkChop extends AppCompatActivity implements View.OnClickListener{

    private Spinner spinPorkChop;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int PorkChopTemp, PorkChopTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork_chop);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinPorkChop = (Spinner) findViewById(R.id.spinPorkChop);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinPorkChop.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkChop.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkChop.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkChop.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkChop.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkChop.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkChop.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime6)));
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
                        { PorkChopTemp = 10;
                            PorkChopTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkChopTemp = 30;
                            PorkChopTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkChopTemp = 50;
                            PorkChopTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkChopTemp = 70;
                            PorkChopTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkChopTemp = 90;
                            PorkChopTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkChopTemp = 110;
                            PorkChopTime = 120;}
                        break;

                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkChopTemp = 130;
                            PorkChopTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkChopTemp = 150;
                            PorkChopTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkChopTemp = 170;
                            PorkChopTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkChopTemp = 190;
                            PorkChopTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkChopTemp = 210;
                            PorkChopTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkChopTemp = 230;
                            PorkChopTime = 240;}

                        break;
                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkChopTemp = 250;
                            PorkChopTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkChopTemp = 270;
                            PorkChopTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkChopTemp = 290;
                            PorkChopTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkChopTemp = 310;
                            PorkChopTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkChopTemp = 330;
                            PorkChopTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkChopTemp = 350;
                            PorkChopTime = 360;}

                        break;






                }
                Toast.makeText(PorkChop.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + PorkChopTemp + "\n Time: \t" + PorkChopTime, Toast.LENGTH_LONG).show();

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

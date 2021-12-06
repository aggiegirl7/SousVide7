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

public class PorkTenderloin extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinPorkTenderloin;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int PorkTenderloinTemp, PorkTenderloinTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork_tenderloin);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinPorkTenderloin = (Spinner) findViewById(R.id.spinPorkTenderloin);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinPorkTenderloin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkTenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkTenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkTenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkTenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkTenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(PorkTenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.PorkTime6)));
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
                        { PorkTenderloinTemp = 10;
                            PorkTenderloinTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkTenderloinTemp = 30;
                            PorkTenderloinTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkTenderloinTemp = 50;
                            PorkTenderloinTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkTenderloinTemp = 70;
                            PorkTenderloinTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkTenderloinTemp = 90;
                            PorkTenderloinTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkTenderloinTemp = 110;
                            PorkTenderloinTime = 120;}
                        break;

                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkTenderloinTemp = 130;
                            PorkTenderloinTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkTenderloinTemp = 150;
                            PorkTenderloinTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkTenderloinTemp = 170;
                            PorkTenderloinTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkTenderloinTemp = 190;
                            PorkTenderloinTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkTenderloinTemp = 210;
                            PorkTenderloinTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkTenderloinTemp = 230;
                            PorkTenderloinTime = 240;}

                        break;
                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { PorkTenderloinTemp = 250;
                            PorkTenderloinTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { PorkTenderloinTemp = 270;
                            PorkTenderloinTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {PorkTenderloinTemp = 290;
                            PorkTenderloinTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {PorkTenderloinTemp = 310;
                            PorkTenderloinTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {PorkTenderloinTemp = 330;
                            PorkTenderloinTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {PorkTenderloinTemp = 350;
                            PorkTenderloinTime = 360;}

                        break;






                }
                Toast.makeText(PorkTenderloin.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + PorkTenderloinTemp + "\n Time: \t" + PorkTenderloinTime, Toast.LENGTH_LONG).show();

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
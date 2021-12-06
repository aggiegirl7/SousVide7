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

public class Tuna extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinTuna;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int TunaTemp, TunaTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuna);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinTuna = (Spinner) findViewById(R.id.spinTuna);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinTuna.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime6)));
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
                    case "Very Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm"))
                        { TunaTemp = 10;
                            TunaTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 30;
                            TunaTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TunaTemp = 50;
                            TunaTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 70;
                            TunaTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 90;
                            TunaTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 110;
                            TunaTime = 120;}
                        break;

                    case "Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm"))
                        { TunaTemp = 130;
                            TunaTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 150;
                            TunaTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {TunaTemp = 170;
                            TunaTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 190;
                            TunaTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 210;
                            TunaTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 230;
                            TunaTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { TunaTemp = 250;
                            TunaTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 270;
                            TunaTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TunaTemp = 290;
                            TunaTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 310;
                            TunaTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 330;
                            TunaTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 350;
                            TunaTime = 360;}

                        break;
                    case "Flaky and Firm":
                        if (x.equals(".50 inch / 13 mm"))
                        { TunaTemp = 370;
                            TunaTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 390;
                            TunaTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TunaTemp = 410;
                            TunaTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 430;
                            TunaTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 450;
                            TunaTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 470;
                            TunaTime = 480;}

                        break;






                }
                Toast.makeText(Tuna.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + TunaTemp + "\n Time: \t" + TunaTime, Toast.LENGTH_LONG).show();

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

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

public class Tilapia extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinTilapia;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int TilapiaTemp, TilapiaTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tilapia);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinTilapia = (Spinner) findViewById(R.id.spinTilapia);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);


        spinTilapia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tilapia.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tilapia.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tilapia.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tilapia.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tilapia.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tilapia.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime6)));
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
                        { TilapiaTemp = 10;
                            TilapiaTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 30;
                            TilapiaTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TilapiaTemp = 50;
                            TilapiaTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 70;
                            TilapiaTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 90;
                            TilapiaTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 110;
                            TilapiaTime = 120;}
                        break;

                    case "Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm"))
                        { TilapiaTemp = 130;
                            TilapiaTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 150;
                            TilapiaTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {TilapiaTemp = 170;
                            TilapiaTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 190;
                            TilapiaTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 210;
                            TilapiaTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 230;
                            TilapiaTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { TilapiaTemp = 250;
                            TilapiaTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 270;
                            TilapiaTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TilapiaTemp = 290;
                            TilapiaTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 310;
                            TilapiaTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 330;
                            TilapiaTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 350;
                            TilapiaTime = 360;}

                        break;
                    case "Flaky and Firm":
                        if (x.equals(".50 inch / 13 mm"))
                        { TilapiaTemp = 370;
                            TilapiaTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 390;
                            TilapiaTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TilapiaTemp = 410;
                            TilapiaTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 430;
                            TilapiaTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 450;
                            TilapiaTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 470;
                            TilapiaTime = 480;}

                        break;






                }
                Toast.makeText(Tilapia.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + TilapiaTemp + "\n Time: \t" + TilapiaTime, Toast.LENGTH_LONG).show();

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

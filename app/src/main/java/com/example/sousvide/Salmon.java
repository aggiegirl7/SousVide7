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

public class Salmon extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinSalmon;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int SalmonTemp, SalmonTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salmon);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinSalmon = (Spinner) findViewById(R.id.spinSalmon);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinSalmon.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Salmon.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Salmon.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Salmon.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Salmon.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Salmon.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Salmon.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime6)));
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
                        { SalmonTemp = 10;
                            SalmonTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { SalmonTemp = 30;
                            SalmonTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {SalmonTemp = 50;
                            SalmonTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {SalmonTemp = 70;
                            SalmonTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SalmonTemp = 90;
                            SalmonTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SalmonTemp = 110;
                            SalmonTime = 120;}
                        break;

                    case "Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm"))
                        { SalmonTemp = 130;
                            SalmonTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { SalmonTemp = 150;
                            SalmonTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {SalmonTemp = 170;
                            SalmonTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {SalmonTemp = 190;
                            SalmonTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SalmonTemp = 210;
                            SalmonTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SalmonTemp = 230;
                            SalmonTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { SalmonTemp = 250;
                            SalmonTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { SalmonTemp = 270;
                            SalmonTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {SalmonTemp = 290;
                            SalmonTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {SalmonTemp = 310;
                            SalmonTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SalmonTemp = 330;
                            SalmonTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SalmonTemp = 350;
                            SalmonTime = 360;}

                        break;
                    case "Flaky and Firm":
                        if (x.equals(".50 inch / 13 mm"))
                        { SalmonTemp = 370;
                            SalmonTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { SalmonTemp = 390;
                            SalmonTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {SalmonTemp = 410;
                            SalmonTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {SalmonTemp = 430;
                            SalmonTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SalmonTemp = 450;
                            SalmonTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SalmonTemp = 470;
                            SalmonTime = 480;}

                        break;






                }
                Toast.makeText(Salmon.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + SalmonTemp + "\n Time: \t" + SalmonTime, Toast.LENGTH_LONG).show();

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

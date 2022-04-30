package com.example.sousvide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Tuna extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinTuna;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1, x,thick,done;
    int TunaTemp, TunaTime;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuna);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinTuna = (Spinner) findViewById(R.id.spinTuna);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinTuna.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Tbone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch (selectedClass) {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.FishTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.FishTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.FishTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.FishTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.FishTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tuna.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.FishTime6)));
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

                switch (selectedDiv) {
                    case "Very Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm")) {
                            TunaTemp = 110;
                            TunaTime = 15 * 60*60;

                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch/ 13 mm";
                        }
                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 110;
                            TunaTime = 35*60*60;

                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        { TunaTemp = 110;

                            TunaTime = 85*60*60;
                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 110;
                            TunaTime = 120*60*60;


                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 110;
                            TunaTime = 155*60*60;


                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 110;
                            TunaTime = 200*60*60;

                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "3.00 inch / 76 mm";
                        }
                        break;

                    case "Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm")) {
                            TunaTemp = 120;
                            TunaTime = 15 * 60*60;

                            done = "Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch / 13 mm";
                        }
                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 120;
                            TunaTime = 35  *60*60;

                            done = "Lightly Cooked";
                            thick = "1.00 inch / 25 mm";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {TunaTemp = 120;
                            TunaTime = 85  *60*60;

                            done = "Lightly Cooked";
                            thick = "1.50 inch / 38 mm";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 120;
                            TunaTime = 120  *60*60;

                            done = "Lightly Cooked";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 120;
                            TunaTime = 155*60*60;

                            done = "Lightly Cooked";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 120;
                            TunaTime = 200  *60*60;

                            done = "Lightly Cooked";
                            thick = "3.00 inch / 76 mm";
                        }

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { TunaTemp = 132;
                            TunaTime = 15  * 60*60;

                            done = "Medium";
                            thick = ".50 inch / 13 mm";

                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 132;
                            TunaTime = 35  *60*60;

                            done = "Medium";
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TunaTemp = 132;
                            TunaTime = 85  *60*60;

                            done = "Medium";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 132;
                            TunaTime = 120  *60*60;

                            done = "Medium";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 132;
                            TunaTime = 155  *60*60;

                            done = "Medium";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 132;
                            TunaTime = 200  *60000;

                            done = "Medium";
                            thick = "3.00 inch / 76 mm";
                        }


                        break;
                    case "Flaky and Firm":
                        if (x.equals(".50 inch / 13 mm"))
                        { TunaTemp = 140;
                            TunaTime = 15  *60*60;

                            done = "Flaky and Firm";
                            thick = ".50 inch / 13 mm";
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TunaTemp = 140;
                            TunaTime = 45  *60*60;

                            thick = "1.00 inch / 25 mm";
                            done = "Flaky and Firm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {   TunaTemp = 140;
                            TunaTime = 85*60*60;

                            done = "Flaky and Firm";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TunaTemp = 140;
                            TunaTime = 120  *60*60;

                            done = "Flaky and Firm";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm"))
                        {TunaTemp = 140;
                            TunaTime = 155  *60*60;

                            done = "Flaky and Firm";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TunaTemp = 140;
                            TunaTime = 200 *60*60;

                            done = "Flaky and Firm";
                            thick = "3.00 inch / 76 mm";
                        }

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


                Intent example = new Intent(getApplicationContext(), DisplayPreset.class);
                //ChickBreastBoneTemp = 137;
                // passing temp variable in F
                //ChickBreastBoneTime = 110;

                String doneVar = String.valueOf(done);
                String thickVar = String.valueOf(thick);
                String chickBreastTemp = String.valueOf(TunaTemp);
                String chickBreastTime = String.valueOf(TunaTime);
               // String App = String.valueOf(Apptime);

                example.putExtra("message", doneVar);
                example.putExtra("message2", thickVar);
                example.putExtra("message3", chickBreastTemp);
                example.putExtra("message4", chickBreastTime);
               // example.putExtra("message5", App);

                startActivity(example);


        }

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("SendData");


        sendData = new SendData();
        // Integer testTemp = 20;
        //Integer testTime = 50;

        //private void addDatatoFirebase(int testTemp, int testTime) {
        // below 3 lines of code is used to set
        // data in our object class.
        sendData.getTime(TunaTime);
        sendData.getTemp(TunaTemp);


        // we are use add value event listener method
        // which is called with database reference.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // inside the method of on Data change we are setting
                // our object class to our database reference.
                // data base reference will sends data to firebase.
                databaseReference.setValue(sendData);

                // after adding this data we are showing toast message.
                // Toast.makeText(MainActivity.this, "data added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // if the data is not added or it is cancelled then
                // we are displaying a failure toast message.
                Toast.makeText(Tuna.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }


        });


    }
}
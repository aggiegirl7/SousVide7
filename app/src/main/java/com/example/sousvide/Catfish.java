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

public class Catfish extends AppCompatActivity implements View.OnClickListener {
        private Spinner spinCatfish;
        private Spinner spinTimeCook;
        String selectedDiv, selectedClass, booyah, booyah1,x;
        int CatfishTemp, CatfishTime; //, //;
        String done,thick;
        int MCUtime;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_catfish);

            Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
            CookDisplaypage.setOnClickListener(this);

            spinCatfish = (Spinner) findViewById(R.id.spinCatfish);
            spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);


            spinCatfish.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                            spinTimeCook.setAdapter(new ArrayAdapter<String>(com.example.sousvide.Catfish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime1)));

                            break;
                        case "1.00 inch / 25 mm":
                            spinTimeCook.setAdapter(new ArrayAdapter<String>(com.example.sousvide.Catfish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime2)));

                            break;
                        case "1.50 inch / 38 mm":
                            spinTimeCook.setAdapter(new ArrayAdapter<String>(com.example.sousvide.Catfish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime3)));

                            break;
                        case "2.00 inch / 51 mm":
                            spinTimeCook.setAdapter(new ArrayAdapter<String>(com.example.sousvide.Catfish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime4)));
                            break;

                        case "2.50 inch / 63 mm":
                            spinTimeCook.setAdapter(new ArrayAdapter<String>(com.example.sousvide.Catfish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime5)));

                            break;
                        case "3.00 inch / 76 mm":
                            spinTimeCook.setAdapter(new ArrayAdapter<String>(com.example.sousvide.Catfish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime6)));
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
                            if (x.equals(".50 inch / 13 mm")) {
                                CatfishTemp = 110;
                                // = 15 * 60*60;
                                CatfishTime = 15 *60000;
                                done = "Very Lightly Cooked";
                                //will pass string to show user "doneness" selection
                                thick = ".50 inch/ 13 mm";
                            }
                            if (x.equals("1.00 inch / 25 mm"))
                            { CatfishTemp = 110;
                                // = 35*60*60;
                                CatfishTime = 35*60000;
                                done = "Very Lightly Cooked";
                                //will pass string to show user "doneness" selection
                                thick = "1.00 inch / 25 mm";
                            }

                            if (x.equals("1.50 inch / 38 mm"))
                            { CatfishTemp = 110;
                                CatfishTime = 85*60000;
                                // = 85*60*60;
                                done = "Very Lightly Cooked";
                                //will pass string to show user "doneness" selection
                                thick = "1.50 inch / 38 mm";
                            }

                            if (x.equals("2.00 inch / 51 mm"))
                            {CatfishTemp = 110;
                                // = 120*60*60;
                                CatfishTime = 120*60000;

                                done = "Very Lightly Cooked";
                                //will pass string to show user "doneness" selection
                                thick = "2.00 inch / 51 mm";
                            }

                            if (x.equals("2.50 inch / 63 mm"))
                            {CatfishTemp = 110;
                                // = 155*60*60;
                                CatfishTime = 155*60000;

                                done = "Very Lightly Cooked";
                                //will pass string to show user "doneness" selection
                                thick = "2.50 inch / 63 mm";}

                            if (x.equals("3.00 inch / 76 mm"))
                            {CatfishTemp = 110;
                                // = 200*60*60;
                                CatfishTime = 200*60000;
                                done = "Very Lightly Cooked";
                                //will pass string to show user "doneness" selection
                                thick = "3.00 inch / 76 mm";
                            }
                            break;

                        case "Lightly Cooked":
                            if (x.equals(".50 inch / 13 mm")) {
                                CatfishTemp = 120;
                                // = 15 * 60*60;
                                CatfishTime = 15*60000;
                                done = "Lightly Cooked";
                                //will pass string to show user "doneness" selection
                                thick = ".50 inch / 13 mm";
                            }
                            if (x.equals("1.00 inch / 25 mm"))
                            { CatfishTemp = 120;
                                // = 35  *60*60;
                                CatfishTime =35*60000;
                                done = "Lightly Cooked";
                                thick = "1.00 inch / 25 mm";}

                            if (x.equals("1.50 inch / 38 mm"))
                            {CatfishTemp = 120;
                                // = 85  *60*60;
                                CatfishTime = 85*60000;
                                done = "Lightly Cooked";
                                thick = "1.50 inch / 38 mm";}

                            if (x.equals("2.00 inch / 51 mm"))
                            {CatfishTemp = 120;
                                // = 120  *60*60;
                                CatfishTime =120*60000;
                                done = "Lightly Cooked";
                                thick = "2.00 inch / 51 mm";}

                            if (x.equals("2.50 inch / 63 mm"))
                            {CatfishTemp = 120;
                                // = 155*60*60;
                                CatfishTime =155*60000;
                                done = "Lightly Cooked";
                                thick = "2.50 inch / 63 mm";
                            }

                            if (x.equals("3.00 inch / 76 mm"))
                            {CatfishTemp = 120;
                                // = 200  *60*60;
                                CatfishTime =200*60000;
                                done = "Lightly Cooked";
                                thick = "3.00 inch / 76 mm";
                            }

                            break;
                        case "Medium":
                            if (x.equals(".50 inch / 13 mm"))
                            { CatfishTemp = 132;
                                // = 15  * 60*60;
                                CatfishTime = 15 *60000;
                                done = "Medium";
                                thick = ".50 inch / 13 mm";

                            }

                            if (x.equals("1.00 inch / 25 mm"))
                            { CatfishTemp = 132;
                                // = 35  *60*60;
                                CatfishTime = 35*60000;
                                done = "Medium";
                                thick = "1.00 inch / 25 mm";
                            }

                            if (x.equals("1.50 inch / 38 mm"))
                            {CatfishTemp = 132;
                                // = 85  *60*60;
                                CatfishTime = 85*60000;
                                done = "Medium";
                                thick = "1.50 inch / 38 mm";
                            }

                            if (x.equals("2.00 inch / 51 mm"))
                            {CatfishTemp = 132;
                                // = 120  *60*60;
                                CatfishTime =120 *60000;
                                done = "Medium";
                                thick = "2.00 inch / 51 mm";}

                            if (x.equals("2.50 inch / 63 mm"))
                            {CatfishTemp = 132;
                                // = 155  *60*60;
                                CatfishTime =155*60000;
                                done = "Medium";
                                thick = "2.50 inch / 63 mm";
                            }

                            if (x.equals("3.00 inch / 76 mm"))
                            {CatfishTemp = 132;
                                // = 200  *60000;
                                CatfishTime =200*60000;
                                done = "Medium";
                                thick = "3.00 inch / 76 mm";
                            }


                            break;
                        case "Flaky and Firm":
                            if (x.equals(".50 inch / 13 mm"))
                            { CatfishTemp = 140;
                                // = 15  *60*60;
                                CatfishTime = 15 *60000;
                                done = "Flaky and Firm";
                                thick = ".50 inch / 13 mm";
                            }

                            if (x.equals("1.00 inch / 25 mm"))
                            { CatfishTemp = 140;
                                // = 45  *60*60;
                                CatfishTime =45*60000;
                                done = "Flaky and Firm";
                                thick = "1.00 inch / 25 mm";
                            }

                            if (x.equals("1.50 inch / 38 mm"))
                            {   CatfishTemp = 140;
                                // = 85*60*60;
                                CatfishTime = 85*60000;
                                done = "Flaky and Firm";
                                thick = "1.50 inch / 38 mm";
                            }

                            if (x.equals("2.00 inch / 51 mm"))
                            {CatfishTemp = 140;
                                // = 120  *60*60;
                                CatfishTime =120*60000;
                                done = "Flaky and Firm";
                                thick = "2.00 inch / 51 mm";
                            }

                            if (x.equals("2.50 inch / 63 mm"))
                            {CatfishTemp = 140;
                                // = 155  *60*60;
                                CatfishTime =155*60000;
                                done = "Flaky and Firm";
                                thick = "2.50 inch / 63 mm";}

                            if (x.equals("3.00 inch / 76 mm"))
                            {CatfishTemp = 140;
                                // = 200 *60*60;
                                CatfishTime =200*60000;
                                done = "Flaky and Firm";
                                thick = "3.00 inch / 76 mm";
                            }

                            break;






                    }
                    Toast.makeText(com.example.sousvide.Catfish.this, "\n Class: \t " + booyah +
                            "\n Div: \t" + selectedDiv + "\n Temp : \t" + CatfishTemp + "\n Time: \t" + CatfishTime, Toast.LENGTH_LONG).show();

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

                    Intent ChickBreastintent = new Intent(this, DisplayPreset.class);
                    //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                    startActivity(ChickBreastintent);
                    //break;

                    Intent example = new Intent(getApplicationContext(),DisplayPreset.class);
                    //ChickBreastBoneTemp = 137;
                    // passing temp variable in F
                    //ChickBreastBoneTime = 110;

                    String doneVar = String.valueOf(done);
                    String thickVar = String.valueOf(thick);
                    String chickBreastTemp = String.valueOf(CatfishTemp);
                    String chickBreastTime = String.valueOf(CatfishTime);
                    String App = String.valueOf(CatfishTime);

                    example.putExtra("message",doneVar);
                    example.putExtra("message2",thickVar);
                    example.putExtra("message3",chickBreastTemp);
                    example.putExtra("message4",chickBreastTime);
                    //example.putExtra("message5",App);

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
            sendData.getTime(CatfishTime);
            sendData.getTemp(CatfishTemp);


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
                    Toast.makeText(Catfish.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
                }
            });
        }



    }

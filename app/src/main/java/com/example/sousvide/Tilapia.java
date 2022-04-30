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

public class Tilapia extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinTilapia;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x,done,thick;
    int TilapiaTemp, TilapiaTime;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;

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
                        if (x.equals(".50 inch / 13 mm")) {
                            TilapiaTemp = 110;
                            TilapiaTime = 15 * 60*60;

                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch/ 13 mm";
                        }
                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 110;
                            TilapiaTime = 35*60*60;

                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        { TilapiaTemp = 110;

                            TilapiaTime = 85*60*60;
                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 110;
                            TilapiaTime = 120*60*60;


                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 110;
                            TilapiaTime = 155*60*60;


                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 110;
                            TilapiaTime = 200*60*60;

                            done = "Very Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = "3.00 inch / 76 mm";
                        }
                        break;

                    case "Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm")) {
                            TilapiaTemp = 120;
                            TilapiaTime = 15 * 60*60;

                            done = "Lightly Cooked";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch / 13 mm";
                        }
                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 120;
                            TilapiaTime = 35  *60*60;

                            done = "Lightly Cooked";
                            thick = "1.00 inch / 25 mm";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {TilapiaTemp = 120;
                            TilapiaTime = 85  *60*60;

                            done = "Lightly Cooked";
                            thick = "1.50 inch / 38 mm";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 120;
                            TilapiaTime = 120  *60*60;

                            done = "Lightly Cooked";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 120;
                            TilapiaTime = 155*60*60;

                            done = "Lightly Cooked";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 120;
                            TilapiaTime = 200  *60*60;

                            done = "Lightly Cooked";
                            thick = "3.00 inch / 76 mm";
                        }

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { TilapiaTemp = 132;
                            TilapiaTime = 15  * 60*60;

                            done = "Medium";
                            thick = ".50 inch / 13 mm";

                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 132;
                            TilapiaTime = 35  *60*60;

                            done = "Medium";
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TilapiaTemp = 132;
                            TilapiaTime = 85  *60*60;

                            done = "Medium";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 132;
                            TilapiaTime = 120  *60*60;

                            done = "Medium";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 132;
                            TilapiaTime = 155  *60*60;

                            done = "Medium";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 132;
                            TilapiaTime = 200  *60000;

                            done = "Medium";
                            thick = "3.00 inch / 76 mm";
                        }


                        break;
                    case "Flaky and Firm":
                        if (x.equals(".50 inch / 13 mm"))
                        { TilapiaTemp = 140;
                            TilapiaTime = 15  *60*60;

                            done = "Flaky and Firm";
                            thick = ".50 inch / 13 mm";
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TilapiaTemp = 140;
                            TilapiaTime = 45  *60*60;

                            thick = "1.00 inch / 25 mm";
                            done = "Flaky and Firm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {   TilapiaTemp = 140;
                            TilapiaTime = 85*60*60;

                            done = "Flaky and Firm";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TilapiaTemp = 140;
                            TilapiaTime = 120  *60*60;

                            done = "Flaky and Firm";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm"))
                        {TilapiaTemp = 140;
                            TilapiaTime = 155  *60*60;

                            done = "Flaky and Firm";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TilapiaTemp = 140;
                            TilapiaTime = 200 *60*60;

                            done = "Flaky and Firm";
                            thick = "3.00 inch / 76 mm";
                        }

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


        Intent example = new Intent(getApplicationContext(), DisplayPreset.class);
        //ChickBreastBoneTemp = 137;
        // passing temp variable in F
        //ChickBreastBoneTime = 110;

        String doneVar = String.valueOf(done);
        String thickVar = String.valueOf(thick);
        String chickBreastTemp = String.valueOf(TilapiaTemp);
        String chickBreastTime = String.valueOf(TilapiaTime);
        // String App = String.valueOf(Apptime);

        example.putExtra("message", doneVar);
        example.putExtra("message2", thickVar);
        example.putExtra("message3", chickBreastTemp);
        example.putExtra("message4", chickBreastTime);
        //example.putExtra("message5", App);

        startActivity(example);


    }

    Intent example = new Intent(getApplicationContext(), DisplayPreset.class);
    //ChickBreastBoneTemp = 137;
    // passing temp variable in F
    //ChickBreastBoneTime = 110;

    String doneVar = String.valueOf(done);
    String thickVar = String.valueOf(thick);
    String chickBreastTemp = String.valueOf(TilapiaTemp);
    String chickBreastTime = String.valueOf(TilapiaTime);

        example.putExtra("message", doneVar);
        example.putExtra("message2", thickVar);
        example.putExtra("message3", chickBreastTemp);
        example.putExtra("message4", chickBreastTime);

    startActivity(example);
    //notification();



                /*RequestBody formBody = new FormBody.Builder()
                        .add("ChickBreastBoneTemp", "350")
                        .add("ChickBreastBoneTime", "110")
                        .build();
//http://192.168.4.1/temperature
                Request request = new Request.Builder()
                        .url("http://192.168.4.1/temperature")
                        .post(formBody)
                        .build();


                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

                        if(response.isSuccessful()){
                            ResponseBody responseBody = response.body();
                            Log.i("bro", "posted! 23" );
                        }

                    }

                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        e.printStackTrace();
                        Log.i("bro", "nada 23");
                    }
                });*/




    ;


    firebaseDatabase = FirebaseDatabase.getInstance();
    databaseReference =firebaseDatabase.getReference("SendData");


    sendData =new

    SendData();
    // Integer testTemp = 20;
    //Integer testTime = 50;

    //private void addDatatoFirebase(int testTemp, int testTime) {
    // below 3 lines of code is used to set
    // data in our object class.
        sendData.getTime(TilapiaTime);
        sendData.getTemp(TilapiaTemp);


    // we are use add value event listener method
    // which is called with database reference.
        databaseReference.addValueEventListener(new

    ValueEventListener() {
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
            Toast.makeText(Tilapia.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
        }


    }
        );}



}

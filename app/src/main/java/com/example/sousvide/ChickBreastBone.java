package com.example.sousvide;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.androidnetworking.AndroidNetworking;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import okhttp3.OkHttpClient;

public class ChickBreastBone extends AppCompatActivity implements View.OnClickListener {
    Spinner spinBreastBone;
    Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x, done, thick;
    int ChickBreastBoneTemp, ChickBreastBoneTime;
    private final OkHttpClient client = new OkHttpClient();
    //private String strPOST_URL = "http://192.168.4.1/post"; //POST

    //DATABASE
   FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;

    /////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_breast_bone);
        AndroidNetworking.initialize(getApplicationContext());

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("SendData");






            Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinBreastBone = (Spinner) findViewById(R.id.spinBreastBone);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);
        //String[] ChBrBoneThick = getResources().getStringArray(R.array.BreastBoneThick);
        //create array for breast thickness & pulls values from text file
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBoneThick);
       // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinBreastBone.setAdapter(adapter);
        spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(ChickBreastBone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
                        break;
                }

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
                    case "Lowest Time/ Juicy":
                        if (x.equals(".50 inch / 13 mm"))
                        {
                            ChickBreastBoneTemp = 120;                        // passing temp variable in F
                            ChickBreastBoneTime = 65 * 60000;//6600000;
                            //passing variable in minutes
                            done = "Lowest Time/ Juicy";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch/ 13 mm";
                            //will pass string to show user "thickness" selection

                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickBreastBoneTemp = 140;
                            ChickBreastBoneTime = 115*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "1.00 inch / 25 mm";
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickBreastBoneTemp = 140;
                            ChickBreastBoneTime = 170*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "1.50 inch / 38 mm";
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickBreastBoneTemp = 140;
                            ChickBreastBoneTime = 220*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickBreastBoneTemp = 140;
                            ChickBreastBoneTemp = 285*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickBreastBoneTemp = 140;
                            ChickBreastBoneTime = 350*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "3.00 inch / 76 mm";}
                            break;

                        case "Medium Time/ Medium Cook":
                            if (x.equals(".50 inch / 13 mm")) {
                                ChickBreastBoneTemp = 147;
                                    ChickBreastBoneTime = 45*60000;
                                done = "Medium Time/ Medium Cook";
                                thick = ".50 inch / 13 mm";

                                }

                                if (x.equals("1.00 inch / 25 mm")) {
                                    ChickBreastBoneTemp = 147;
                                    ChickBreastBoneTime = 95*60000;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "1.00 inch / 25 mm";

                                }

                                if (x.equals("1.50 inch / 38 mm")) {
                                    ChickBreastBoneTemp =147;
                                    ChickBreastBoneTime = 135*60000;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "1.50 inch / 38 mm";

                                }

                                if (x.equals("2.00 inch / 51 mm")) {
                                    ChickBreastBoneTemp = 147;
                                    ChickBreastBoneTime = 175*60000;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "2.00 inch / 51 mm";
                                }

                                if (x.equals("2.50 inch / 63 mm")) {
                                    ChickBreastBoneTemp = 147;
                                    ChickBreastBoneTime = 235*60000;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "2.50 inch / 63 mm";
                                }

                                if (x.equals("3.00 inch / 76 mm")) {
                                    ChickBreastBoneTemp = 147;
                                    ChickBreastBoneTime = 275*60000;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "3.00 inch / 76 mm";
                                }

                                break;
                            case "Highest Time/ Thorough Cook":
                                if (x.equals(".50 inch / 13 mm")) {
                                    ChickBreastBoneTemp = 175;
                                    ChickBreastBoneTime = 20*60000;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = ".50 inch / 13 mm";

                                }

                                if (x.equals("1.00 inch / 25 mm")) {
                                    ChickBreastBoneTemp = 155;
                                    ChickBreastBoneTime = 80*60000;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "1.00 inch / 25 mm";

                                }

                                if (x.equals("1.50 inch / 38 mm")) {
                                    ChickBreastBoneTemp = 155;
                                    ChickBreastBoneTime = 120*60000;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "1.50 inch / 38 mm";

                                }

                                if (x.equals("2.00 inch / 51 mm")) {
                                    ChickBreastBoneTemp = 155;

                                    ChickBreastBoneTime = 185*60000;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "2.00 inch / 51 mm";
                                }

                                if (x.equals("2.50 inch / 63 mm")) {
                                    ChickBreastBoneTemp =155 ;
                                    ChickBreastBoneTime = 215*60000;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "2.50 inch / 63 mm";
                                }

                                if (x.equals("3.00 inch / 76 mm")) {
                                    ChickBreastBoneTemp = 155;
                                    ChickBreastBoneTime = 260*60000;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "3.00 inch / 76 mm";
                                }


                                break;


                        }
                        Toast.makeText(ChickBreastBone.this, "\n Class: \t " + booyah +
                            "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickBreastBoneTemp + "\n Time: \t" + ChickBreastBoneTime, Toast.LENGTH_LONG).show();

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
                startActivity(ChickBreastintent);

                Intent example = new Intent(getApplicationContext(),DisplayPreset.class);
                //ChickBreastBoneTemp = 137;
                // passing temp variable in F
                //ChickBreastBoneTime = 110;

                String doneVar = String.valueOf(done);
                String thickVar = String.valueOf(thick);
                String chickBreastTemp = String.valueOf(ChickBreastBoneTemp);
                String chickBreastTime = String.valueOf(ChickBreastBoneTime);

                example.putExtra("message",doneVar);
                example.putExtra("message2",thickVar);
                example.putExtra("message3",chickBreastTemp);
                example.putExtra("message4",chickBreastTime);

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








        };


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("SendData");


        sendData = new SendData();
       // Integer testTemp = 20;
        //Integer testTime = 50;

        //private void addDatatoFirebase(int testTemp, int testTime) {
        // below 3 lines of code is used to set
        // data in our object class.
        sendData.getTime(ChickBreastBoneTime);
        sendData.getTemp(ChickBreastBoneTemp);


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
                Toast.makeText(ChickBreastBone.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });




    }

    /*private void notification()  {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
               // .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("textTitle")
                .setContentText("textContent")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        int notificationID = 101;

        NotificationManager notifyMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        notifyMgr.notify(notificationID, builder.build());*/
            /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                NotificationChannel channel =
                        new NotificationChannel("n", "n", NotificationManager.IMPORTANCE_DEFAULT);
                NotificationManager manager = getSystemService(NotificationManager.class);
                manager.createNotificationChannel(channel);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "n")
                        .setContentText("Bailey Works")
                        // .setSmallIcon(R.drawable.)
                        .setAutoCancel(true)
                        .setContentText("Water Level Low!");

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
                managerCompat.notify(999, builder.build());
                Log.i("bro", "Notification()");
                Toast.makeText(ChickBreastBone.this, "Notification()", Toast.LENGTH_LONG).show();
*/             // notificationManager.notify()
            }



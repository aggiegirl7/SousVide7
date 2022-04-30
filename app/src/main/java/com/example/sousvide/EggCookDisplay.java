package com.example.sousvide;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Locale;

public class EggCookDisplay extends AppCompatActivity {
    private TextView alertTextView;
    private int foodFinish =0;
    int firstGood = 0;
    int timeFirst = 0;
    int Preheat = 0;

    ImageView checkImg;

    /*checkImg = findViewById(R.id.checkpreheat);
    int imgRes = 0;*/



    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    DatabaseReference notifprac;

    SendData sendData;

    private TextView retrieveTV;
    //String time = example.getStringExtra("message4");

    //TIMER







    //start time for timer
    long START_TIME_IN_MILLIS ;




    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;

    private CountDownTimer mCountDownTimer;

    private boolean mTimerRunning;

    private long mTimeLeftInMillis =60000;
    private long mEndTime;





    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.checkCon:


                if (isConnectedTo("0c17da", EggCookDisplay.this)) {
                    Toast.makeText(EggCookDisplay.this, "\n Class: \t " + "You're still connected!", Toast.LENGTH_LONG).show();

                    //Call into other class
                    //openFoodChooser();
                } else {
                    Toast.makeText(EggCookDisplay.this, "\n Class: \t " + "You are not connected to the correct wifi, please try again.", Toast.LENGTH_LONG).show();
                }
        }}



    //push notification for low water
    private void notification() {

        //Intent intent = new Intent(this, EggCookDisplay.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Warning! Water bath level is too low!")
                .setContentText("Please add water to the bath.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                // .setContentIntent(pendingIntent)
                .setAutoCancel(true);


        int notificationID = 101;

        NotificationManager notifyMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        notifyMgr.notify(notificationID, builder.build());
        //Toast.makeText(EggCookDisplay.this, "Notification()", Toast.LENGTH_LONG).show();
    }
    //push notification overheating
    private void notification2() {

        //Intent intent = new Intent(this, EggCookDisplay.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Warning!")
                .setContentText("System is Overheating! Please Unplug System.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                // .setContentIntent(pendingIntent)
                .setAutoCancel(true);


        int notificationID = 101;

        NotificationManager notifyMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        notifyMgr.notify(notificationID, builder.build());
        // Toast.makeText(EggCookDisplay.this, "Notification2()", Toast.LENGTH_LONG).show();
    }
    // under value
    private void notification3() {

        //Intent intent = new Intent(this, EggCookDisplay.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Warning! System is not heating properly.")
                .setContentText("Food may be unsafe to eat!")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                // .setContentIntent(pendingIntent)
                .setAutoCancel(true);


        int notificationID = 101;

        NotificationManager notifyMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        notifyMgr.notify(notificationID, builder.build());
        //Toast.makeText(EggCookDisplay.this, "Notification3()", Toast.LENGTH_LONG).show();
    }
    //Preheat Done
    private void notification4() {

        //Intent intent = new Intent(this, EggCookDisplay.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Your water bath is finished preheating!")
                .setContentText("Please go to SousVide App.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                // .setContentIntent(pendingIntent)
                .setAutoCancel(true);


        int notificationID = 101;

        NotificationManager notifyMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        notifyMgr.notify(notificationID, builder.build());
        //Toast.makeText(EggCookDisplay.this, "Notification()", Toast.LENGTH_LONG).show();
    }

    private void notification5() {

        //Intent intent = new Intent(this, EggCookDisplay.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background)

                .setContentTitle("Your food is done!")
                .setContentText("Please go to SousVide App.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                // .setContentIntent(pendingIntent)
                .setAutoCancel(true);


        int notificationID = 101;

        NotificationManager notifyMgr = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        notifyMgr.notify(notificationID, builder.build());
        //Toast.makeText(EggCookDisplay.this, "Notification()", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_preset);

        TextView textView2 = (TextView) findViewById(R.id.Timedisp);
        TextView textView1 = (TextView) findViewById(R.id.Tempdisp);

        Intent example = getIntent();
        String thick = example.getStringExtra("message");
        String done = example.getStringExtra("message2");
        String temp = example.getStringExtra("message3");
        String time = example.getStringExtra("message4");
        String App = example.getStringExtra("message5");



        textView2.setText("" + thick);
        textView1.setText("" + done);
        //timeFirst = 0;

        START_TIME_IN_MILLIS = Long.parseLong(time);
        //START_TIME_IN_MILLIS = 10000;
        //mTimeLeftInMillis = START_TIME_IN_MILLIS;
//        updateCountDownText();
//        updateButtons();





        //SEND WHEN TIMER IS DONE
        //databaseReference = firebaseDatabase.getReference("SendData");

        //TIMER
        mTextViewCountDown = findViewById(R.id.text_view_countdown);

        mButtonStartPause = findViewById(R.id.button_start_pause);
        mButtonReset = findViewById(R.id.button_reset);

        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });
        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });


        /*TextView textView2 = (TextView) findViewById(R.id.Timedisp);
        TextView textView1 = (TextView) findViewById(R.id.Tempdisp);

        Intent example = getIntent();
        String thick = example.getStringExtra("message");
        String done = example.getStringExtra("message2");
        String temp = example.getStringExtra("message3");
        String time = example.getStringExtra("message4");

        textView2.setText("" + thick);
        textView1.setText("" + done);
        START_TIME_IN_MILLIS = Long.parseLong(time);*/
        // ((MyApp) this.get()).setSomeVar(time);

        /*class MyApp extends Application {
            privagte String someVar;

            public String getSome() {
                someVar = time;
                return someVar;
            }

            public void setSomeVar(String someVar) {
                this.someVar = someVar;
            }

        }
*/
        /*MyApp mApp = ((MyApp) getApplicationContext());
        String temp2 = mApp.getSome();*/
        //long START_TIME_IN_MILLIS = 20;





        //firebase
        // below line is used to get the instance
        // of our Firebase database.
        firebaseDatabase = FirebaseDatabase.getInstance();

        // below line is used to get
        // reference for our database.
        databaseReference = firebaseDatabase.getReference("Data");
        databaseReference = firebaseDatabase.getReference("data");

        DatabaseReference reference = firebaseDatabase.getReference();
        reference.child("WaterSensor")
                .addValueEventListener(new ValueEventListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                        //for(DataSnapshot child: children)
                        //{

                        Integer value2 = dataSnapshot.getValue(Integer.class);
                        if (value2 == 1) {

                            notification();

                            Toast.makeText(EggCookDisplay.this, "" + value2.toString(), Toast.LENGTH_LONG).show();
                            AlertDialog.Builder builder = new AlertDialog.Builder(EggCookDisplay.this);

                            builder.setCancelable(true);
                            builder.setTitle("Warning!");
                            builder.setMessage("Water bath level is too low");

                            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });

                            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //alertTextView.setVisibility(View.VISIBLE);
                                }
                            });
                            builder.show();

                        }
                        //}
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        DatabaseReference reference1 = firebaseDatabase.getReference();
        reference1.child("data")
                .addValueEventListener(new ValueEventListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot2) {
                        Iterable<DataSnapshot> children = dataSnapshot2.getChildren();
                        //for(DataSnapshot child: children)
                        //{
                        checkImg = findViewById(R.id.checkpreheat);
                        int imgRes = 0;

                        Integer value = dataSnapshot2.getValue(Integer.class);
                        int x = Integer.valueOf(temp) - 30;
                        int y = Integer.valueOf(temp)+ 30;
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(EggCookDisplay.this);


                        if((value > Integer.valueOf((temp))-5) && (Preheat == 0)){
                            imgRes = R.drawable.check;


                            notification4(); //preheat done push notification
                            //preheat done IN APP notif
                            Preheat = 1;


                            builder3.setCancelable(true);
                            builder3.setTitle("Preheat Finished!");
                            builder3.setMessage("Please insert your vacuum sealed food into the bath and press Start to start your timer.");

                            Toast.makeText(EggCookDisplay.this, "" + Preheat, Toast.LENGTH_LONG).show();

                            builder3.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });

                            builder3.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //alertTextView.setVisibility(View.VISIBLE);
                                }
                            });
                            builder3.show();
                        }


                        else if (value < Integer.valueOf(temp)) {
                            imgRes = R.drawable.x;
                        }
                        checkImg.setImageResource(imgRes);
                        //take in the temperature and sets the firstGood value to 1 during preheat
                        //then if temp dips 30 below or 30 above the set temperature then send notification
                        if (value > Integer.valueOf(temp)-5 && firstGood == 0)
                        {firstGood = 1;

                            Toast.makeText(EggCookDisplay.this, "first good" + firstGood, Toast.LENGTH_LONG).show();
                        }

                        else if (((value <= x) || (value >= y) )&& (firstGood == 1)) {




                            Toast.makeText(EggCookDisplay.this, "" + value.toString(), Toast.LENGTH_LONG).show();
                            AlertDialog.Builder builder = new AlertDialog.Builder(EggCookDisplay.this);
                            AlertDialog.Builder builder5 = new AlertDialog.Builder(EggCookDisplay.this);
                            if (value >Integer.valueOf(temp)+30)
                            {
                                notification2();
                                builder.setCancelable(true);
                                builder.setTitle("Warning!");
                                builder.setMessage("System is overheating, please unplug.");


                                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });

                                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        //alertTextView.setVisibility(View.VISIBLE);
                                    }
                                });
                                builder.show();}

                            if(value >Integer.valueOf(temp)-5){
                                Preheat = 1;
                                Toast.makeText(EggCookDisplay.this, "Preheat" + Preheat, Toast.LENGTH_LONG).show();
                            }

                            if((value<Integer.valueOf(temp)-30) && Preheat ==1)

                            {notification3();

                                builder5.setCancelable(true);
                                builder5.setTitle("Warning!");
                                builder5.setMessage("System is not heating properly, food may be unsafe to eat. Please unplug.");

                                builder5.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });

                                builder5.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        //alertTextView.setVisibility(View.VISIBLE);
                                    }
                                });
                                builder5.show();}

                        }}
                    //}


                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });



        // initializing our object class variable.
        retrieveTV = findViewById(R.id.idTVRetrieveData);

        // calling method
        // for getting data.
        getdata();
        databaseReference = firebaseDatabase.getReference("SendData");
        sendData = new SendData();
        sendData.getTime();
    }






    //TIMER TRY

    public void startTimer() {
        mEndTime = System.currentTimeMillis() + mTimeLeftInMillis;

        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
                Toast.makeText(EggCookDisplay.this, "Finished!", Toast.LENGTH_SHORT).show();
                updateButtons();

                notification5();

                //Toast.makeText(EggCookDisplay.this, "" + value2.toString(), Toast.LENGTH_LONG).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(EggCookDisplay.this);

                builder.setCancelable(true);
                builder.setTitle("Your food is done!");
                builder.setMessage("Please remove your food and enjoy!");

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
                //sets variable to 1, showing that timer is finished
                foodFinish = 1;

                databaseReference = firebaseDatabase.getReference("SendBlah");
                sendData = new SendData();
                sendData.getTime(foodFinish);

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
                        Toast.makeText(EggCookDisplay.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
                    }
                });
                //sends finished variable to 1 so mcu knows to stop
                /*databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        // inside the method of on Data change we are setting
                        // our object class to our database reference.
                        // data base reference will sends data to firebase.
                        databaseReference.setValue(foodFinish);

                        // after adding this data we are showing toast message.
                        // Toast.makeText(MainActivity.this, "data added", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        // if the data is not added or it is cancelled then
                        // we are displaying a failure toast message.
                        Toast.makeText(EggCookDisplay.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
                    }
                });*/

            }
        }.start();

        mTimerRunning = true;

        updateButtons();
    }

    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        updateButtons();
    }

    private void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        updateButtons();
    }

    private void updateCountDownText() {
        Toast.makeText(EggCookDisplay.this, "timefirst" + timeFirst, Toast.LENGTH_LONG).show();
        if (timeFirst == 0)
        {
            mTimeLeftInMillis = START_TIME_IN_MILLIS;
            int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
            int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

            String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

            mTextViewCountDown.setText(timeLeftFormatted);
            timeFirst = 1;
        }
        else if (timeFirst ==1)
        {
            int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
            int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

            String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

            mTextViewCountDown.setText(timeLeftFormatted);
        }}
    private void updateButtons() {
        if (mTimerRunning) {
            mButtonReset.setVisibility(View.INVISIBLE);
            mButtonStartPause.setText("Pause");
        } else {
            mButtonStartPause.setText("Start");

            if (mTimeLeftInMillis < 1000) {
                mButtonStartPause.setVisibility(View.INVISIBLE);
            } else {
                mButtonStartPause.setVisibility(View.VISIBLE);
            }

            if (mTimeLeftInMillis < START_TIME_IN_MILLIS) {
                mButtonReset.setVisibility(View.VISIBLE);
            } else {
                mButtonReset.setVisibility(View.INVISIBLE);
            }
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putLong("millisLeft", mTimeLeftInMillis);
        editor.putBoolean("timerRunning", mTimerRunning);
        editor.putLong("endTime", mEndTime);

        editor.apply();

        if (mCountDownTimer != null) {
            mCountDownTimer.cancel();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);

        mTimeLeftInMillis = prefs.getLong("millisLeft", START_TIME_IN_MILLIS);
        mTimerRunning = prefs.getBoolean("timerRunning", false);

        updateCountDownText();
        updateButtons();

        if (mTimerRunning) {
            mEndTime = prefs.getLong("endTime", 0);
            mTimeLeftInMillis = mEndTime - System.currentTimeMillis();

            if (mTimeLeftInMillis < 0) {
                mTimeLeftInMillis = 0;
                mTimerRunning = false;
                updateCountDownText();
                updateButtons();
            } else {
                startTimer();
            }
        }}


    /*private void notification(){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel =
                    new NotificationChannel("n", "n", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);

            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "n")
                    .setContentText("Bailey Works")
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .setAutoCancel(true)
                    .setContentText("Water Level Low!");

            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
            managerCompat.notify(999, builder.build());
            Log.i("bro", "Notification()");
            Toast.makeText(EggCookDisplay.this, "Notification()", Toast.LENGTH_LONG).show();


        }}*/






    private void getdata() {

        // calling add value event listener method
        // for getting the values from database.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // this method is call to get the realtime
                // updates in the data.
                // this method is called when the data is
                // changed in our Firebase console.
                // below line is for getting the data from
                // snapshot of our database.

                Float value = snapshot.getValue(Float.class);

                // after getting the value we are setting
                // our value to our text view in below line.
                retrieveTV.setText(String.valueOf(value));
                Log.i("bro", String.valueOf(value));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // calling on cancelled method when we receive
                // any error or we are not able to get the data.
                //Toast.makeText(MainActivity.this, "Fail to get data.", Toast.LENGTH_SHORT).show();
            }
        });



        /*TextView textView2 = (TextView) findViewById(R.id.Timedisp);
        TextView textView1 = (TextView) findViewById(R.id.Tempdisp);

       Intent example = getIntent();
       String thick = example.getStringExtra("message");
       String done = example.getStringExtra("message2");
       String temp = example.getStringExtra("message3");
       String time = example.getStringExtra("message4");

        textView2.setText("" + thick );
        textView1.setText("" + done );*/

        //ArrayList<String> list = new ArrayList<>();
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_item)
    }

    public boolean isConnectedTo(String ssid, Context context) {
        boolean retVal = false;


        WifiManager wifi = (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifi.getConnectionInfo();
        String hello = wifiInfo.getSSID();

        if (wifiInfo != null) {
            String currentConnectedSSID = wifiInfo.getSSID();
            currentConnectedSSID = currentConnectedSSID.replaceAll("\"", "");
            Log.i("yo", String.valueOf(currentConnectedSSID));
            Log.i("yo", String.valueOf(ssid));
            Log.i("yo", "shaboygie");


            if (currentConnectedSSID != null && ssid.equals(currentConnectedSSID)) {
                retVal = true;


            }
            else {
                Log.i("yo", "test");
            }

        }
        return retVal;

    }
}

package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class WifiCheck extends AppCompatActivity implements View.OnClickListener {
    //private Button checkCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_check);

        Button checkCon = findViewById(R.id.checkCon);
        checkCon.setOnClickListener(this);





        }



            @Override
            public void onClick(View v) {

                if (isConnectedTo("SousVide", WifiCheck.this)) {
                    Toast.makeText(WifiCheck.this, "Nice job! You're connected to SousVide.", Toast.LENGTH_LONG).show();

                    //Call into other class
                    openFoodChooser();
                } else {
                    Toast.makeText(WifiCheck.this, "You are not connected to the correct wifi, please try again.", Toast.LENGTH_LONG).show();
                }
            }






        public void openFoodChooser() {
        Intent intent = new Intent(this, FoodChooser.class);
        startActivity(intent);
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


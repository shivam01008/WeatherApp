package com.examole.weatherapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private TextView city,temperature,weatherCondition,humidity,maxTemperature,minTemperature,pressure,wind;
    private ImageView imageview;
    private FloatingActionButton fab;

    LocationManager locationManager;
    LocationListener locationListener;
    Double lat,lon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city = findViewById(R.id.city);
        temperature = findViewById(R.id.textviewTemp);
        weatherCondition = findViewById(R.id.textviewWeather);
        humidity = findViewById(R.id.textHumidity);
        maxTemperature = findViewById(R.id.textMaxTemp);
        minTemperature = findViewById(R.id.textMixTemp);
        pressure = findViewById(R.id.pressure);
        wind = findViewById(R.id.wind);
        imageview = findViewById(R.id.imageView);
        fab= findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(@NonNull Location location) {
                lat = location.getAltitude();
                lon = location.getLongitude();

            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            @Override
            public void onProviderEnabled(@NonNull String provider) {

            }

            @Override
            public void onProviderDisabled(@NonNull String provider) {

            }
        };
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)
        != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION,1});


        }
        else
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,500,50,LocationListener);

        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode==1&& permissions.length>0&& ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATIO)==
 ==Package.PERMISSION_GRANTED)
 {  locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,500,50,LocationListener);
 }
    }
    public  void getWeatherData(double lat, double Ion)
     { 
     }




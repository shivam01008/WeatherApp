package com.examole.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WeatherActivity extends AppCompatActivity {

    private TextView cityWeather,temperatureWeather,viewWeather,humidityWeather,maxTemperatureWeather,minTemperatureWeather,pressureWeather,windWeather;
    private ImageView imageviewWeather;
    private Button search;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        cityWeather = findViewById(R.id.cityWeather);
        temperatureWeather = findViewById(R.id.viewTempWeather);
        viewWeather = findViewById(R.id.viewWeather);
        humidityWeather = findViewById(R.id.textHumidityWeather);
        maxTemperatureWeather = findViewById(R.id.textMaxTempWeather);
        minTemperatureWeather = findViewById(R.id.textMixTempWeather);
        pressureWeather = findViewById(R.id.pressureWeather);
        windWeather = findViewById(R.id.windWeather);
        imageviewWeather = findViewById(R.id.imageViewWeather);
        search = findViewById(R.id.search);
        editText = findViewById(R.id.editText);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
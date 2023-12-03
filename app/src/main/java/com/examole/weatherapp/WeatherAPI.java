package com.examole.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {
    @GET("weather?appid=a5a8ad20c240eb1b44bece6515cfe9af&units=metric")
    Call<OpenWeatherMap>getWeatherWithLocation(@Query("lat")double late,@Query("lon")double lon);

    @GET("weather?appid=a5a8ad20c240eb1b44bece6515cfe9af&units=metric")
    Call<OpenWeatherMap>getWeatherWithLocation(@Query("q")String name);
}

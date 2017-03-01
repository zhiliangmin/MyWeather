package com.example.zhiliangmin.myweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhiliangmin on 2017/2/27.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

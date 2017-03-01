package com.example.zhiliangmin.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhiliangmin on 2017/2/27.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;

    }
}

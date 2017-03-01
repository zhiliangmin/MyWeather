package com.example.zhiliangmin.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhiliangmin on 2017/2/27.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;


    }

}

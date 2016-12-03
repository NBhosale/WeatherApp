package com.example.rajat.weatherapp.Common;
import android.icu.text.StringPrepParseException;
import android.support.annotation.NonNull;

import android.icu.text.DateFormat;


import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by Rajat on 2016-12-01.
 */

public class Common {
    public static String API_KEY = "11c5daed16308e090a6a7ffa589f1dac";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%sAPPID=%s&units=metric", lat,lng,API_KEY));
    return null;}


    public static String unixTimeStampToDateTime(double unixTimeStamp){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:MM");
        Date date= new Date();

        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png", icon);
    }

    public static String getDateNow(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}

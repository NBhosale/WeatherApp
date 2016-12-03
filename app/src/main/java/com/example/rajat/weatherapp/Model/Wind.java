package com.example.rajat.weatherapp.Model;

/**
 * Created by Rajat on 2016-12-01.
 */

public class Wind {

    private double speed;
    private double deg;

    public Wind(double speed, double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

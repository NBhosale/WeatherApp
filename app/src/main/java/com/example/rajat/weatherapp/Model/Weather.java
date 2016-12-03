package com.example.rajat.weatherapp.Model;

/**
 * Created by Rajat on 2016-12-01.
 */

public class Weather {
    private int id;
    private String menu;
    private String description;
    private String icon;



    public Weather(int id, String menu, String description, String icon) {
        this.id = id;
        this.menu = menu;
        this.description = description;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

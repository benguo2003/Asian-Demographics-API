package com.example.university.entity;

import java.io.Serializable;

public class Neighborhood implements Serializable {

    private final static long serialVersionUID = 1234567L;
    private final String name;
    private final double longitude;
    private final double latitude;
    private final double asian_percent;
    private final int cityID;
    private final int population;
    private final int id;

    public Neighborhood(String name, double longitude, double latitude,
                        double asian_percent, int cityID, int population, int id){
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.asian_percent = asian_percent;
        this.cityID = cityID;
        this.population = population;
        this.id = id;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getLongitude() { return longitude; }
    public double getLatitude() { return latitude; }
    public double getAsian_percent() { return asian_percent; }
    public int getPopulation() { return population; }
    public int getCityID() { return cityID; }
}

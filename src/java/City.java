package com.example.university.entity;

import java.io.Serializable;

public class City implements Serializable {

    private final static long serialVersionUID = 1234567L;
    private final String name;
    private final double asian_percent;
    private final int stateID;
    private final double longitude;
    private final double latitude;
    private final int id;
    private final int population;

    public City(String name, double asian_percent, int stateID, double longitude,
                double latitude, int id, int population){
        this.name = name;
        this.asian_percent = asian_percent;
        this.stateID = stateID;
        this.longitude = longitude;
        this.latitude = latitude;
        this.id = id;
        this.population = population;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getLongitude() { return longitude; }
    public double getLatitude() { return latitude; }
    public double getAsian_percent() { return asian_percent; }
    public int getPopulation() { return population; }
    public int getStateID() { return stateID; }
}

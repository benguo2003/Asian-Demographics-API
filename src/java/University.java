package com.example.university.entity;

import java.io.Serializable;

public class University implements Serializable {

    private final static long serialVersionUID = 1234567L;
    private final String name;
    private final double longitude;
    private final double latitude;
    private final double asian_percent;
    private final int id;
    private final int student_population;

    public University(String name, double longitude, double latitude,
                      double asian_percent, int id, int student_population){
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.asian_percent = asian_percent;
        this.id = id;
        this.student_population = student_population;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getLongitude() { return longitude; }
    public double getLatitude() { return latitude; }
    public double getAsian_percent() { return asian_percent; }
    public int getStudent_population() { return student_population; }
}

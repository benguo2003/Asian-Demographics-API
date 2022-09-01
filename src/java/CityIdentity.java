package com.example.university.entity;

import java.io.Serializable;

public class CityIdentity implements Serializable {

    private final static long serialVersionUID = 1234567L;
    private final String name;
    private final int stateID;
    private final int id;

    public CityIdentity(String name, int stateID, int id){
        this.name = name;
        this.stateID = stateID;
        this.id = id;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getStateID() { return stateID; }
}

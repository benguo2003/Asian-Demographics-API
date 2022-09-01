package com.example.university.entity;

import java.io.Serializable;

public class UniversityIdentity implements Serializable {

    private final static long serialVersionUID = 1234567L;
    private final String name;
    private final int id;

    public UniversityIdentity(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}

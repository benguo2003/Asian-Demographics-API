package com.example.university.entity;

import java.io.Serializable;

public class State implements Serializable {

    private final static long serialVersionUID = 1234567L;
    private final long id;
    private final String name;

    public State(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() { return id; }
    public String getName() { return name; }
}

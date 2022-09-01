package com.example.university.configuration;
import com.example.university.entity.City;
import com.example.university.entity.CityIdentity;

import java.util.ArrayList;

public interface CityMapper {
    City getCityInfo(int id);
    ArrayList<CityIdentity> getCityIdentity();
}


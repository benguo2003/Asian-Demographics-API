package com.example.university.configuration;
import com.example.university.entity.Neighborhood;
import com.example.university.entity.NeighborhoodIdentity;

import java.util.ArrayList;

public interface NeighborhoodMapper {
    ArrayList<NeighborhoodIdentity> getNeighborhoodIdentity();
    Neighborhood getNeighborhoodInfo(int id);
}

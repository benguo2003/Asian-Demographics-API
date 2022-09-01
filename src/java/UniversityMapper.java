package com.example.university.configuration;
import com.example.university.entity.University;
import com.example.university.entity.UniversityIdentity;

import java.util.ArrayList;

public interface UniversityMapper {
    University getUniversityInfo(int id);
    ArrayList<UniversityIdentity> getUniversityIdentity();
}

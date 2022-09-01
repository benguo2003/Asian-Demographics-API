package com.example.university.controller;

import com.example.university.configuration.CityMapper;
import com.example.university.configuration.NeighborhoodMapper;
import com.example.university.configuration.StateMapper;
import com.example.university.entity.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private RedisTemplate redisTemplate;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/citiesID")
    public ArrayList<CityIdentity> getCityIdentity() {
        if(redisTemplate.opsForValue().get("cities") == null) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                CityMapper mapper = session.getMapper(CityMapper.class);
                ArrayList<CityIdentity> cityInfoList = mapper.getCityIdentity();
                redisTemplate.opsForValue().set("cities", cityInfoList);
                return cityInfoList;
            }
        }
        return (ArrayList<CityIdentity>) redisTemplate.opsForValue().get("cities");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/cityInfo/{id}")
    public City getCityInfo(@PathVariable int id) {
        if(redisTemplate.opsForValue().get("cityInfo" + id) == null) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                CityMapper mapper = session.getMapper(CityMapper.class);
                City cityInfo = mapper.getCityInfo(id);
                redisTemplate.opsForValue().set("cityInfo" + id, cityInfo);
                return cityInfo;
            }
        }
        return (City) redisTemplate.opsForValue().get("cityInfo" + id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/states")
    public ArrayList<State> stateList() {
        if(redisTemplate.opsForValue().get("states") == null) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                StateMapper mapper = session.getMapper(StateMapper.class);
                ArrayList<State> stateList = mapper.getStates();
                redisTemplate.opsForValue().set("states", stateList);
                return stateList;
            }
        }
        return (ArrayList<State>) redisTemplate.opsForValue().get("states");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/neighborhoodsID")
    public ArrayList<NeighborhoodIdentity> getNeighborhoodIdentity() {
        if(redisTemplate.opsForValue().get("neighborhoods") == null) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                NeighborhoodMapper mapper = session.getMapper(NeighborhoodMapper.class);
                ArrayList<NeighborhoodIdentity> neighborhoodList = mapper.getNeighborhoodIdentity();
                redisTemplate.opsForValue().set("neighborhoods", neighborhoodList);
                return neighborhoodList;
            }
        }
        return (ArrayList<NeighborhoodIdentity>) redisTemplate.opsForValue().get("neighborhoods");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/neighborhoodInfo/{id}")
    public Neighborhood getNeighborhoodInfo(@PathVariable int id) {
        if(redisTemplate.opsForValue().get("neighborhoodInfo" + id) == null) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                NeighborhoodMapper mapper = session.getMapper(NeighborhoodMapper.class);
                Neighborhood neighborhoodInfo = mapper.getNeighborhoodInfo(id);
                redisTemplate.opsForValue().set("neighborhoodInfo" + id, neighborhoodInfo);
                return neighborhoodInfo;
            }
        }

        return (Neighborhood) redisTemplate.opsForValue().get("neighborhoodInfo" + id);
    }
}

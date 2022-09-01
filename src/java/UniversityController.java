package com.example.university.controller;

import com.example.university.configuration.UniversityMapper;
import com.example.university.entity.University;
import com.example.university.entity.UniversityIdentity;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UniversityController {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private RedisTemplate redisTemplate;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/universitiesID")
    public ArrayList<UniversityIdentity> getUniversityIdentity() {
        if(redisTemplate.opsForValue().get("universities") == null) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                UniversityMapper mapper = session.getMapper(UniversityMapper.class);
                ArrayList<UniversityIdentity> universityList = mapper.getUniversityIdentity();
                redisTemplate.opsForValue().set("universities", universityList);
                return universityList;
            }
        }
        return (ArrayList<UniversityIdentity>) redisTemplate.opsForValue().get("universities");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/universityInfo/{id}")
    public University getUniversityInfo(@PathVariable int id) {
        if(redisTemplate.opsForValue().get("universityInfo" + id) == null) {
            try (SqlSession session = sqlSessionFactory.openSession()) {
                UniversityMapper mapper = session.getMapper(UniversityMapper.class);
                University universityInfo = mapper.getUniversityInfo(id);
                redisTemplate.opsForValue().set("universityInfo" + id, universityInfo);
                return universityInfo;
            }
        }
        return (University) redisTemplate.opsForValue().get("universityInfo" + id);
    }
}

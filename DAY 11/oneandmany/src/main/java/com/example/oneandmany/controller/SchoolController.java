package com.example.oneandmany.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.oneandmany.model.School;
import com.example.oneandmany.model.SchoolStudent;
import com.example.oneandmany.service.SchoolService;
import java.util.*;
@RestController
public class SchoolController {
    @Autowired
    private SchoolService ser;

    @PostMapping("/post")
    public School post1(@RequestBody School school)
    {
        return ser.post1(school);
    }

    @PostMapping("/post2")
    public SchoolStudent post2(@RequestBody SchoolStudent schoolStudent)
    {
        return ser.post2(schoolStudent);
    }
    
    @GetMapping("/get")
    public java.util.List<SchoolStudent> get()
    {
        return ser.get();
    }

    @GetMapping("/get2")
    public java.util.List<School> get2()
    {
        return ser.get2();
    }

    @GetMapping("/getId/{id}")
    public School get2(@PathVariable int id)
    {
        return ser.get2(id);
    }
}

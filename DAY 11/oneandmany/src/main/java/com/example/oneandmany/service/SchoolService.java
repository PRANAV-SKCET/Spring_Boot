package com.example.oneandmany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneandmany.model.School;
import com.example.oneandmany.model.SchoolStudent;
import com.example.oneandmany.repository.SchoolRepo;
import com.example.oneandmany.repository.SchoolStudentRepo;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo rep;
    @Autowired
    private SchoolStudentRepo repo;

    public School post1(School school)
    {
        return rep.save(school);
    }

    public SchoolStudent post2(SchoolStudent school)
    {
        return repo.save(school);
    }

    public List<SchoolStudent>get()
    {
        return repo.findAll();
    }
    public List<School>get2()
    {
        return rep.findAll();
    }
    public School get2(int id)
    {
        return rep.findById(id).orElse(null);
    }
    
}

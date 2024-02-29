package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.springapp.model.Student;
import com.example.springapp.model.StudentInfo;
import com.example.springapp.repository.StudentInfoRepo;
import com.example.springapp.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo rep;
    @Autowired
    private StudentInfoRepo repo;

    public boolean post(Student student)
    {
        try
        {
            rep.save(student);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean postinfo(StudentInfo student)
    {
        try
        {
            repo.save(student);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Student> get()
    {
        return rep.findAll();
    }

    public List<StudentInfo> getinfo()
    {
        return repo.findAll();
    }
    
}

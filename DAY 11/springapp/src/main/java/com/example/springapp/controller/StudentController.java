package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Student;
import com.example.springapp.model.StudentInfo;
import com.example.springapp.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService ser;

    @PostMapping("/post")
    public Student post(@RequestBody Student student)
    {
        if(ser.post(student))
        {
            return student;
        }
        else
        {
            return null;
        }
    }

    @PostMapping("/postinfo")
    public StudentInfo post(@RequestBody StudentInfo student)
    {
        if(ser.postinfo(student))
        {
            return student;
        }
        else
        {
            return null;
        }
    }


    @GetMapping("/get")
    public List<Student> get()
    {
        return ser.get();
    }

    @GetMapping("/getinfo")
    public List<StudentInfo> getinfo()
    {
        return ser.getinfo();
    }
    
}

package com.example.oneandmany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oneandmany.model.SchoolStudent;

@Repository
public interface SchoolStudentRepo extends JpaRepository<SchoolStudent,Integer>{
    
}

package com.example.oneandmany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oneandmany.model.School;

@Repository
public interface SchoolRepo extends JpaRepository<School,Integer>{
    
}

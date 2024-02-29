package com.example.springapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    private int id;
    private String name;
    
    @JsonManagedReference
    @OneToOne(mappedBy="student",cascade = CascadeType.ALL)
    private StudentInfo studentInfo;
    
}

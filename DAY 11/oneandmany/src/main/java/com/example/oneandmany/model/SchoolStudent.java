package com.example.oneandmany.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class SchoolStudent {
    @Id
    private int id;
    private String name;

    @JsonBackReference
    @ManyToOne
    private School school;
    
}

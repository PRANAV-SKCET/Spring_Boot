package com.example.oneandmany.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class School {
    @Id
    private int id;
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<SchoolStudent> schoolStudent;
    
}

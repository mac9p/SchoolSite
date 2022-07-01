package com.github.mac9p.schoolsite.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;


    @OneToMany(mappedBy = "schoolClass")
    private List<Student> studentList = new ArrayList<>();

    @ManyToMany
    private List<Teacher> teacherList = new ArrayList<>();

}

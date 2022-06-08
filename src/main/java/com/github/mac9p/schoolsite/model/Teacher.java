package com.github.mac9p.schoolsite.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String firstName;
    @Email
    private String email;
    @NotBlank
    private String lastName;
    @ManyToMany(mappedBy = "school_class")
    private List<SchoolClass> classList;
}

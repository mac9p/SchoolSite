package com.github.mac9p.schoolsite.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email
    private String email;

    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private SchoolClass schoolClass;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Grade> gradeList = new ArrayList<>();

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Attention> attentions = new ArrayList<>();
}

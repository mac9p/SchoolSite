package com.github.mac9p.schoolsite.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
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
    @ManyToMany
    private List<SchoolClass> classList = new ArrayList<>();
    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Attention> attentions = new ArrayList<>();
}

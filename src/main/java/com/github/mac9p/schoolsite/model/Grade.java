package com.github.mac9p.schoolsite.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "school_subject_id")
    private SchoolSubject subject;
    private Integer grade;

    @CreationTimestamp
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private String studentCredentials = student.getFirstName() + " " + student.getLastName();

    private String schoolSubjectName = subject.getName();

    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private SchoolClass schoolClass;


}

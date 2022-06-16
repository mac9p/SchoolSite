package com.github.mac9p.schoolsite.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "grade")
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


    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private SchoolClass schoolClass;


}

package com.github.mac9p.schoolsite.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
public class Attention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDate date;

    @JoinColumn(name = "student_id")
    @ManyToOne
    private Student student;


    @JoinColumn(name = "teacher_id")
    @ManyToOne
    private Teacher teacher;

    @NotBlank
    private String description;
    @Min(-100)
    @Max(100)
    private Integer points;

}


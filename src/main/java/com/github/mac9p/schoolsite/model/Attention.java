package com.github.mac9p.schoolsite.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
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

    @Transient
    private String studentName;

    @JoinColumn(name = "teacher_id")
    @ManyToOne
    private Teacher teacher;

    @Transient
    private String teacherName;

    public String getStudentName(){
        return student.getFirstName()+" "+student.getLastName();
    }
    public String getTeacherName(){
        return teacher.getFirstName()+" "+teacher.getLastName();
    }

}


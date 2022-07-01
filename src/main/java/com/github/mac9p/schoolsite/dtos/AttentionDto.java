package com.github.mac9p.schoolsite.dtos;

import com.github.mac9p.schoolsite.model.Student;
import com.github.mac9p.schoolsite.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttentionDto {
    private Long id;
    private LocalDate date;
    private String studentName;
    private String teacherName;
    private String description;
    private Integer points;
}

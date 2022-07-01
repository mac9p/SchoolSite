package com.github.mac9p.schoolsite.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class GradeDto {
    private Long id;
    private Integer grade;
    private String studentCredentials;
    private LocalDate date;
    private String subjectName;

}

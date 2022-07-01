package com.github.mac9p.schoolsite.services;

import com.github.mac9p.schoolsite.converters.GradeToGradeDto;
import com.github.mac9p.schoolsite.dtos.GradeDto;
import com.github.mac9p.schoolsite.repositories.GradeRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;
    private final GradeToGradeDto gradeToGradeDto;

    public GradeService(GradeRepository gradeRepository, GradeToGradeDto gradeToGradeDto) {
        this.gradeRepository = gradeRepository;
        this.gradeToGradeDto = gradeToGradeDto;
    }

    public List<GradeDto> findAllByStudentId(@NotNull Long id){
        return gradeRepository.findAllByStudent_Id(id).stream().
                map(gradeToGradeDto::convert).collect(Collectors.toList());
    }

    public List<GradeDto> findAllByClassId(@NotNull Long id){
        return gradeRepository.findAllBySchoolClass_Id(id).stream().
                map(gradeToGradeDto::convert).collect(Collectors.toList());
    }

    public List<GradeDto> findAllGrades(){
        return gradeRepository.findAll().stream().
                map(gradeToGradeDto::convert).collect(Collectors.toList());
    }
}

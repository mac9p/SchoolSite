package com.github.mac9p.schoolsite.services;

import com.github.mac9p.schoolsite.model.Grade;
import com.github.mac9p.schoolsite.repositories.GradeRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;

    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public List<Grade> findAllByStudentId(@NotNull Long id){
        return gradeRepository.findAllByStudent_Id(id);
    }

    public List<Grade> findAllByClassId(@NotNull Long id){
        return gradeRepository.findAllBySchoolClass_Id(id);
    }

    public List<Grade> findAllGrades(){
        return gradeRepository.findAll();
    }
}

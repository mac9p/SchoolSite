package com.github.mac9p.schoolsite.controllers;

import com.github.mac9p.schoolsite.model.Grade;
import com.github.mac9p.schoolsite.services.GradeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/grades")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/all")
    private List<Grade> getAllGrades(){
        return gradeService.findAllGrades();
    }
    @GetMapping("/studentId")
    private List<Grade> getGradesByStudentId(@RequestParam Long id){
        return gradeService.findAllByStudentId(id);
    }
    @GetMapping("/classId")
    private List<Grade> getAllGradesByClassId(@RequestParam Long id){
        return gradeService.findAllByClassId(id);
    }



}

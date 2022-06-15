package com.github.mac9p.schoolsite.controllers;

import com.github.mac9p.schoolsite.model.SchoolSubject;
import com.github.mac9p.schoolsite.services.SchoolSubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/subjects")
public class SchoolSubjectController {
    private final SchoolSubjectService schoolSubjectService;

    public SchoolSubjectController(SchoolSubjectService schoolSubjectService) {
        this.schoolSubjectService = schoolSubjectService;
    }

    @GetMapping("all")
    public List<SchoolSubject> getAllSubjects(){
        return schoolSubjectService.getAllSchoolSubjects();
    }

    @GetMapping("/id")
    public SchoolSubject getSubjectById(@RequestParam Long id){
        return schoolSubjectService.getSchoolSubjectById(id);
    }
}

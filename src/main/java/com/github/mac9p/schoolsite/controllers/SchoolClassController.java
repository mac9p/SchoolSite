package com.github.mac9p.schoolsite.controllers;

import com.github.mac9p.schoolsite.model.SchoolClass;
import com.github.mac9p.schoolsite.services.SchoolClassService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classes")
@CrossOrigin("http://localhost:4200")
public class SchoolClassController {
    private final SchoolClassService schoolClassService;

    public SchoolClassController(SchoolClassService schoolClassService) {
        this.schoolClassService = schoolClassService;
    }

    @GetMapping("/all")
    private List<SchoolClass> getAllClasses(){
        return schoolClassService.getAllClasses();
    }
}

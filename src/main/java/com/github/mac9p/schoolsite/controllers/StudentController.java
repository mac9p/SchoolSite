package com.github.mac9p.schoolsite.controllers;

import com.github.mac9p.schoolsite.model.Student;
import com.github.mac9p.schoolsite.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/id")
    public Student getStudentById(@RequestParam Long id){
        return studentService.getStudentById(id);
    }
}

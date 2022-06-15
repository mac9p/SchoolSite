package com.github.mac9p.schoolsite.services;

import com.github.mac9p.schoolsite.model.Student;
import com.github.mac9p.schoolsite.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findStudentById(id);
    }
}

package com.github.mac9p.schoolsite.services;

import com.github.mac9p.schoolsite.model.SchoolSubject;
import com.github.mac9p.schoolsite.model.Student;
import com.github.mac9p.schoolsite.repositories.SchoolSubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolSubjectService {
    private final SchoolSubjectRepository schoolSubjectRepository;

    public SchoolSubjectService(SchoolSubjectRepository schoolSubjectRepository) {
        this.schoolSubjectRepository = schoolSubjectRepository;
    }

    public List<SchoolSubject> getAllSchoolSubjects(){
        return schoolSubjectRepository.findAll();
    }

    public SchoolSubject getSchoolSubjectById(Long id){
        return schoolSubjectRepository.findSchoolSubjectById(id);
    }

    public SchoolSubject findSchoolSubjectByName(String name){return schoolSubjectRepository.
            findSchoolSubjectByName(name);}
}

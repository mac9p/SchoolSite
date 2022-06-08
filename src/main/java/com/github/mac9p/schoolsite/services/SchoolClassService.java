package com.github.mac9p.schoolsite.services;

import com.github.mac9p.schoolsite.model.SchoolClass;
import com.github.mac9p.schoolsite.repositories.SchoolClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolClassService {
    private final SchoolClassRepository repository;

    public SchoolClassService(SchoolClassRepository repository) {
        this.repository = repository;
    }

    public List<SchoolClass> getAllClasses(){
        return repository.findAll();
    }
}

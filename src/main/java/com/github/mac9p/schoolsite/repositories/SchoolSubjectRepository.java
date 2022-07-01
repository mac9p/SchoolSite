package com.github.mac9p.schoolsite.repositories;

import com.github.mac9p.schoolsite.model.SchoolSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolSubjectRepository extends JpaRepository<SchoolSubject,Long> {
    public SchoolSubject findSchoolSubjectById(Long id);
    public SchoolSubject findSchoolSubjectByName(String name);
}

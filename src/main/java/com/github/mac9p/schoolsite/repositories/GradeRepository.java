package com.github.mac9p.schoolsite.repositories;

import com.github.mac9p.schoolsite.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade,Long> {
    public List<Grade> findAllBySchoolClass_Id(Long id);
    public List<Grade> findAllByStudent_Id(Long id);

}

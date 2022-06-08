package com.github.mac9p.schoolsite.repositories;

import com.github.mac9p.schoolsite.model.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClass,Long> {

}

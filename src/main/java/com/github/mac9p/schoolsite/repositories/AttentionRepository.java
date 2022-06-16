package com.github.mac9p.schoolsite.repositories;

import com.github.mac9p.schoolsite.model.Attention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttentionRepository extends JpaRepository<Attention,Long> {
}

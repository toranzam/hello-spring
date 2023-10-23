package com.artineer.hellospring.repository;

import com.artineer.hellospring.entity.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GradeRepository extends JpaRepository<GradeEntity, Long> {


}



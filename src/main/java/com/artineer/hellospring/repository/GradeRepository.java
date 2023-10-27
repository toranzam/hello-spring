package com.artineer.hellospring.repository;

import com.artineer.hellospring.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GradeRepository extends JpaRepository<Grade, Long> {


}



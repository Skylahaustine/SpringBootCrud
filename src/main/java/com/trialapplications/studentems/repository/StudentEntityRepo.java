package com.trialapplications.studentems.repository;

import com.trialapplications.studentems.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentEntityRepo extends JpaRepository<StudentEntity, Long> {
}

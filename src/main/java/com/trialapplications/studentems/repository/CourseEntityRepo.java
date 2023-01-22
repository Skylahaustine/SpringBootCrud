package com.trialapplications.studentems.repository;

import com.trialapplications.studentems.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEntityRepo extends JpaRepository<CourseEntity, Long> {
}

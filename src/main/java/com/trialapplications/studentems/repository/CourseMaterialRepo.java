package com.trialapplications.studentems.repository;

import com.trialapplications.studentems.entity.CourseMaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepo extends JpaRepository<CourseMaterialEntity, Long> {
}

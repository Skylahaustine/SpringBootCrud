package com.trialapplications.studentems.service;

import com.trialapplications.studentems.entity.CourseMaterialEntity;

import java.util.List;

public interface CourseMaterialService {
    public List<CourseMaterialEntity> getCourseMaterial();

    public CourseMaterialEntity createCourseMaterial(CourseMaterialEntity course);
}

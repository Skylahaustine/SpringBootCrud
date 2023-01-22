package com.trialapplications.studentems.service;

import com.trialapplications.studentems.entity.CourseMaterialEntity;
import com.trialapplications.studentems.repository.CourseMaterialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseMaterialImp implements CourseMaterialService{
    private final CourseMaterialRepo coursematerialRepo;

    @Autowired
    public CourseMaterialImp(CourseMaterialRepo coursematerialRepo) {
        this.coursematerialRepo = coursematerialRepo;
    }

    @Override
    public List<CourseMaterialEntity> getCourseMaterial() {
        return coursematerialRepo.findAll();
    }

    @Override
    public CourseMaterialEntity createCourseMaterial(CourseMaterialEntity course) {
        return coursematerialRepo.save(course);
    }
}

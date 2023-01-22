package com.trialapplications.studentems.service;

import com.trialapplications.studentems.entity.CourseEntity;
import com.trialapplications.studentems.repository.CourseEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    private final CourseEntityRepo courseRepo;

    @Autowired
    public CourseServiceImpl(CourseEntityRepo courseRepo) {
        this.courseRepo = courseRepo;
    }


    @Override
    public List<CourseEntity> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public CourseEntity createCourse(CourseEntity course) {

        return  courseRepo.save(course);
    }


}

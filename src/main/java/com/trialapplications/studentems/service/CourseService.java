package com.trialapplications.studentems.service;

import com.trialapplications.studentems.entity.CourseEntity;

import java.util.List;

public interface CourseService {
    public List<CourseEntity> getAllCourses();



   public CourseEntity createCourse(CourseEntity course);
}

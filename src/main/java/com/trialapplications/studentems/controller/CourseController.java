package com.trialapplications.studentems.controller;

import com.trialapplications.studentems.entity.CourseEntity;
import com.trialapplications.studentems.service.CourseService;
import com.trialapplications.studentems.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
    private final CourseServiceImpl courseService;

    @Autowired
    public CourseController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }


    @GetMapping("/courses")
    public ResponseEntity<List<CourseEntity>> getAllCourses(){
        return new ResponseEntity<List<CourseEntity>>(courseService.getAllCourses(), HttpStatus.OK);
    }
    @PostMapping("/courses")
    public ResponseEntity<CourseEntity> createCourse(@RequestBody CourseEntity course)
    {
        return  new ResponseEntity<CourseEntity>(courseService.createCourse(course), HttpStatus.CREATED);


    }}


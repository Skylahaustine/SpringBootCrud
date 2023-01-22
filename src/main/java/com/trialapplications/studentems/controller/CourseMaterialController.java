package com.trialapplications.studentems.controller;

import com.trialapplications.studentems.entity.CourseEntity;
import com.trialapplications.studentems.entity.CourseMaterialEntity;
import com.trialapplications.studentems.service.CourseMaterialImp;
import com.trialapplications.studentems.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CourseMaterialController {
    private final CourseMaterialImp coursematerial;

    @Autowired
    public CourseMaterialController(CourseMaterialImp coursematerial) {
        this.coursematerial = coursematerial;
    }


    @GetMapping("/coursematerial")
    public ResponseEntity<List<CourseMaterialEntity>> getCourseMaterial(){
        return new ResponseEntity<List<CourseMaterialEntity>>(coursematerial.getCourseMaterial(), HttpStatus.OK);
    }
    @PostMapping("/coursematerial")
    public ResponseEntity<CourseMaterialEntity> createCourseMaterial(@RequestBody CourseMaterialEntity course)
    {
        return  new ResponseEntity<CourseMaterialEntity>(coursematerial.createCourseMaterial(course), HttpStatus.CREATED);

    }
}

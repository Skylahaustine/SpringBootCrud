package com.trialapplications.studentems.controller;

import com.trialapplications.studentems.entity.StudentEntity;
import com.trialapplications.studentems.service.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private final StudentImpl studentService;

    @Autowired
    public StudentController(StudentImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentEntity>> getStudents(){
        return new ResponseEntity<List<StudentEntity>>(studentService.getStudent(), HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity student){
        System.out.println(student);
        return new ResponseEntity<StudentEntity>(studentService.saveStudent(student),HttpStatus.CREATED);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentEntity> getStudent(@PathVariable Long id){
        return new ResponseEntity<StudentEntity>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity student, @PathVariable Long id){
        return new ResponseEntity<StudentEntity>(studentService.updateStudent(id, student),HttpStatus.OK);
    }
}

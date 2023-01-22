package com.trialapplications.studentems.service;

import com.trialapplications.studentems.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    public List<StudentEntity> getStudent();

    public StudentEntity saveStudent(StudentEntity student);

    public StudentEntity getStudentById(Long id);

    public StudentEntity updateStudent(Long id, StudentEntity student);
}

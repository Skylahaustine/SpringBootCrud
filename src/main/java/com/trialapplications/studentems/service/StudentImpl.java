package com.trialapplications.studentems.service;

import com.trialapplications.studentems.entity.StudentEntity;
import com.trialapplications.studentems.repository.StudentEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService{
    private final StudentEntityRepo studentRepo;

    @Autowired
    public StudentImpl(StudentEntityRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<StudentEntity> getStudent() {
        //Pageable pages = PageRequest.of().getContent();
        System.out.println("Getting students");
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepo.save(student);
    }

    @Override
    public StudentEntity getStudentById(Long id) {
        Optional<StudentEntity> student = studentRepo.findById(id);

        if(student.isPresent()){
            return student.get();
        }
        throw new RuntimeException("Student not found");

    }

    @Override
    public StudentEntity updateStudent(Long id, StudentEntity student) {
        Optional<StudentEntity> s = studentRepo.findById(id);

        if(s.isPresent()){
            StudentEntity studentDetails = s.get();
            studentDetails.setFirstName(student.getFirstName());
            studentDetails.setSecondName(student.getSecondName());
            studentDetails.setEmailId(student.getEmailId());
//            studentDetails.setCourse(student.getCourse());
            return studentRepo.save(studentDetails);
        }else {
            return null;
        }
    }
}

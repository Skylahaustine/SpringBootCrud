package com.trialapplications.studentems.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "student")
public class StudentEntity {
    @Id
    @SequenceGenerator(name= "student_sequence", sequenceName= "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private long id;
    private String firstName;
    private String secondName;

    private String emailId;
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "student")
    private List<CourseEntity> course;
}

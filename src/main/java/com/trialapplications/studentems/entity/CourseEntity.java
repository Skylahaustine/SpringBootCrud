package com.trialapplications.studentems.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "course")
public class CourseEntity {
    @Id
    @SequenceGenerator(name= "course_sequence", sequenceName= "course_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
    private long id;
    private String courseName;
    @ManyToOne
    @JoinColumn(name = " student_id"  ,foreignKey = @ForeignKey(name = "FK_student_id"))

    private StudentEntity student;

    @OneToOne (mappedBy = "course")
    private CourseMaterialEntity courseMaterial;


}

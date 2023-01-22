package com.trialapplications.studentems.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

@Table(name = "course_material")
public class CourseMaterialEntity {
    @Id
    @SequenceGenerator(name= "course_material_sequence", sequenceName= "course_material_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_material_sequence")
    private long id;
    private String materialName;
    private int materialPages;
    @OneToOne
    @JoinColumn(name = "course_id")
    private CourseEntity course;

}

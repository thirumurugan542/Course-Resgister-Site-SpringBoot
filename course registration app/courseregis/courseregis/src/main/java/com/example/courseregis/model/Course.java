package com.example.courseregis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private  String courseId;
    private  String courseName;
    private int duration;
    private String trainer;


   /* public Course() {
    }*/
}

package com.example.courseregis.service;

import com.example.courseregis.Repository.CourseRegisRepo;
import com.example.courseregis.Repository.CourseRepo;
import com.example.courseregis.model.Course;
import com.example.courseregis.model.CourseRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class courseService {
    @Autowired
    CourseRepo courserepo;

    @Autowired
    CourseRegisRepo courseRegistry;

    public List<Course> getallcourse() {
       return courserepo.findAll();
    }

    public List<CourseRegistry> enrolledstd() {
        return courseRegistry.findAll();
    }


    public void registerstd(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry1=new CourseRegistry(name,courseName,emailId);
        courseRegistry.save(courseRegistry1);
    }
}

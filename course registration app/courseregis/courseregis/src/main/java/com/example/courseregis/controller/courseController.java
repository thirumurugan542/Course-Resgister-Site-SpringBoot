package com.example.courseregis.controller;

import com.example.courseregis.model.Course;
import com.example.courseregis.model.CourseRegistry;
import com.example.courseregis.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class courseController {
    @Autowired
    courseService courseservice;

    @GetMapping("course")
    public List<Course>getallcourse(){
       return courseservice.getallcourse();

    }
    @GetMapping("course/enrolled")
    public List<CourseRegistry>enrolledstd(){
        return courseservice.enrolledstd();
    }

    @PostMapping("course/register")
    public String registerstd(@RequestParam("name")String name,
                              @RequestParam("courseName")String courseName,
                              @RequestParam("emailId")String emailId){
        courseservice.registerstd(name,emailId,courseName);
        return "Congratulations "+name+" you have successfully registered for "+courseName +" course";

    }
}

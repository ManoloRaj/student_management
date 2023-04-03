package com.student_management.backend_project.controller;

import com.student_management.backend_project.model.Course;
import com.student_management.backend_project.service.CourseService;
import com.student_management.backend_project.service.CourseServiceImpl;
import com.student_management.backend_project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;


    @GetMapping("/getListCourse")
    public Iterable<Course> getListCourse(){
        return courseService.getAllCourse();
    }

    @GetMapping("/test")
    public String test(){
        return "Hello tout le monde";
    }
}

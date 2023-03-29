package com.student_management.backend_project.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.student_management.backend_project.model.Student;
import com.student_management.backend_project.service.StudentService;
import com.student_management.backend_project.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getListStudent")
    public Iterable<Student> getAllUser(){
        return studentService.getAllUser();
    }


}

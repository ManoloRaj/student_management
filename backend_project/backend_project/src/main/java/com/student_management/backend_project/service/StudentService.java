package com.student_management.backend_project.service;

import com.student_management.backend_project.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {
    public Student saveStudent(Student student);
    public Iterable<Student> getAllUser();
}

package com.student_management.backend_project.service;

import com.student_management.backend_project.model.Student;
import com.student_management.backend_project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Iterable<Student> getAllUser(){
        return studentRepository.getAllUser();
    }

}

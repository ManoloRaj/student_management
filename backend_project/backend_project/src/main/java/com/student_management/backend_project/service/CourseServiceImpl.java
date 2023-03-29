package com.student_management.backend_project.service;

import com.student_management.backend_project.model.Course;
import com.student_management.backend_project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course saveCourse() {
        return null;
    }

    @Override
    public Iterable<Course> getAllCourse() {
        Iterable <Course> listCourse = courseRepository.getAllCourse();
        if(listCourse == null){
            listCourse = null;
        }
        return listCourse;
    }
}

package com.student_management.backend_project.service;

import com.student_management.backend_project.model.Course;

public interface CourseService {

    public Course saveCourse();
    public Iterable<Course> getAllCourse();
}

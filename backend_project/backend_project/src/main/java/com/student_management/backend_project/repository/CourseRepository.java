package com.student_management.backend_project.repository;

import com.student_management.backend_project.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query(value = "select * from course", nativeQuery = true)
    public Iterable <Course> getAllCourse();
}

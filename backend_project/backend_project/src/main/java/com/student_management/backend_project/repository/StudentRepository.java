package com.student_management.backend_project.repository;

import com.student_management.backend_project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer > {

    @Query(value = "select * from student", nativeQuery = true)
    public Iterable<Student> getAllUser();
}

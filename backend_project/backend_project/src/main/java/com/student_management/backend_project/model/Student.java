package com.student_management.backend_project.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_student;
    private String student_name;
    private String student_adress;

    @ManyToMany(mappedBy="student", fetch = FetchType.EAGER)
    private Collection<Course> course = new ArrayList<>();

    public Student() {
    }

    public Student(Long id_student, String student_name, String student_adress, Collection<Course> course) {
        this.id_student = id_student;
        this.student_name = student_name;
        this.student_adress = student_adress;
        this.course = course;
    }

    public Long getId_student() {
        return id_student;
    }

    public void setId_student(Long id_student) {
        this.id_student = id_student;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_adress() {
        return student_adress;
    }

    public void setStudent_adress(String student_adress) {
        this.student_adress = student_adress;
    }

    public Collection<Course> getCourse() {
        return course;
    }

    public void setCourse(Collection<Course> course) {
        this.course = course;
    }
}

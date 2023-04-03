package com.student_management.backend_project.model;



import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_course;

    private String course_name;

    private String color_code;
    @OneToOne
    @JoinColumn(name = "id_room")
    private Room room;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> student = new ArrayList<>();


    public Course() {
    }

    public Course(Long id_course, String course_name, Room room, Collection<Student> student) {
        this.id_course = id_course;
        this.course_name = course_name;
        this.room = room;
        this.student = student;
    }

    public Long getId_course() {
        return id_course;
    }

    public void setId_course(Long id_course) {
        this.id_course = id_course;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getColor_code() {
        return color_code;
    }

    public void setColor_code(String color_code) {
        this.color_code = color_code;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Collection<Student> getStudent() {
        return student;
    }

    public void setStudent(Collection<Student> student) {
        this.student = student;
    }
}

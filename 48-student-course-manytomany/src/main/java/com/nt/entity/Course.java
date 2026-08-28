package com.nt.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="COURSE_INFO")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String courseName;

    private Integer duration;

    @ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
    private Set<Student> students=new HashSet<>();

    public Course() {}

    public Course(String courseName,Integer duration) {
        this.courseName=courseName;
        this.duration=duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration=duration;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students=students;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", courseName=" + courseName + ", duration=" + duration + "]";
    }

}
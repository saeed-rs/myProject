package com.saeed.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COURSES")
public class Course implements Serializable {

    private int id;
    private String courseName;
    private String teacherName;
    private String classTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "COURSE-NAME")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Column(name = "TEACHER-NAME")
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Column(name = "CLASS-TIME")
    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public Course() {
    }

    public Course(String courseName, String teacherName, String classTime) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.classTime = classTime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classTime='" + classTime + '\'' +
                '}';
    }
}

package com.saeed.model;

import com.saeed.dto.CourseInfoDto;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class AddedCourses {

    /*@Id
    private long id;

    @Column
    @ElementCollection(targetClass = Integer.class)
    private Set<CourseInfoDto> addedCourses = new HashSet<>();

    public Set<CourseInfoDto> getAddedCourses() {
        return addedCourses;
    }

    public void setAddedCourses(Set<CourseInfoDto> addedCourses) {
        this.addedCourses = addedCourses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AddedCourses(long id, Set<CourseInfoDto> addedCourses) {
        this.id = id;
        this.addedCourses = addedCourses;
    }*/


    @Id
    private int id;

    @Column(name = "`COURSENAME`")
    private String courseName;

    @Column(name = "`TEACHERNAME`")
    private String teacherName;

    @Column(name = "`CLASSTIME`")
    private String classTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public AddedCourses() {
    }

    public AddedCourses(int id, String courseName, String teacherName, String classTime) {
        this.id = id;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.classTime = classTime;
    }

    @Override
    public String toString() {
        return "AddedCourses{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classTime='" + classTime + '\'' +
                '}';
    }
}

package com.saeed.dto;

import java.util.Objects;

public class CourseInfoDto {

    private long id;
    private String courseName;
    private String courseTecacherName;
    private String courseTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTecacherName() {
        return courseTecacherName;
    }

    public void setCourseTecacherName(String courseTecacherName) {
        this.courseTecacherName = courseTecacherName;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public CourseInfoDto() {
    }

    public CourseInfoDto(long id, String courseName, String courseTecacherName, String courseTime) {
        this.id = id;
        this.courseName = courseName;
        this.courseTecacherName = courseTecacherName;
        this.courseTime = courseTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseInfoDto that = (CourseInfoDto) o;
        return id == that.id &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(courseTecacherName, that.courseTecacherName) &&
                Objects.equals(courseTime, that.courseTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, courseTecacherName, courseTime);
    }
}

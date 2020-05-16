package com.saeed.dto.input;

import com.saeed.dto.CourseInfoDto;
import com.saeed.model.Course;

import java.util.List;
import java.util.Set;

public class InputAddCourseDto {

    Set<CourseInfoDto> lstCourse;

    public Set<CourseInfoDto> getLstCourse() {
        return lstCourse;
    }

    public void setLstCourse(Set<CourseInfoDto> lstCourse) {
        this.lstCourse = lstCourse;
    }
}

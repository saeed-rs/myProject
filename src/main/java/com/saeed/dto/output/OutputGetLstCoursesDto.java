package com.saeed.dto.output;

import com.saeed.dto.input.SimpleGenericDto;
import com.saeed.model.Course;

import java.util.List;
import java.util.Set;

public class OutputGetLstCoursesDto {

    private List<Course> lstCourses;

    public OutputGetLstCoursesDto() {
    }

    public List<Course> getLstCourses() {
        return lstCourses;
    }

    public void setLstCourses(List<Course> lstCourses) {
        this.lstCourses = lstCourses;
    }
}

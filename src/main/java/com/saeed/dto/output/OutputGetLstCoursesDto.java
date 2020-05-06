package com.saeed.dto.output;

import com.saeed.dto.input.SimpleGenericDto;

import java.util.Set;

public class OutputGetLstCoursesDto {

    private Set<SimpleGenericDto<Long, String, String>> lstCourses;

    public OutputGetLstCoursesDto() {
    }

    public Set<SimpleGenericDto<Long, String, String>> getLstCourses() {
        return lstCourses;
    }

    public void setLstCourses(Set<SimpleGenericDto<Long, String, String>> lstCourses) {
        this.lstCourses = lstCourses;
    }
}

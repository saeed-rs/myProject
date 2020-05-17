package com.saeed.dto.output;

import com.saeed.model.AddedCourses;

import java.util.List;

public class OutputGetLstAddedCourses {

    private List<com.saeed.model.AddedCourses> lstAddedCourses;

    public OutputGetLstAddedCourses() {
    }

    public OutputGetLstAddedCourses(List<AddedCourses> lstAddedCourses) {
        this.lstAddedCourses = lstAddedCourses;
    }

    public List<com.saeed.model.AddedCourses> getLstAddedCourses() {
        return lstAddedCourses;
    }

    public void setLstAddedCourses(List<com.saeed.model.AddedCourses> lstAddedCourses) {
        this.lstAddedCourses = lstAddedCourses;
    }
}

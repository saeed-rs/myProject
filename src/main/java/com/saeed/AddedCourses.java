package com.saeed;

import com.saeed.dto.input.InputGetLstAddedCourses;
import com.saeed.dto.output.OutputGetLstAddedCourses;
import com.saeed.service.IAddedCoursesService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class AddedCourses {

    @Autowired
    private IAddedCoursesService iAddedCoursesService;

    private long id;
    private String courseName;
    private String courseTecacherName;
    private String courseTime;

    private List<com.saeed.model.AddedCourses> lstAddedCourses;

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

    public List<com.saeed.model.AddedCourses> getLstAddedCourses() {
        return lstAddedCourses;
    }

    public void setLstAddedCourses(List<com.saeed.model.AddedCourses> lstAddedCourses) {
        this.lstAddedCourses = lstAddedCourses;
    }

    public AddedCourses() {
    }

    public AddedCourses(long id, String courseName, String courseTecacherName, String courseTime) {
        this.id = id;
        this.courseName = courseName;
        this.courseTecacherName = courseTecacherName;
        this.courseTime = courseTime;
    }

    public List<com.saeed.model.AddedCourses> loadLstAddedCourses(){
        InputGetLstAddedCourses inputGetLstAddedCourses = new InputGetLstAddedCourses();
        OutputGetLstAddedCourses outputGetLstAddedCourses = iAddedCoursesService.getLstAddedCourses(inputGetLstAddedCourses);
         lstAddedCourses = new ArrayList<>();
         lstAddedCourses.addAll(outputGetLstAddedCourses.getLstAddedCourses());
         return lstAddedCourses;
    }

    public void init() {
        this.loadLstAddedCourses();
    }
}

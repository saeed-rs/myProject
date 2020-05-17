package com.saeed;

import com.saeed.dao.DAO.LoadLstCourses;
import com.saeed.dto.CourseInfoDto;
import com.saeed.dto.input.InputAddCourseDto;
import com.saeed.dto.input.InputGetLstCoursesDto;
import com.saeed.dto.input.SimpleGenericDto;
import com.saeed.dto.output.OutputAddCourseDto;
import com.saeed.dto.output.OutputGetLstCoursesDto;
import com.saeed.model.Course;
import com.saeed.service.IAddCourseService;
import org.hibernate.annotations.LazyToOne;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

@Named
@ViewScoped
public class AddCourses implements Serializable {

    @Autowired
    private IAddCourseService iAddCourseService;

    private long id;
    private String courseName;
    private String courseTecacherName;
    private String courseTime;
    private Set<CourseInfoDto> courses = new HashSet<>();
    private List<Course> lstCourses;

    public Set<CourseInfoDto> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseInfoDto> courses) {
        this.courses = courses;
    }

    public List<Course> getLstCourses() {
        return lstCourses;
    }

    public void setLstCourses(List<Course> lstCourses) {
        this.lstCourses = lstCourses;
    }

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

    public void addCourse() {
        CourseInfoDto courseInfoDto = new CourseInfoDto();
        courseInfoDto.setId(getId());
        courseInfoDto.setCourseName(getCourseName());
        courseInfoDto.setCourseTecacherName(getCourseTecacherName());
        courseInfoDto.setCourseTime(getCourseTime());
        getCourses().add(courseInfoDto);
    }

    public List<Course> loadLstCourses() {
        InputGetLstCoursesDto inputGetLstCoursesDto = new InputGetLstCoursesDto();
        OutputGetLstCoursesDto outputGetLstCoursesDto = iAddCourseService.getLstCourses(inputGetLstCoursesDto);
        lstCourses = new ArrayList<>();
        lstCourses.addAll(outputGetLstCoursesDto.getLstCourses());
        return lstCourses;
    }

    public void init() {
        this.loadLstCourses();
    }

    public void save() {

        InputAddCourseDto inputAddCourseDto = new InputAddCourseDto();
        inputAddCourseDto.setLstCourse(courses);
        OutputAddCourseDto outputAddCourse = iAddCourseService.addCourse(inputAddCourseDto);

        clean();
    }

    public void clean() {
        setCourseName(" ");
        setCourseTecacherName(" ");
        setCourseTime(" ");
        setId(0);
        setLstCourses(new ArrayList<>());
        setCourses(new HashSet<>());
    }
}

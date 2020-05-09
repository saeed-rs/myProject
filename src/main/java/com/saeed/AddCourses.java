package com.saeed;

import com.saeed.dao.DAO.LoadLstCourses;
import com.saeed.dto.input.InputGetLstCoursesDto;
import com.saeed.dto.input.SimpleGenericDto;
import com.saeed.dto.output.OutputGetLstCoursesDto;
import com.saeed.model.Course;
import com.saeed.service.IAddCourseService;
import org.hibernate.annotations.LazyToOne;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Named
@ViewScoped
public class AddCourses implements Serializable {

    private List<Course> lstCourses;

    public List<Course> getLstCourses() {
        return lstCourses;
    }

    public void setLstCourses(List<Course> lstCourses) {
        this.lstCourses = lstCourses;
    }

    @Autowired
    private IAddCourseService iAddCourseService;

    public List<Course> loadLstCourses(){
        InputGetLstCoursesDto inputGetLstCoursesDto = new InputGetLstCoursesDto();
        OutputGetLstCoursesDto outputGetLstCoursesDto = iAddCourseService.getLstCourses(inputGetLstCoursesDto);
        lstCourses = new ArrayList<>();
        lstCourses.addAll(outputGetLstCoursesDto.getLstCourses());
        return lstCourses;
    }

    public void init(){
        this.loadLstCourses();
    }

}

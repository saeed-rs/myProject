package com.saeed.service;


import com.saeed.dto.input.InputAddCourseDto;
import com.saeed.dto.input.InputGetLstCoursesDto;
import com.saeed.dto.output.OutputAddCourseDto;
import com.saeed.dto.output.OutputGetLstCoursesDto;

import java.util.List;

public interface IAddCourseService {

    //public List<Course> createCourses();

    public OutputGetLstCoursesDto getLstCourses(InputGetLstCoursesDto inputGetLstCoursesDto);

    public OutputAddCourseDto addCourse(InputAddCourseDto inputAddCourseDto);
}

package com.saeed.service;

import com.saeed.dto.input.InputGetLstAddedCourses;
import com.saeed.dto.output.OutputGetLstAddedCourses;

public interface IAddedCoursesService {

    public OutputGetLstAddedCourses getLstAddedCourses(InputGetLstAddedCourses inputGetLstAddedCourses);

}

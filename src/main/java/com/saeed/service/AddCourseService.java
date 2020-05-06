package com.saeed.service;

import com.saeed.dto.input.InputGetLstCoursesDto;
import com.saeed.dto.input.SimpleGenericDto;
import com.saeed.dto.output.OutputGetLstCoursesDto;
import com.saeed.model.Courses;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AddCourseService implements IAddCourseService {

    @Override
    public OutputGetLstCoursesDto getLstCourses(InputGetLstCoursesDto inputGetLstCoursesDto) {
        OutputGetLstCoursesDto outputGetLstCoursesDto = new OutputGetLstCoursesDto();
        Set<SimpleGenericDto<Long, String, String>> lstCourses = new HashSet<>();
        for (Courses courses : Courses.values()){
            lstCourses.add(new SimpleGenericDto<Long, String, String>(courses.getKey(), courses.getTitle()));
        }

        outputGetLstCoursesDto.setLstCourses(lstCourses);
        return outputGetLstCoursesDto;
    }
}

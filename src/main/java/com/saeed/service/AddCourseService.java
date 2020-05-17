package com.saeed.service;

import com.saeed.dao.iDAO.IAddedCourseDao;
import com.saeed.dao.iDAO.ILoadLstCourses;
import com.saeed.dto.CourseInfoDto;
import com.saeed.dto.input.InputAddCourseDto;
import com.saeed.dto.input.InputGetLstCoursesDto;
import com.saeed.dto.output.OutputAddCourseDto;
import com.saeed.dto.output.OutputGetLstCoursesDto;
import com.saeed.model.AddedCourses;
import com.saeed.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AddCourseService implements IAddCourseService {

    @Autowired
    private ILoadLstCourses iLoadLstCourses;
    @Autowired
    private IAddedCourseDao iAddedCourseDao;

    @Override
    @Transactional
    public OutputGetLstCoursesDto getLstCourses(InputGetLstCoursesDto inputGetLstCoursesDto) {
        OutputGetLstCoursesDto outputGetLstCoursesDto = new OutputGetLstCoursesDto();
        List<Course> lstCourses = iLoadLstCourses.getLstCourses();
        /*Set<SimpleGenericDto<Long, String, String>> lstCourses = new HashSet<>();
        for (Courses courses : Courses.values()){
            lstCourses.add(new SimpleGenericDto<Long, String, String>(courses.getKey(), courses.getTitle()));
        }*/

        outputGetLstCoursesDto.setLstCourses(lstCourses);
        return outputGetLstCoursesDto;
    }

    @Transactional
    @Override
    public OutputAddCourseDto addCourse(InputAddCourseDto inputAddCourseDto) {

        /*Set<CourseInfoDto> courseInfoDtos = inputAddCourseDto.getLstCourse().stream()
                .map(x -> new CourseInfoDto(x.getId(), x.getCourseName(), x.getCourseTecacherName(), x.getCourseTime()))
                .collect(Collectors.toSet());*/
        OutputAddCourseDto outputAddCourseDto = new OutputAddCourseDto();

        //AddedCourses addedCourses = new AddedCourses();
        //addedCourses.setAddedCourses(courseInfoDtos);

        for (CourseInfoDto courseInfoDto : inputAddCourseDto.getLstCourse()){
            AddedCourses addedCourses = new AddedCourses();
            addedCourses.setId((int) courseInfoDto.getId());
            addedCourses.setCourseName(courseInfoDto.getCourseName());
            addedCourses.setTeacherName(courseInfoDto.getCourseTecacherName());
            addedCourses.setClassTime(courseInfoDto.getCourseTime());

            iAddedCourseDao.addCourse(addedCourses);
        }



        return outputAddCourseDto;
    }
}

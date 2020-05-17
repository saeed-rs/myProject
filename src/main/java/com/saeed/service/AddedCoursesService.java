package com.saeed.service;

import com.saeed.dao.iDAO.IAddedCoursesDao;
import com.saeed.dto.input.InputGetLstAddedCourses;
import com.saeed.dto.output.OutputGetLstAddedCourses;
import com.saeed.model.AddedCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddedCoursesService implements IAddedCoursesService {

    @Autowired
    private IAddedCoursesDao iAddedCoursesDao;


    @Override
    @Transactional
    public OutputGetLstAddedCourses getLstAddedCourses(InputGetLstAddedCourses inputGetLstAddedCourses) {

        OutputGetLstAddedCourses outputGetLstAddedCourses = new OutputGetLstAddedCourses();
        List<AddedCourses> lstAddedCOurse = iAddedCoursesDao.getLstAddedCourses();
        outputGetLstAddedCourses.setLstAddedCourses(lstAddedCOurse);

        return outputGetLstAddedCourses;
    }
}

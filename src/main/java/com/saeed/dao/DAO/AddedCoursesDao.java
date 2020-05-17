package com.saeed.dao.DAO;


import com.saeed.dao.iDAO.IAddedCoursesDao;
import com.saeed.model.AddedCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddedCoursesDao implements IAddedCoursesDao {

    @Autowired
    private BaseDao baseDao;

    @Override
    public List<com.saeed.model.AddedCourses> getLstAddedCourses() {

        List<AddedCourses> lstAddedCourses = baseDao.getSession()
                .createQuery("from AddedCourses")
                .list();

        return lstAddedCourses;
    }
}

package com.saeed.dao.DAO;

import com.saeed.dao.iDAO.ILoadLstCourses;
import com.saeed.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoadLstCourses implements ILoadLstCourses {

    @Autowired
    private BaseDao baseDao;

    @Override
    public List<Course> getLstCourses() {

        List<Course> lstCourses = baseDao.getSession().createQuery("from Course")
                .list();

        return lstCourses;
    }
}

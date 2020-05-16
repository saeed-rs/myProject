package com.saeed.dao.DAO;

import com.saeed.dao.iDAO.IAddedCourseDao;
import com.saeed.model.AddedCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddedCourseDao implements IAddedCourseDao {

    @Autowired
    private BaseDao baseDao;

    @Override
    public void addCourse(AddedCourses addedCourses) {
        baseDao.getSession().save(addedCourses);
    }
}

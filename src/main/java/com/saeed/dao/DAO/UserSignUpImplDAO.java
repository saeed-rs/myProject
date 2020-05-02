package com.saeed.dao.DAO;

import com.saeed.dao.iDAO.IUserSignUpDAO;
import com.saeed.model.SignUp;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserSignUpImplDAO implements IUserSignUpDAO {

    @Autowired
    private BaseDao baseDao;

    public void save(SignUp signUp) {
        baseDao.getSession().save(signUp);
    }

}

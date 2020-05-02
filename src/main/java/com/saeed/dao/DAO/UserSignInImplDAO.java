package com.saeed.dao.DAO;

import com.saeed.dao.iDAO.IUserSignInDAO;
import com.saeed.model.SignUp;
import com.saeed.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserSignInImplDAO implements IUserSignInDAO {

    @Autowired
    private BaseDao baseDao;

    SignUp signUp = null;

    @Override
    //@Transactional
    public boolean signIn(String userName, String password) {

        try {
            signUp = (SignUp) baseDao.getSession().createQuery("from SignUp U where U.userName = :userName")
                    .setParameter("userName", userName)
                    .uniqueResult();

            if (signUp != null && signUp.getPassword().equals(password)){
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}

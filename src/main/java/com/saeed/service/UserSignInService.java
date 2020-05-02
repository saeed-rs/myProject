package com.saeed.service;

import com.saeed.dao.DAO.UserSignInImplDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSignInService implements IUserSignInService {

    @Autowired
    private UserSignInImplDAO userSignInImplDAO;

    @Override
    @Transactional
    public boolean signIn(String userName, String password) {

        boolean exist = userSignInImplDAO.signIn(userName, password);
        if (exist == true){
            return true;
        }
        else
            return false;
    }
}

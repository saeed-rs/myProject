package com.saeed.service;

import com.saeed.dao.iDAO.IUserSignUpDAO;
import com.saeed.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSignUpService implements IUserSignUpService {

    @Autowired
    private IUserSignUpDAO iUserSignUpDAO;

    @Override
    @Transactional
    public void save(SignUp signUp) {
        iUserSignUpDAO.save(signUp);
    }
}

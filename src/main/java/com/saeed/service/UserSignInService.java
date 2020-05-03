package com.saeed.service;

import com.saeed.dao.DAO.UserSignInImplDAO;
import com.saeed.dto.input.InputSignInDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSignInService implements IUserSignInService {

    @Autowired
    private UserSignInImplDAO userSignInImplDAO;

    @Override
    @Transactional
    public boolean signIn(InputSignInDto inputSignInDto) {

        boolean exist = userSignInImplDAO.signIn(inputSignInDto.getUserName(), inputSignInDto.getPassword());
        if (exist == true) {
            return true;
        } else
            return false;
    }
}

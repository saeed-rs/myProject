package com.saeed;

import com.saeed.dao.DAO.UserSignUpImplDAO;
import com.saeed.dao.iDAO.IUserSignUpDAO;
import com.saeed.model.SignUp;
import com.saeed.service.IUserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
@Component("signUpBean")
@ManagedBean
//@ViewScoped
//@SessionScoped
//@Component("SignUpBean")
//@SessionScoped
//@ManagedBean
public class SignUpBean implements Serializable {

    @Autowired
    private IUserSignUpDAO userSignUpImplDAO;
    @Autowired
    private IUserSignUpService iUserSignUpService;

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String userName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void save(){

        SignUp signUp = new SignUp();
        signUp.setFirstName(getFirstName());
        signUp.setLastName(getLastName());
        signUp.setEmail(getEmail());
        signUp.setUserName(getUserName());
        signUp.setPassword(getPassword());

        iUserSignUpService.save(signUp);

    }

}

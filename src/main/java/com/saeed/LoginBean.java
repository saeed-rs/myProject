package com.saeed;

import com.saeed.dao.iDAO.IUserSignInDAO;
import com.saeed.model.User;
import com.saeed.service.IUserSignInService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.swing.*;
import java.io.IOException;

@Named
@ViewScoped
public class LoginBean {

    private String userName;
    private String password;

    @Autowired
    private IUserSignInDAO iUserSignInDAO;
    @Autowired
    private IUserSignInService iUserSignInService;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signIn() throws IOException {

        boolean exist = iUserSignInService.signIn(getUserName(), getPassword());
        if (exist == true){
            FacesContext.getCurrentInstance().getExternalContext().redirect("accountProfile.xhtml");
        } else {
            JOptionPane.showMessageDialog(null, "توجه: حساب کاربری یافت نشد");
        }



    }
}

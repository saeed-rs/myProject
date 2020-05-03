package com.saeed;

import com.saeed.dao.iDAO.IUserSignInDAO;
import com.saeed.dto.input.InputSignInDto;
import com.saeed.model.User;
import com.saeed.service.IUserSignInService;
import com.saeed.utility.PopMessage;
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
    @Autowired
    private PopMessage popMessage;

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

        InputSignInDto inputSignInDto = new InputSignInDto();
        inputSignInDto.setPassword(password);
        inputSignInDto.setUserName(userName);

        boolean exist = iUserSignInService.signIn(inputSignInDto);
        if (exist == true) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("accountProfile.xhtml");
        } else {
            //JOptionPane.showMessageDialog(null, "توجه: حساب کاربری یافت نشد");
            popMessage.failedMessage("حساب کاربری یافت نشد");
        }


    }
}

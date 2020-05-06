package com.saeed.utility;

import org.primefaces.PrimeFaces;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Component
public class PopMessage {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void failedMessage(String message){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"خطا", "توجه:" + message));
        //PrimeFaces.current().dialog().showMessageDynamic(facesContext);
    }
}

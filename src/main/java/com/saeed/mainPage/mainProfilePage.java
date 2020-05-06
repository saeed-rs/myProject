package com.saeed.mainPage;

import com.saeed.AddCourses;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class mainProfilePage {

    @Autowired
    private AddCourses addCourses;

    private String currentPage;

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public void formHandler(String pageName){

        switch (pageName){
            case "addCoursePage":{
                setCurrentPage("addCourses.xhtml");
                break;
            }
        }

    }
}

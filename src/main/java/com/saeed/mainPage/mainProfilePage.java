package com.saeed.mainPage;

import com.saeed.AddCourses;
import com.saeed.AddedCourses;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class mainProfilePage {

    @Autowired
    private AddCourses addCourses;
    @Autowired
    private AddedCourses addedCourses;

    private String currentPage;

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public void formHandler(String pageName) {

        switch (pageName) {
            case "addCoursePage": {
                setCurrentPage("addCourses.xhtml");
                addCourses.init();
                break;
            }

            case "addedCourses": {
                setCurrentPage("addedCourses.xhtml");
                addedCourses.init();
                break;
            }
        }

    }
}

package com.saeed.model;

public enum  Courses {

    PRG("برنامه نویسی", 1),
    HST("تاریخ", 2);

    private String title;
    private long key;

    Courses(String title, long key) {
        this.title = title;
        this.key = key;
    }

    Courses(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public static Courses find(long value){
        for (Courses courses : Courses.values()){
            if (courses.getKey() ==  value){
                return courses;
            }
        }
        return null;
    }
}

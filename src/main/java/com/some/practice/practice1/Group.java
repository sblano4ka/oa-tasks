package com.some.practice.practice1;

/**
 * Created by User on 11/2/2016.
 */
public class Group {
    private String course;
    private String faculty;

    public Group(String course, String faculty) {
        this.course = course;
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


}

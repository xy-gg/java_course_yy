package com.homework03.entity;

public class Course {
    private String cName;
    private String cNode;
    private boolean requiredCourse;

    public Course(String name, String node, boolean course) {
        this.cName = name;
        this.cNode = node;
        this.requiredCourse = course;
    }

    public void setName(String name) {
        this.cName = name;
    }

    public void setNode(String node) {
        this.cNode = node;
    }

    public void setCourse(boolean course) {
        this.requiredCourse = course;
    }

    public String getName() {
        return this.cName;
    }

    public String getNode() {
        return this.cNode;
    }

    public boolean getCourse() {
        return this.requiredCourse;
    }

}

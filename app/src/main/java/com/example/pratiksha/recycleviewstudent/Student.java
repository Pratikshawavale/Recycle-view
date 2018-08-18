package com.example.pratiksha.recycleviewstudent;

public class Student {

    private int imageId;
    private String name;
    private String collage;
    private String course;
    private String branch;
    private String address;

    public Student(int imageId, String name, String collage, String course, String branch, String address) {
        this.imageId = imageId;
        this.name = name;
        this.collage = collage;
        this.course = course;
        this.branch = branch;
        this.address = address;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


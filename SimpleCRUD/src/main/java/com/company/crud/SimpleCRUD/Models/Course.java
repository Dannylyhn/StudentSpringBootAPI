package com.company.crud.SimpleCRUD.Models;

public class Course {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Course(String name) {
        Name = name;
    }
}

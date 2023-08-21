package com.company.crud.SimpleCRUD.Models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int Id;
    private String Name;
    private ArrayList<Course> Courses;
    public Student(int id, String name, ArrayList<Course> courses) {
        Id = id;
        Name = name;
        Courses = courses;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Course> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        Courses = courses;
    }
}

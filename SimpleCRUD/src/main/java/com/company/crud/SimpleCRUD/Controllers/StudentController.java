package com.company.crud.SimpleCRUD.Controllers;

import com.company.crud.SimpleCRUD.Interfaces.IStudentService;
import com.company.crud.SimpleCRUD.Models.Course;
import com.company.crud.SimpleCRUD.Models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    ArrayList<Student> testingData = new ArrayList<>();
    ArrayList<Course> testingCourses = new ArrayList<Course>(){
        {
            add(new Course("VOP"));
            add(new Course("Project Management"));
            add(new Course("Database management"));
        }
    };

    private final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;

        testingData.add(new Student(1,"Danny", testingCourses));
        testingData.add(new Student(2,"Nata", testingCourses));
    }

    @GetMapping(value = "/")
    public ArrayList<Student> getAllPersons(){

        return testingData;
    }

    @GetMapping(value = "{id}")
    public Student getSpecificPerson(@PathVariable int id){
        for (var element: testingData) {
           if(element.getId() == id){
               return element;
           }
        }

        return null;
    }
}

package com.company.crud.SimpleCRUD.Services;

import com.company.crud.SimpleCRUD.Interfaces.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Override
    public String testing() {
        return "It works";
    }
}

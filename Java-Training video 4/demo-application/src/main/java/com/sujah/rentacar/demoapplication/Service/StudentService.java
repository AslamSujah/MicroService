package com.sujah.rentacar.demoapplication.Service;

import com.sujah.rentacar.demoapplication.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
}

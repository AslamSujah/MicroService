package com.sujah.rentacar.demoapplication.repository;

import com.sujah.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    //  Student save(Student student);      //We don't need to define methods in this interface when we extends JpaRepository.But if we use Repository we must define the methods.
}

package com.sujah.rentacar.demoapplication.controller;

import com.sujah.rentacar.demoapplication.Service.StudentService;
import com.sujah.rentacar.demoapplication.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Spring";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Spring from post method";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){      // The use of @RequestBody annotation is Whatever coming from request body converted into Student object.
        return studentService.save(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)         /* To run this method  http://localhost:8080/student?id=101  */
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){
        Student student = studentService.fetchStudentById(id);
        if(student == null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(student);
        }
    }

}

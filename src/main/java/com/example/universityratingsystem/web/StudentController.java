package com.example.universityratingsystem.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.universityratingsystem.model.Course;
import com.example.universityratingsystem.model.Rating;
import com.example.universityratingsystem.service.interfaces.StudentService;


@Controller
public class StudentController {
    private final StudentService ss;

    public StudentController(StudentService ss) {
        this.ss = ss; 
    }

    @PostMapping("/submit-form")
    @ResponseBody
    public String submitForm(@RequestBody Rating r) {
        r.setCourseId("123456");
        r.setFacultyId("654321");
        r.setStudentId("111111");
        System.out.println(r.toString());
        this.ss.insertRating(r);
        System.out.println("Success");
        return "";
    }




}

package com.example.universityratingsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.universityratingsystem.dao.interfaces.StudentMapper;
import com.example.universityratingsystem.model.Course;
import com.example.universityratingsystem.model.Rating;
import com.example.universityratingsystem.service.interfaces.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper sm;


    @Autowired
    public StudentServiceImpl(StudentMapper sm) {
        this.sm = sm;
    }


    @Override
    public List<Course> getAllCoursesBySemester(String semester, String studentId) {
        return this.sm.getAllCoursesBySemester(semester, studentId);
    }


    @Override
    public void insertRating(Rating r) {
        this.sm.insertRating(r);
    }


    @Override
    public void editRating(Rating r) {
        this.sm.editRating(r);
    }


    @Override
    public void deleteRating(int ratingId) {
        this.sm.deleteRating(ratingId);
    }


    @Override
    public Rating searchRating(int ratingId) {
        return this.sm.searchRating(ratingId);
    }


    
}

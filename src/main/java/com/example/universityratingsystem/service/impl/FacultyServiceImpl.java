package com.example.universityratingsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.universityratingsystem.dao.interfaces.FacultyMapper;
import com.example.universityratingsystem.model.Course;
import com.example.universityratingsystem.model.Rating;
import com.example.universityratingsystem.service.interfaces.FacultyService;

public class FacultyServiceImpl implements FacultyService {

    private FacultyMapper fm;

    public FacultyServiceImpl() {}

    @Autowired
    public FacultyServiceImpl(FacultyMapper fm) {
        this.fm = fm;
    }

    @Override
    public List<Course> getAllCourses(String facultyId) {
        return this.fm.getAllCourses(facultyId);
    }

    @Override
    public List<Course> getAllCoursesBySemester(String semester, String facultyId) {
        return this.fm.getAllCoursesBySemester(semester, facultyId);
    }

    @Override
    public Rating searchRating(int ratingId) {
        return this.fm.searchRating(ratingId);
    }
    
}

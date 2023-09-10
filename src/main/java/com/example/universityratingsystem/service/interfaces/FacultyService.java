package com.example.universityratingsystem.service.interfaces;

import java.util.List;

import com.example.universityratingsystem.model.Course;
import com.example.universityratingsystem.model.Rating;

public interface FacultyService {
        /**
     * method that obtains all the courses taught by a faculty 
     * @return - List of all courses associated with the faculty member
     */
    public List<Course> getAllCourses(String facultyId);

    /**
     * method that obtains all the courses taught by a faculty member in a semester
     * @param semester - semester to get all the courses
     * @return - List of all courses taken by the student in particular semester
     */
    public List<Course> getAllCoursesBySemester(String semester, String facultyId);

    /**
     * method that searches a rating by its rating id
     * @param ratingId
     */
    public Rating searchRating(int ratingId);
}

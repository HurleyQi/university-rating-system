package com.example.universityratingsystem.dao.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.universityratingsystem.model.Course;
import com.example.universityratingsystem.model.Rating;

/**
 * Interface that defines the methods for dao operations for Student
 */
@Mapper
public interface StudentMapper {

    /**
     * method that obtains all the courses taken by a student in a semester
     * @param semester - semester to get all the courses
     * @return - List of all courses taken by the student in particular semester
     */
    public List<Course> getAllCoursesBySemester(String semester, String studentId);

    /**
     * method that insert(makes) a rating
     * @param r - Rating that is made by the student
     */
    public void insertRating(Rating r);

    /**
     * method that edit a rating already made
     * @param r - edited rating
     */
    public void editRating(Rating r);

    /**
     * method that deletes a rating made 
     * @param ratingId - id of the rating that is to be deleted
     */
    public void deleteRating(int ratingId);

    /**
     * method that searches a rating by its rating id
     * @param ratingId
     */
    public Rating searchRating(int ratingId);
}

package com.example.universityratingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * java bean class for Rating to correspond with the ratings database table
 */
@Entity
@Table(name = "ratings")
public class Rating {
    // instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ratingId;
    
    private String question;
    private int rating;
    private String studentId;
    private String facultyId;
    private String courseId;

    /**
     * no argument constructor
     */
    public Rating() {}

    /**
     * constructor that takes in all the required attributes for Rating Object
     * @param ratingId
     * @param question
     * @param rating
     * @param studentId
     * @param facultyId
     * @param courseId
     */
    public Rating(String question, int rating, 
                    String studentId, String facultyId, String courseId) {
        this.question = question;
        this.rating = rating;
        this.studentId = studentId;
        this.facultyId = facultyId;
        this.courseId = courseId;
    }

    /**
     * equals method that compares two Rating Objects to determine if they are the same 
     * @param r
     * @return
     */
    public boolean equals(Rating r) {
        return (this.ratingId == r.getRatingId());
    }

    /**
     * toString method that returns a String representation of a Rating Object
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Rating Id: " + this.ratingId + "\n");
        result.append("question: " + this.question + "\n");
        result.append("rating: " + this.rating + "\n");
        result.append("student id: " + this.studentId + "\n");
        result.append("faculty id: " + this.facultyId + "\n");
        result.append("course id: " + this.courseId + "\n");
        return result.toString();
    }

    /**
     * getter method for rating id
     * @return
     */
    public int getRatingId() {
        return this.ratingId;
    }

    /**
     * setter method for rating id
     * @param ratingId - new ratingId
     */
    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    /**
     * getter method for question
     * @return
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * setter method for question
     * @param question - new question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * getter method for rating
     * @return
     */
    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * getter method for student id
     * @return
     */
    public String getStudentId() {
        return this.studentId;
    }

    /**
     * setter method for student id
     * @param studentId - new studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * getter method for faculty id
     * @return
     */
    public String getFacultyId() {
        return this.facultyId;
    }

    /**
     * setter method for faculty id
     * @param facultyId - new faculty id
     */
    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    /**
     * getter method for course id
     * @return
     */
    public String getCourseId() {
        return this.courseId;
    }

    /**
     * setter method for course id
     * @param courseId - new courseId
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}

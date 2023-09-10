package com.example.universityratingsystem.model;

/**
 * java bean class for Course to correspond with the course database table
 */
public class Course {
    // instance variables
    private String name;
    private String courseId;
    private String facultyId;
    private String department;
    private String college;
    private String location;
    private String timeOfCourse;
    private int hours;

    /**
     * no argument constructor
     */
    public Course() {}

    /**
     * constructor that takes in all the required attribute for Course Object
     * @param name
     * @param courseId
     * @param facultyId
     */
    public Course(String name, String courseId, String facultyId) {
        this.name = name;
        this.courseId = courseId;
        this.facultyId = facultyId;
    }

    /**
     * constructor that takes in all the attributes for Course Object
     * @param name
     * @param courseId
     * @param facultyId
     * @param department
     * @param college
     * @param location
     * @param timeOfCourse
     * @param hours
     */
    public Course(String name, String courseId, String facultyId, String department,
                    String college, String location, String timeOfCourse, int hours) {
        this.name = name;
        this.courseId = courseId;
        this.facultyId = facultyId;
        this.department = department; 
        this.college = college;
        this.location = location;
        this.timeOfCourse = timeOfCourse;
        this.hours = hours;
    }

    /**
     * equals method that compares two Course Objects
     * @param c - the other Course Object to be compared with
     * @return - boolean value representing if the two Course Objects are equal
     */
    public boolean equals(Course c) {
        return (this.courseId.equals(c.getCourseId()));
    }

    /**
     * toString method that returns a String representation of the Course Object
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Course name: " + this.name + "\n");
        result.append("course id: " + this.courseId + "\n");
        result.append("faculty id: " + this.facultyId + "\n");
        result.append("department: " + this.department + "\n");
        result.append("college: " + this.college + "\n");
        result.append("location: " + this.location + "\n");
        result.append("time of course: " + this.timeOfCourse + "\n");
        result.append("hours: " + this.hours + "\n");
        return result.toString();
    }

    /**
     * getter method for name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * setter method for name
     * @param name - new name
     */
    public void setName(String name) {
        this.name = name;
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
     * @param courseId - new course id
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
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
     * getter method for department
     * @return
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * setter method for department
     * @param department - new department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * getter method for college
     * @return
     */
    public String getCollege() {
        return this.college;
    }

    /**
     * setter method for college
     * @param college - new college
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * getter method for location
     * @return
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * setter method for location
     * @param location - new location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * getter method for time of course
     * @return
     */
    public String getTimeOfCourse() {
        return this.timeOfCourse;
    }

    /**
     * setter method for time of course
     * @param timeOfCourse - new timeOfCourse
     */
    public void setTimeOfCourse(String timeOfCourse) {
        this.timeOfCourse = timeOfCourse;
    }

    /**
     * getter method for hours
     * @return
     */
    public int getHours() {
        return this.hours;
    }

    /**
     * setter method for hours
     * @param hours - new hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }
}

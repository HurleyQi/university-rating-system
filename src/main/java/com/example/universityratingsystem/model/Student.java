package com.example.universityratingsystem.model;

// imports
import java.util.Date;

/**
 * standard java bean class for Student object to represent Student table
 */
public class Student {

    // instance variables
    private String id;
    private String name;
    private String address;
    // 1 = male, 2 = female
    private String major;
    private int gender;
    private Date dob;

    /**
     * No argument constructor
     */
    public Student() {}

    /**
     * Constructor that takes in all the required elements for the Student table 
     * @param id
     * @param name
     * @param address
     * @param major
     * @param dob
     */
    public Student(String id, String name, String address, String major, Date dob) {
        this.id = id;
        this.name = name; 
        this.address = address; 
        this.major = major; 
        this.dob = dob;
    }

    /**
     * Constructor that takes in all the elements associated with Student and the Student table
     * @param id
     * @param name
     * @param address
     * @param major
     * @param gender
     * @param dob
     */
    public Student(String id, String name, String address, String major, int gender, Date dob) {
        this.id = id;
        this.name = name; 
        this.address = address; 
        this.major = major; 
        this.gender = gender;
        this.dob = dob;
    }

    /**
     * equals method, determined by comparing the id between the two friendd since student 
     * id must be unique
     * @param s other Student to be compared
     * @return boolean value representing if the two Student objects are the same
     */
    public boolean equals(Student s) {
        return (s.id.equals(this.id));
    }

    /**
     * toString method that return the String represent of Student
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Student id: " + this.id + "\n");
        result.append("name: " + this.name + "\n");
        result.append("address: " + this.address + "\n");
        result.append("major: " + this.major + "\n");
        if (this.gender == 1) {
            result.append("gender: male \n");
        } else if (this.gender == 2) {
            result.append("gender: female \n");
        } else {
            result.append("gender: NULL \n");
        }
        result.append("date of birth: " + this.dob.toString() + "\n");
        return result.toString();
    }

    /**
     * getter method for student id
     */
    public String getId() {
        return this.id;
    }

    /**
     * setter method for student id
     * @param id - new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter method for name
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
     * getter method for address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * setter method for address
     * @param address - new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * getter method for major
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * setter method for major
     * @param major - new major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * getter method for gender
     */
    public int getGender() {
        return this.gender;
    }

    /**
     * setter method for gender
     * @param gender - new gender represented by int
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * getter method for date of birth
     */
    public Date getDob() {
        return this.dob;
    }

    /**
     * setter method for date of birth
     * @param dob - new date of birth
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }
}

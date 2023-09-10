package com.example.universityratingsystem.model;

/**
 * java bean class for Faculty to correspond with the faculty database table
 */
public class Faculty {
    // instance variables
    private String name;
    private String id;
    private String department;
    private String college;
    private int yearsOfEmployment;

    /**
     * no argument constructor
     */
    public Faculty() {}

    /**
     * constructor that takes in all the required attributes of Faculty Object
     * @param name
     * @param id
     * @param department
     * @param college
     */
    public Faculty(String name, String id, String department, String college) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.college = college;
    }

    /**
     * constructor that takes in all the attributes of Faculty Object
     * @param name
     * @param id
     * @param department
     * @param college
     * @param yearsOfEmployment
     */
    public Faculty(String name, String id, String department, String college, int yearsOfEmployment) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.college = college;
        this.yearsOfEmployment = yearsOfEmployment;
    }

    /**
     * equals method to compare two Faculty Objects
     * @param f - the other Faculty Object to be compared
     * @return - boolean value represent if the two Faculties are equal
     */
    public boolean equals(Faculty f) {
        return (f.id.equals(this.id));
    }

    /**
     * toString method for Faculty that returns a String representation of Faculty
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Faculty name: " + this.name + "\n");
        result.append("id: " + this.id + "\n");
        result.append("department: " + this.department + "\n");
        result.append("college: " + this.college + "\n");
        result.append("years of employment: " + this.yearsOfEmployment + "\n");
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
     * getter method for id
     * @return
     */
    public String getId() {
        return this.id;
    } 
    
    /**
     * setter method for id
     * @param id - new id
     */
    public void setId(String id) {
        this.id = id;
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
     * getter method for years of employment
     * @return
     */
    public int getYearsOfEmployment() {
        return this.yearsOfEmployment;
    }

    /**
     * setter method for years of employment
     * @param yearsOfEmployment - new yearsOfEmployment
     */
    public void setYearsOfEmployment(int yearsOfEmployment) {
        this.yearsOfEmployment = yearsOfEmployment;
    }
}

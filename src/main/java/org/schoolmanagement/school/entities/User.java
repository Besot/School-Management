package org.schoolmanagement.school.entities;

import org.schoolmanagement.school.entities.enumz.Gender;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class User {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private Long phoneNo;
    private String email;
    private String address;
    private String nextOfKin;
    private String courseName;
    private int courseNo;
    private int score;
    private int maximumNoOfCoursesReg;
    private String isArchived;
    private String isDeleted;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(String isArchived) {
        this.isArchived = isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMaximumNoOfCoursesReg() {
        return maximumNoOfCoursesReg;
    }

    public void setMaximumNoOfCoursesReg(int maximumNoOfCoursesReg) {
        this.maximumNoOfCoursesReg = maximumNoOfCoursesReg;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " +
                ", Age: " + age +
                ", Gender: " + gender +
                ", PhoneNo: " + phoneNo +
                ", Email: " + email + " " +
                ", Address: " + address + " " +
                ", NextOfKin: " + nextOfKin + " " +
                ", CourseName: " + courseName + " " +
                ", CourseNo: " + courseNo +
                ", Score: " + score +",Maximum No Of Courses Registered: " +maximumNoOfCoursesReg;
    }
}

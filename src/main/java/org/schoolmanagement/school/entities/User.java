package org.schoolmanagement.school.entities;

import lombok.Data;
import org.schoolmanagement.school.entities.enums.Gender;
import org.schoolmanagement.school.entities.enums.Role;

@Data
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
    private Role role;


//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public void setCourseNo(int courseNo) {
//        this.courseNo = courseNo;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public void setFirstName(String name) {
//        this.firstName = name;
//    }
//
//    public void setIsArchived(String isArchived) {
//        this.isArchived = isArchived;
//    }
//
//    public void setIsDeleted(String isDeleted) {
//        this.isDeleted = isDeleted;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public void setPhoneNo(Long phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setNextOfKin(String nextOfKin) {
//        this.nextOfKin = nextOfKin;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setMaximumNoOfCoursesReg(int maximumNoOfCoursesReg) {
//        this.maximumNoOfCoursesReg = maximumNoOfCoursesReg;
//    }

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

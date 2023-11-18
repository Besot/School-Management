package org.schoolmanagement.school.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.schoolmanagement.school.entities.enums.Behaviour;
import org.schoolmanagement.school.entities.enums.CurrentClass;

import java.util.ArrayList;




@EqualsAndHashCode(callSuper = true)
@Data
// A student class that inherits fields from the user class
public class Student extends User {
    private String studentIdNo;
    private CurrentClass currentClass;
    private String dateEnrolled;
    private Behaviour behavior;
    private String guardianEmail1;
    private String guardianEmail2;
    private int gradeLevel;



    public void displayStudentDetails(){

    this.setFirstName("Bukey Casey");
    this.setAge(14);
    this.setStudentIdNo("1002_AB");
    this.setCurrentClass(CurrentClass.JSS_3);
    this.setDateEnrolled("12/10/2021");
    this.setScore(76);
    this.setBehavior(Behaviour.HONEST);
    this.setMaximumNoOfCoursesReg(6);

    ArrayList<String> studentBio = new ArrayList<>();
    studentBio.add("Name: "+getFirstName());
    studentBio.add("Age: "+getAge());
    studentBio.add("Student Id No: "+getStudentIdNo());
    studentBio.add("Class: "+getCurrentClass());
    studentBio.add("Date Admitted: "+getDateEnrolled());
    studentBio.add("Exam Score: "+getScore());
    studentBio.add("Behaviour: "+getBehavior());
    studentBio.add("Total No. Of Courses Registered: "+getMaximumNoOfCoursesReg());

        for (String studentDetail : studentBio) {
            System.out.println(studentDetail);
        }
}
//
//
//        //Getters and setters
//
//    public void setStudentIdNo(String studentIdNo) {
//        this.studentIdNo = studentIdNo;
//    }
//
//    public void setCurrentClass(CurrentClass currentClass) {
//        this.currentClass = currentClass;
//    }
//
//    public void setDateEnrolled(String dateEnrolled) {
//        this.dateEnrolled = dateEnrolled;
//    }
//
//    public void setGuardianEmail1(String guardianEmail1) {
//        this.guardianEmail1 = guardianEmail1;
//    }
//
//    public void setGuardianEmail2(String guardianEmail2) {
//        this.guardianEmail2 = guardianEmail2;
//    }
  //      public void setGradeLevel(int gradeLevel) {
    //    this.gradeLevel = gradeLevel;
     //   }

       // public void setBehavior(Behaviour behavior) {
        //this.behavior = behavior;
    //}


    @Override
    public String toString() {
        return " Student Id No: " + studentIdNo +
                " || Grade Level: " + gradeLevel +
                " || First Name: " + getFirstName() +
                " || Last Name: " + getLastName() +
                " || Email: " + getEmail() +
                " || GuardianEmail1: " + guardianEmail1 +
                " || GuardianEmail2: " + guardianEmail2 +
                " || isArchived: " + getIsArchived() +
                " || isDeleted: " + getIsDeleted();
    }
}

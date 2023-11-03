package org.schoolmanagement.school.entities;

import org.schoolmanagement.school.entities.enumz.Behaviour;
import org.schoolmanagement.school.entities.enumz.CurrentClass;

import java.util.ArrayList;
import java.util.Iterator;


// A student class that inherits fields from the user class
public class Student extends User {
    private String studentIdNo;
    private CurrentClass currentClass;
    private String dateEnrolled;
    private Behaviour behavior;
    private String guardianEmail1;
    private String guardianEmail2;
    private int gradeLevel;

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Behaviour getBehavior() {
        return behavior;
    }

    public void setBehavior(Behaviour behavior) {
        this.behavior = behavior;
    }

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


        //Getters and setters

    public String getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentIdNo(String studentIdNo) {
        this.studentIdNo = studentIdNo;
    }

    public CurrentClass getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(CurrentClass currentClass) {
        this.currentClass = currentClass;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public void setGuardianEmail1(String guardianEmail1) {
        this.guardianEmail1 = guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }


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

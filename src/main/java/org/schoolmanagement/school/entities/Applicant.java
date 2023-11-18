package org.schoolmanagement.school.entities;

import org.schoolmanagement.school.entities.enums.Gender;

import java.util.ArrayList;

public class Applicant extends User {
    private String applicationDate;

    //A method to store applicants information
public void applicantInfo(){
    //Setting applicants information
    this.setFirstName("Adeshola Ayantoye");
    this.setAge(13);
    this.setGender(Gender.Female);
    this.setAddress("Imperial Oak Estate Lekki");
    this.setApplicationDate("23/10/2023");
    this.setScore(65);

    //An Arraylist of the inputted applicant info
    ArrayList<String> app = new ArrayList<>();
    app.add("Name: "+this.getFirstName());
    app.add("Age: "+this.getAge());
    app.add("Gender: "+this.getGender());
    app.add("Address: "+this.getAddress());
    app.add("Application Date: "+this.getApplicationDate());
    app.add("Score: "+this.getScore());

    System.out.println("APPLICANT INFORMATION");
    // for each loop to loop through the arraylist of applicant info
    for (String detail : app){
        System.out.println(detail);
    }
}

    //getters and setters
    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
}

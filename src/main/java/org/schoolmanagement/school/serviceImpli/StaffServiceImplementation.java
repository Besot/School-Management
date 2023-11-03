package org.schoolmanagement.school.serviceImpli;

import org.schoolmanagement.school.entities.Applicant;
import org.schoolmanagement.school.entities.Staff;

import org.schoolmanagement.school.entities.enumz.Gender;
import org.schoolmanagement.school.entities.enumz.Role;
import org.schoolmanagement.school.services.Services;

import java.util.ArrayList;
import java.util.Objects;


public class StaffServiceImplementation implements Services {

    @Override
    public void teachCourse(Staff staff) {

        // A Ternary  operator to  determine what the staff does based on the inputted role enum
        boolean condition = staff.getRole()== Role.Teacher;
        boolean condition2 = staff.getRole() == Role.Principal;
        String teach = condition ? staff.getFirstName() + " teaches "+staff.getCourseName(): (condition2 ? staff.getFirstName() + " is the Principal" : staff.getFirstName() + " is a Non-academic STAFF");
        System.out.println(teach);






    }

}

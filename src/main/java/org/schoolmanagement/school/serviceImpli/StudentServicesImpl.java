package org.schoolmanagement.school.serviceImpli;

import org.schoolmanagement.school.entities.Student;
import org.schoolmanagement.school.entities.enums.Behaviour;
import org.schoolmanagement.school.services.StudentServices;

public class StudentServicesImpl implements StudentServices {
    @Override
    public void promoteStudent(Student student) {
        //setting student info


        boolean con = student.getScore() >= 60;
        String promo = con ? "Congratulations, you have been PROMOTED!" : "Due to poor performance, you will have to REPEAT";
        System.out.println(promo);
    }


    @Override
    public String expelStudent(Student student) {

        // if statement to determine student expulsion status based on the No. of time suspended
        if (student.getBehavior() == Behaviour.RUDENESS || student.getBehavior() == Behaviour.MALPRACTICE || student.getBehavior() == Behaviour.SEXUAL_ABUSE || student.getBehavior() == Behaviour.RACISM || student.getBehavior() == Behaviour.VIOLENCE) {
            return "Due to an act of " + student.getBehavior() + ", You have been EXPELLED!";
        } else {
            return "";


        }

    }

    @Override
    public String takeCourse(Student student) {
        // if statement to determine if a student can take a course
        if (student.getMaximumNoOfCoursesReg() >= 6) {
            return "You have exceeded the maximum number of courses("+ student.getMaximumNoOfCoursesReg()+") you can take.";
        } else {
            return "You can still take more course.";
        }
    }
}

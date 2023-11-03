package org.schoolmanagement.school.serviceImpli;

import org.junit.jupiter.api.Test;
import org.schoolmanagement.school.entities.Student;

import static org.junit.jupiter.api.Assertions.*;


class StudentServicesImpliTest {
    StudentServicesImpli studentService = new StudentServicesImpli();

    @Test
    void expelStudentsBasedOnNumberOfSuspensionGreaterThan3() {
        Student student = new Student();
        student.setTimesSuspended(5);
        assertEquals("You have been expelled",studentService.expelStudent(student));
    }

    @Test
    void expelStudentsBasedOnNumberOfSuspensionLessThan3() {
        Student student = new Student();
        student.setTimesSuspended(2);
        assertEquals("You will be expelled at the 3rd suspension - One last chance",studentService.expelStudent(student));
    }



}
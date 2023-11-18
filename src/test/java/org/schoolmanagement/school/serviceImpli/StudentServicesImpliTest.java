package org.schoolmanagement.school.serviceImpli;

import org.junit.jupiter.api.Test;
import org.schoolmanagement.school.entities.Student;
import org.schoolmanagement.school.entities.enums.Behaviour;

import static org.junit.jupiter.api.Assertions.*;


class StudentServicesImpliTest {
    StudentServicesImpl studentService = new StudentServicesImpl();

    @Test
    void expelStudentsBasedOnBehavior() {
        Student student = new Student();
        student.setBehavior(Behaviour.MALPRACTICE);
        assertEquals("Due to an act of " + student.getBehavior() + ", You have been EXPELLED!",studentService.expelStudent(student));
    }

    @Test
    void DoNotExpelStudentsBasedOnBehavior() {
        Student student = new Student();
        student.setBehavior(Behaviour.HONEST);
        assertEquals("",studentService.expelStudent(student));
    }



}
package org.schoolmanagement.school.entities;

import org.junit.jupiter.api.Test;
import org.schoolmanagement.school.entities.enumz.CurrentClass;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getTimesSuspendedd() {
        Student stu = new Student();
        stu.setCurrentClass(CurrentClass.SS_2);
        stu.setStudentIdNo("4323");
        stu.setDateEnrolled("21/10/2022");
        stu.setTimesSuspended(2);
        assertEquals(CurrentClass.SS_2, stu.getCurrentClass());
        assertEquals("4323", stu.getStudentIdNo());
        assertEquals("21/10/2022",stu.getDateEnrolled());
        assertEquals(2, stu.getTimesSuspended());

    }

    @Test
    void setTimesSuspended() {
    }

    @Test
    void getStudentIdNo() {
    }

    @Test
    void setStudentIdNo() {
    }

    @Test
    void getCurrentClass() {
    }

    @Test
    void setCurrentClass() {
    }

    @Test
    void getDateEnrolled() {
    }

    @Test
    void setDateEnrolled() {
    }
}
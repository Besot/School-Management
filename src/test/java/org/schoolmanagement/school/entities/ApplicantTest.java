package org.schoolmanagement.school.entities;

import org.junit.jupiter.api.Test;
import org.schoolmanagement.school.entities.enumz.Gender;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    @Test
    void getApplicationDateD() {
        Applicant app = new Applicant();
        app.setName("Banjo");
        app.setAge(12);
        app.setGender(Gender.Male);
        app.setApplicationDate("20/01/2023");
        app.setScore(340);
        app.setAddress("Orchid Road Lekki Lagos State");
        app.setEmail("bob@gmail.com");

        assertEquals(12, app.getAge());
        assertEquals(Gender.Male, app.getGender());
        assertEquals("20/01/2023", app.getApplicationDate());
        assertEquals(340, app.getScore());
        assertEquals("Orchid Road Lekki Lagos State", app.getAddress());
        assertEquals("bob@gmail.com", app.getEmail());

    }


    }

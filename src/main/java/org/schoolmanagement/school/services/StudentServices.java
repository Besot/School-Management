package org.schoolmanagement.school.services;

import org.schoolmanagement.school.entities.Student;

public interface StudentServices {
    void promoteStudent (Student student);

    String expelStudent(Student student);

    String takeCourse(Student student);
}

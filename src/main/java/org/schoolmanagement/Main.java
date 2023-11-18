package org.schoolmanagement;

import org.schoolmanagement.school.entities.*;
import org.schoolmanagement.school.entities.enums.Behaviour;
import org.schoolmanagement.school.entities.enums.CurrentClass;
import org.schoolmanagement.school.entities.enums.Gender;
import org.schoolmanagement.school.entities.enums.Role;
import org.schoolmanagement.school.serviceImpli.ApplicantServicesImpl;
import org.schoolmanagement.school.serviceImpli.StaffServiceImplementation;
import org.schoolmanagement.school.serviceImpli.StudentServicesImpl;
import org.schoolmanagement.school.util.StaffUtils;
import org.schoolmanagement.school.util.StudentUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, BookOutOfStockException {

        //Creating an object of the  staffService implementation Class
        StaffServiceImplementation teach = new StaffServiceImplementation();


        Staff staff1 =new Staff();
        // this will print the staff details
        staff1.staffDetail();

        //calling the teachCourse() method of the staffService implementation
        teach.teachCourse(staff1);

        //space between staff information and applicant info
        System.out.println();


        //Applicant information display with a decision implemented based on admission exam cut off mark
        ApplicantServicesImpl ad = new ApplicantServicesImpl();
        Applicant applicant1 = new Applicant();
        //method to print applicant details
        applicant1.applicantInfo();
        //implementation to admit applicants
        ad.admitStudent(applicant1);


        //space between the applicant and student info
        System.out.println();

        System.out.println();


        // creating object "studentService" of the studentService implementation class
        StudentServicesImpl studentService = new StudentServicesImpl();

        //creating object "student1(to be promoted)"
        Student student1 = new Student();


        //printing student details by calling on the studentDetails method in the Student class
        student1.displayStudentDetails();

        //service to determine student promotion status based on score
        studentService.promoteStudent(student1);
        System.out.println(studentService.takeCourse(student1));
        System.out.println();



        //"student2(to be expelled)"
        Student student2 = new Student();

        //service to determine student's expulsion status based on behaviour
        student2.setFirstName("Charles Darwin");
        student2.setStudentIdNo("2321_CD");
        student2.setGender(Gender.Male);
        student2.setAge(16);
        student2.setDateEnrolled("21/07/2020");
        student2.setCurrentClass(CurrentClass.SS_2);
        student2.setBehavior(Behaviour.MALPRACTICE);


        System.out.println(student2+ " "+'\n'+studentService.expelStudent(student2));

        System.out.println();
        System.out.println();

        StaffUtils staffUtils = new StaffUtils();

        System.out.println("..............................................................<= INFO IN STAFF csv FILE =>.................................................................................");
        System.out.println();
        staffUtils.staffListCsv("src/main/java/org/schoolmanagement/school/files/Staff_file.csv");

        System.out.println();
        System.out.println();

        StudentUtil std = new StudentUtil();
        System.out.println("............................................................<= INFO IN STUDENT csv FILE =>..............................................................");
        System.out.println();
        std.readStudentInfo("src/main/java/org/schoolmanagement/school/files/Student_file.csv");



        //Calling the method to write the list of staff to a txt file
        StaffUtils.writeStaffFileToTxt("src/main/java/org/schoolmanagement/school/files_written/staff_file.txt");


        //Calling the method to write the list of Student to a txt file
        StudentUtil.writeStudentFileToTxt("src/main/java/org/schoolmanagement/school/files_written/student_file.txt");
        System.out.println();

        System.out.println("..........................................................<= FIRST COME, FIRST SERVED =>......................................................");
        System.out.println();

        FunctionalInterfaceImpl library = new FunctionalInterfaceImpl();
        library.addBook.accept("Things Fall Apart", 5);
        library.addBook.accept("Engineering Geology", 5);
        library.addBook.accept("Java for Beginners",3);

        library.fifoRequest.accept("Adewale","Engineering Geology", Role.JUNIOR_STUDENT);
        library.fifoRequest.accept("Tayo","Engineering Geology", Role.SENIOR_STUDENT);
        library.fifoRequest.accept("Desmond","Engineering Geology", Role.JUNIOR_STUDENT);
        library.fifoRequest.accept("Tosin","Engineering Geology", Role.TEACHER);
        library.fifoRequest.accept("Bukey","Engineering Geology", Role.TEACHER);
        library.fifoRequest.accept("Casey","Engineering Geology", Role.SENIOR_STUDENT);
        library.fifoRequest.accept("Bolu","Engineering Geology", Role.SENIOR_STUDENT);
        library.grantFifoRequest();

        System.out.println();
        library.displayBookAvailability();
        System.out.println();


        System.out.println("..........................................................<= SERVED BASED ON PRIORITY =>......................................................");
        System.out.println();
        library.priorityRequest.accept("Adewale","Things Fall Apart", Role.JUNIOR_STUDENT);
        library.priorityRequest.accept("Tayo","Java for Beginners", Role.SENIOR_STUDENT);
        library.priorityRequest.accept("Desmond","Things Fall Apart", Role.JUNIOR_STUDENT);
        library.priorityRequest.accept("Tosin","Engineering Geology", Role.TEACHER);
        library.priorityRequest.accept("Bukey","Things Fall Apart", Role.TEACHER);
        library.priorityRequest.accept("Casey","Things Fall Apart", Role.SENIOR_STUDENT);
        library.priorityRequest.accept("Bolu","Engineering Geology", Role.SENIOR_STUDENT);
        library.priorityRequest.accept("Alex","Things Fall Apart", Role.TEACHER);

        System.out.println();
        library.grantPriorityRequest();
        library.displayBookAvailability();
    }


}
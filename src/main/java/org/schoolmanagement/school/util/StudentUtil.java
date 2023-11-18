package org.schoolmanagement.school.util;

import lombok.Data;
import org.schoolmanagement.school.entities.Student;
import org.schoolmanagement.school.entities.enums.Role;

import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class StudentUtil {
    //ArrayList to store the data from the student csv file
    public static List<Student> studentList = new ArrayList<>();


    public void readStudentInfo(String fileName) throws IOException {
        String line;

        BufferedReader readInfo = new BufferedReader(new FileReader(fileName));

        boolean isHeader = true;

        while ((line = readInfo.readLine()) != null) {
            if (isHeader) {

                //skips the header row
                isHeader = false;
                continue;
            }
            // this will split everywhere there is comma in the csv file
            String[] column = line.split(",", -1);
            for (int i = 0; i < column.length; i++) {
                if (column[i].isBlank()) {
                    column[i] = null;
                }
            }

            String Id = column[0];
            String firstName = column[1];
            String lastName = column[2];
            int gradeLevel = Integer.parseInt(column[3]);
            String email = column[4];
            String guardianEmail1 = column[5];
            String guardianEmail2 = column[6];
            String isArchived = column[7];
            String isDeleted = column[8];



                Student studentData = new Student();
                studentData.setStudentIdNo(Id);
                studentData.setFirstName(firstName);
                studentData.setLastName(lastName);
                studentData.setGradeLevel(gradeLevel);
                studentData.setEmail(email);
                studentData.setGuardianEmail1(guardianEmail1);
                studentData.setGuardianEmail2(guardianEmail2);
                studentData.setIsArchived(isArchived);
                studentData.setIsDeleted(isDeleted);

                studentList.add(studentData);

        }
        // for each statement to traverse the list
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void writeStudentFileToTxt(String filePath) throws FileNotFoundException {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        ) {
            for (Student data : studentList) {
                writer.write(String.valueOf(data));
                writer.newLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


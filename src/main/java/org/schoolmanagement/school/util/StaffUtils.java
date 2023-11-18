package org.schoolmanagement.school.util;

import org.schoolmanagement.school.entities.Staff;
import org.schoolmanagement.school.entities.enums.Role;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StaffUtils {

    //ArrayList to store data from the csv file
    public static List<Staff> listOfStaff = new ArrayList<>();

    public void staffListCsv(String fileName){
        try (BufferedReader readStaff = new BufferedReader(new FileReader(fileName))) {

            String line;

            boolean isHeader = true;
            while ((line = readStaff.readLine()) != null) {
                if (isHeader) {

             //Skips the header row
                    isHeader = false;
                    continue;
                }

                String[] col = line.split(",", -1);

                for (int i = 0; i < col.length; i++) {
                    if (col[i].isBlank()) {
                        col[i] = null;

                    }
                }
                String staffID = col[0];
                String email = col[1];
                String firstName = col[2];
                String lastName = col[3];

                Staff staffData = new Staff();
                staffData.setStaffId(staffID);
                staffData.setEmail(email);
                staffData.setFirstName(firstName);
                staffData.setLastName(lastName);


                listOfStaff.add(staffData);
            }
             for (Staff teacher : listOfStaff) {
               System.out.println(teacher);
        }
            } catch (IOException e){
             e.printStackTrace();
        }

    }
    public static void writeStaffFileToTxt(String filePath){
        try(
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            for(Staff teacher :listOfStaff){
                writer.write(String.valueOf(teacher));
                writer.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



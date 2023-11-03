package org.schoolmanagement.school.util;

import org.schoolmanagement.school.entities.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StaffUtils {
    public static List<Staff> listOfStaff = new ArrayList<>();

    public void staffListCsv(String fileName){
        try (BufferedReader readStaff = new BufferedReader(new FileReader(fileName))) {

            String line;

            boolean isHeader = true;
            while ((line = readStaff.readLine()) != null) {
                if (isHeader) {

                    isHeader = false;
                    continue;
                }

                String[] col = line.split(",", -1);

                for (int i = 0; i < col.length; i++) {
                    if (col[i].isBlank()) {
                        col = null;

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
             for (Staff data : listOfStaff) {
               System.out.println(data);
        }
            } catch (IOException e){
             e.printStackTrace();
        }

    }
    public static void writeStaffFileToTxt(String filePath){
        try(
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));)
        {
            for(Staff data :listOfStaff){
                writer.write(String.valueOf(data));
                writer.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



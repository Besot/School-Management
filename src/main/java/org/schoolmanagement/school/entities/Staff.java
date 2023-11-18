package org.schoolmanagement.school.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.schoolmanagement.school.entities.enums.Gender;
import org.schoolmanagement.school.entities.enums.Role;

import java.math.BigDecimal;
import java.util.ArrayList;
// A class for staff details with enums to identify each role
    //  Principal, Teacher, non-academic staff

@EqualsAndHashCode(callSuper = true)
@Data
public class Staff extends User {
        //  getters and setters to access the private fields in the staff class  when needed in other classes
        private  String staffId;
  //  private Role role;
    private String qualification;
    private BigDecimal salary;

    //A method to store staff information
    public  void staffDetail() {

                this.setFirstName("Olamide Besot");
                this.setRole(Role.TEACHER);
                this.setStaffId("32443TE");
                this.setGender(Gender.Male);
                this.setPhoneNo(234_830_229_749L);
                this.setNextOfKin("Adewale Nelson");
                this.setQualification("B.Edu");
                this.setCourseName("Mathematics");

        //An Arraylist of staff information
                ArrayList<String> details = new ArrayList<>();
                details.add("Name: "+getFirstName());
                details.add("ID: "+getStaffId());
                details.add("Role: "+getRole());
                details.add("Gender: "+getGender());
                details.add("Qualification: "+getQualification());




        // A for each loop to loop through the stored staff information
        System.out.println("STAFF INFORMATION");
                for ( String d : details){
                    System.out.println(d);
                }



        }

//        public void setStaffId(String staffId) {
//        this.staffId = staffId;
//    }
//
//        public void setRole(Role role) {
//        this.role = role;
//    }
//
//        public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
//
//        public void setSalary(BigDecimal salary) {
//        this.salary = salary;



    @Override
    public String toString() {
        return "StaffID: " +getStaffId()+
                " || Email: " + getEmail() +
                " || First Name: " + getFirstName() +
                " || Last Name: " + getLastName();
    }
}

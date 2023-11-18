package org.schoolmanagement.school.serviceImpli;

import org.schoolmanagement.school.entities.Applicant;
import org.schoolmanagement.school.services.ApplicantServices;

public class ApplicantServicesImpl implements ApplicantServices {
    @Override
    public void admitStudent(Applicant applicant) {



        // A Ternary operator to determine admission status based on minimum cut off mark of 60
        boolean admissionTerm = applicant.getAge()>= 12;
        String admissionStatus = admissionTerm? applicant.getScore()+" You have been offered ADMISSION": "You didn't meet the CUT-OFF MARK!";

        System.out.println(admissionStatus);






    }
}

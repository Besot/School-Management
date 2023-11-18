package org.schoolmanagement.school.entities;

import org.schoolmanagement.school.entities.enums.Role;

import java.util.Comparator;

public class RoleComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        if (user1.getRole() == Role.TEACHER) {
            return -1;
        } else if (user2.getRole() == Role.TEACHER) {
            return 1;
        } else if (user1.getRole() == Role.SENIOR_STUDENT) {
            return -1;
        } else if (user2.getRole() == Role.SENIOR_STUDENT) {
            return 1;
        } else {
            return 0;
        }
    }
}

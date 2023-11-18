package org.schoolmanagement.school.entities;


import lombok.Data;

import lombok.Getter;
import org.schoolmanagement.school.entities.enums.Role;

@Data
public class RequestBook {
    @Getter
    private String nameOfRequester;
    private String bookTitle;
    private Role roleOfRequester;


    public RequestBook(String nameOfRequester,String bookTitle, Role roleOfRequester) {
        this.nameOfRequester = nameOfRequester;
        this.bookTitle = bookTitle;
        this.roleOfRequester = roleOfRequester;
    }

    public Role getRequester() {
        return roleOfRequester;
    }


    public int getPriority() {
        return switch (roleOfRequester) {
            case TEACHER -> 1;
            case SENIOR_STUDENT -> 2;
            case JUNIOR_STUDENT -> 3;

            case PRINCIPAL -> 0;
        };

}
}

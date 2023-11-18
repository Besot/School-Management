package org.schoolmanagement.school.services;
@FunctionalInterface
public interface BookInterface <T,U>{
    void accept(T t, U u);
}

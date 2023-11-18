package org.schoolmanagement.school.services;
@FunctionalInterface
public interface AvailabilityInterface <T, U>{
    T apply(U u);
}

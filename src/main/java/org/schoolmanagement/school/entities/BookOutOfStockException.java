package org.schoolmanagement.school.entities;

public class BookOutOfStockException extends Exception{
    public BookOutOfStockException(String message) {
        super(message);
    }
}

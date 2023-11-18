package org.schoolmanagement.school.services;

import org.schoolmanagement.school.entities.BookOutOfStockException;

@FunctionalInterface
public interface LibraryInterface<T,U, V> {
     void accept(T  t, U  u, V  v);
}

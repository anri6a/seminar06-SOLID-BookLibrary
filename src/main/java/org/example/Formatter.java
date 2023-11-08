package org.example;

import java.util.ArrayList;

/**
 * Принцип инверсии зависимостей -> Dependency Inversion Principle
 */
public interface Formatter {
    String formatBookList(ArrayList<Book> formatBook);

}

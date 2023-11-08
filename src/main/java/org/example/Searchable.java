package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Принцип разделения интерфейса ->
 *         Interface Segregation Principle
 *         т.к. это в проекте уже второй интерфейс
 */
public interface Searchable {
    List<Book> searchByAuthor(String authorName, ArrayList<Book> bookList);

}

package org.example;

import java.util.ArrayList;
import java.util.List;

/*2) Создать систему управления библиотекой(SOLID)
        a) Book - должен отвечать только за хранение информации о книге. (единственная ответственность ->
        Single Responsibility Principle)
        b) Genre - должен хранить информацию о жанрах книг. (открыт для расширения, но закрыт для изменения ->
        Open-Closed Principle)
        c) ElectronBook - должна иметь формат чтения и размер. (Принцип подстановки Барбары Лисков - >
        Liskov Substitution Principle)
        d) Searchable - должен производить поиск по авторам книг. (Принцип разделения интерфейса ->
        Interface Segregation Principle)
        e) Formatter - должен выводить информацию в различных форматах( без формата,json,html)-
        заглушки (Принцип инверсии зависимостей -> Dependency Inversion Principle)
*/
public class Main {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary(5);
        System.out.println("bookLibrary = " + bookLibrary);
        System.out.println("________________________________");


        System.out.println("bookLibrary.searchByAuthor(\"Pushkin3\") = "
                + bookLibrary.searchByAuthor("Pushkin3"));
        List<Book> findBook = bookLibrary.searchByAuthor("Pushkin3");
        Formatter formatter = new JsonFormatter();
        System.out.println("________________________________");

        System.out.println("formatter.formatBookList((ArrayList<Book>) findBook) = " +
                formatter.formatBookList((ArrayList<Book>) findBook));
        System.out.println("________________________________");
        formatter = new HtmlFormatter();
        System.out.println(formatter.formatBookList((ArrayList<Book>) findBook));
    }
}
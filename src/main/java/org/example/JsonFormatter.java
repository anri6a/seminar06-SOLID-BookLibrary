package org.example;

import java.util.ArrayList;

public class JsonFormatter implements Formatter{
    @Override
    public String formatBookList(ArrayList<Book> formatBook) {
        return "bookList convert to JSON format :" + formatBook;
    }
}

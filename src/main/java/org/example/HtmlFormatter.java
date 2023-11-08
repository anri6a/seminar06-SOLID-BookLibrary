package org.example;

import java.util.ArrayList;

public class HtmlFormatter implements Formatter{
    @Override
    public String formatBookList(ArrayList<Book> formatBook) {
        return "bookList convert to HTML format :" + formatBook;
    }
}

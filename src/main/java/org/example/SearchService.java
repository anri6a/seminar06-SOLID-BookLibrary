package org.example;

import java.util.ArrayList;
import java.util.List;

public class SearchService implements Searchable {
    @Override
    public List<Book> searchByAuthor(String authorName, ArrayList<Book> bookList) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthorName().equals(authorName)) {
                searchResult.add(book);
            }
        }
        return searchResult;
    }
}

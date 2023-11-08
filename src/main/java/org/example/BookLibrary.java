package org.example;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@ToString
public class BookLibrary {
   private ArrayList<Book> bookList;
   private SearchService searchService;

    public BookLibrary(ArrayList<Book> bookList) {
        this.bookList = bookList;
        this.searchService = new SearchService();
    }

    public BookLibrary() {
        this.bookList = new ArrayList<>();
        this.searchService = new SearchService();
    }

    public BookLibrary(int listSize) {
        this.bookList = new ArrayList<>();
        this.searchService = new SearchService();
        for (int i = 1; i <= listSize; i++) {
            bookList.add(new Book("Pushkin" + i,
                                    "Onegin",
                                    1831,
                                    new BookGenre("Roman")));

        }
    }

    public  List<Book> searchByAuthor(String authorName) {
return searchService.searchByAuthor(authorName, bookList);
    }
}

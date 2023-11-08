package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor

public class BookGenre implements Genre {
    private String genreName;

    @Override
    public String getGenreName() {
        return genreName;
    }

    @Override
    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toString() {
        return   genreName ;
    }
}

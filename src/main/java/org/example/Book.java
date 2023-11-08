package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * единственная ответственность ->
 *         Single Responsibility Principle
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
   private String authorName;
   private String description;
   private int releaseDate;
   private BookGenre bookGenre;

}

package org.example;

import lombok.*;

/**
 * Принцип подстановки Барбары Лисков - >
 *         Liskov Substitution Principle
 */
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ElectronBook extends Book{
   private Double bookSize;
   private String bookFormat;

}

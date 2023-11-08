package org.example;

/**
 * открыт для расширения, но закрыт для изменения ->
 *         Open-Closed Principle
 */
public interface Genre {
    String getGenreName();
    void setGenreName(String genreName);
}

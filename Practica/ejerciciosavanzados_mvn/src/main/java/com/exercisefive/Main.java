/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisefive;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[3];

        authors[0] = new Author("Author1", "author1@author1.com", 'm');
        authors[1] = new Author("Atuhor2", "author2@author2.com", 'f');
        authors[2] = new Author("Author3", "author3@author3.com", 'm');

        Book firstBook = new Book("First Libro", authors, 200);
        Book secondBook = new Book("Second Libro", authors, 200, 5);

        System.out.println(firstBook);
        System.out.println(secondBook);
    }
}

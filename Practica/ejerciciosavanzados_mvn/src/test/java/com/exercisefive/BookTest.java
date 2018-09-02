/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisefive;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    private Author[] authors;

    @Before
    public void setup() {
        authors = new Author[2];

        authors[0] = new Author("authorOne", "authorOne@email.com",'m');
        authors[1] = new Author("authorTwo", "authorTwo@email.com",'f');

        book = new Book("bookName", authors, 200);
    }

    @Test
    public void shouldBuildaBook() {
        String expected = "Book[name=bookName,authors={" +
                "Author[name=authorOne,email=authorOne@email.com,gender=m]," +
                "Author[name=authorTwo,email=authorTwo@email.com,gender=f]},price=200.0,qty=0]";
        assertEquals(expected, book.toString());
    }

    @Test
    public void shouldBuildaBookWithQty() {
        String expected = "Book[name=bookName,authors={" +
                "Author[name=authorOne,email=authorOne@email.com,gender=m]," +
                "Author[name=authorTwo,email=authorTwo@email.com,gender=f]},price=200.0,qty=5]";

        book = new Book("bookName", authors, 200, 5);

        assertEquals(expected, book.toString());
    }

    @Test
    public void shouldReturnAuthorNames() {
        String expected = "authorOne,authorTwo";
        assertEquals(expected, book.getAuthorNames());
    }

    @Test
    public void shouldReturnBookName() {
        assertEquals("bookName", book.getName());
    }

    @Test
    public void shouldReturnBookPrice() {
        book.setPrice(250);
        assertEquals(250, book.getPrice(), 0);
    }

    @Test
    public void shouldReturnBookQty() {
        book.setQty(100);
        assertEquals(100, book.getQty());
    }

    @Test
    public void shouldReturnBookAuthors() {
        assertArrayEquals(authors, book.getAuthors());
    }

}

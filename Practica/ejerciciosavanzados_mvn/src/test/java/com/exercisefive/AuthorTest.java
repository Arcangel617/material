/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisefive;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    private Author author;

    @Before
    public void setup() {
        author = new Author("authorName", "authorName@email.com", 'm');
    }

    @Test
    public void shouldBuildAnAuthor() {
        String expected = "Author[name=authorName,email=authorName@email.com,gender=m]";
        assertEquals(expected, author.toString());
    }

    @Test
    public void shouldReturnAuthorName() {
        String expected = "authorName";
        assertEquals(expected, author.getName());
    }

}

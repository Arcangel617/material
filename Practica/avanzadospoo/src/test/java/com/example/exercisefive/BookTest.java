package com.example.exercisefive;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

  private Book book;
  private Author[] authors;

  @BeforeEach
  void setup() {
    authors = new Author[2];

    authors[0] = new Author("authorOne", "authorOne@email.com", 'm');
    authors[1] = new Author("authorTwo", "authorTwo@email.com", 'f');

    book = new Book("bookName", authors, 200);
  }

  @Test
  void shouldBuildaBook() {
    String expected = "Book[name=bookName,authors={" +
        "Author[name=authorOne,email=authorOne@email.com,gender=m]," +
        "Author[name=authorTwo,email=authorTwo@email.com,gender=f]},price=200.0,qty=0]";
    assertEquals(expected, book.toString());
  }

  @Test
  void shouldBuildaBookWithQty() {
    String expected = "Book[name=bookName,authors={" +
        "Author[name=authorOne,email=authorOne@email.com,gender=m]," +
        "Author[name=authorTwo,email=authorTwo@email.com,gender=f]},price=200.0,qty=5]";

    book = new Book("bookName", authors, 200, 5);

    assertEquals(expected, book.toString());
  }

  @Test
  void shouldReturnAuthorNames() {
    String expected = "authorOne,authorTwo";
    assertEquals(expected, book.getAuthorNames());
  }

  @Test
  void shouldReturnBookName() {
    assertEquals("bookName", book.getName());
  }

  @Test
  void shouldReturnBookPrice() {
    book.setPrice(250);
    assertEquals(250, book.getPrice(), 0);
  }

  @Test
  void shouldReturnBookQty() {
    book.setQty(100);
    assertEquals(100, book.getQty());
  }

  @Test
  void shouldReturnBookAuthors() {
    assertArrayEquals(authors, book.getAuthors());
  }

}

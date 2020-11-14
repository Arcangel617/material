package com.example.exercisefive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorTest {

  private Author author;

  @BeforeEach
  void setup() {
    author = new Author("authorName", "authorName@email.com", 'm');
  }

  @Test
  void shouldBuildAnAuthor() {
    String expected = "Author[name=authorName,email=authorName@email.com,gender=m]";
    assertEquals(expected, author.toString());
  }

  @Test
  void shouldReturnAuthorName() {
    String expected = "authorName";
    assertEquals(expected, author.getName());
  }

}

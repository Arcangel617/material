package com.example.exercisefive;

public class Book {

  private String name;
  private Author[] authors;
  private double price;
  private int qty = 0;

  public Book(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
  }

  public Book(String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author[] getAuthors() {
    return authors;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < authors.length; i++) {
      if (i == authors.length - 1) {
        stringBuilder.append(authors[i]);
      } else {
        stringBuilder.append(authors[i]).append(",");
      }
    }

    return "Book[name=" + name + ",authors={" + stringBuilder.toString() + "},price=" + price
        + ",qty=" + qty + "]";
  }

  public String getAuthorNames() {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < authors.length; i++) {
      if (i == authors.length - 1) {
        stringBuilder.append(authors[i].getName());
      } else {
        stringBuilder.append(authors[i].getName()).append(",");
      }
    }

    return stringBuilder.toString();
  }
}

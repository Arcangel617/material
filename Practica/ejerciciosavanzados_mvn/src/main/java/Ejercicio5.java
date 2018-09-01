/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

class Book {
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

        for (int i = 0; i < authors.length ; i++ ) {
            if (i == authors.length - 1) {
                stringBuilder.append(authors[i]);
            } else {
                stringBuilder.append(authors[i]).append(",");
            }
        }

        return "Book[name=" + name + ",authors={" + stringBuilder.toString() + "},price=" + price + ",qty=" + qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < authors.length ; i++ ) {
            if (i == authors.length - 1) {
                stringBuilder.append(authors[i].getName());
            } else {
                stringBuilder.append(authors[i].getName()).append(",");
            }
        }

        return stringBuilder.toString();
    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

class Ejercicio5 {
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
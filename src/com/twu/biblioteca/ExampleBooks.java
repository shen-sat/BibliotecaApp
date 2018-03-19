package com.twu.biblioteca;

public class ExampleBooks {
    public Book[] books ()  {
        Book book1 = new Book();
        book1.setTitle("Book 1");
        book1.setAuthor("Mr A");
        book1.setYear(1990);
        Book book2 = new Book();
        book2.setTitle("Book 2");
        book2.setAuthor("Mr B");
        book2.setYear(1991);
        Book book3 = new Book();
        book3.setTitle("Book 3");
        book3.setAuthor("Mr C");
        book3.setYear(1992);
        Book books[] = {book1, book2, book3};
        return books;
    }
}

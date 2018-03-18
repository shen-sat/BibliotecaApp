package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library = new Library();
    Book books[] = getExampleBooks();

    @Test
    public void setAndGetBooks() {
        library.setBooks(books);
        assertEquals(books, library.getBooks());
    }

    @Test
    public void displayAllBooks() {
        library.setBooks(books);
        String libraryList =(   "Title: Book 1, Author: Mr A, Year: 1990\n" +
                                "Title: Book 2, Author: Mr B, Year: 1991\n" +
                                "Title: Book 3, Author: Mr C, Year: 1992\n"
        );
        assertEquals(libraryList, library.displayAllBooks());
    }

    @Test
    public void displayOnlyBooksNotOnLoan() {
        library.setBooks(books);
        String libraryList =(   "Title: Book 1, Author: Mr A, Year: 1990\n" +
                                "Title: Book 2, Author: Mr B, Year: 1991\n"
        );
        assertEquals(libraryList, library.displayBooksOnShelf());
    }


    private Book[] getExampleBooks() {
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
        book3.setOnLoan(true);
        Book books[] = {book1, book2, book3};
        return books;
    }


}
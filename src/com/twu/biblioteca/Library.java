package com.twu.biblioteca;

public class Library {
    private Book books[];

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public String displayBooksOnShelf() {
        String bookList = new String();
        for (Book book : books) {
            if (book.getOnLoan() != true)   {
                bookList +=
                    ("Title: " + book.getTitle() + ", " +
                            "Author: " + book.getAuthor() + ", " +
                            "Year: " + book.getYear() + "\n"
                    );
            }

        }
        return bookList;

    }

    public String displayAllBooks() {
        String bookList = new String();
        for (Book book : books) {
            bookList +=
                    ("Title: " + book.getTitle() + ", " +
                            "Author: " + book.getAuthor() + ", " +
                            "Year: " + book.getYear() + "\n"
                    );
        }
        return bookList;
    }
}

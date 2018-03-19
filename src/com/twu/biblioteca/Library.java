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
                (   "Title: " + book.getTitle() + ", " +
                    "Author: " + book.getAuthor() + ", " +
                    "Year: " + book.getYear() + "\n"
                );
        }
        return bookList;
    }

    public String checkOut(String title) {
        String returnString = new String();
        boolean found = false;
        for (Book book: books ) {
            if (book.getTitle() == title && book.getOnLoan() == true) {
                returnString = "That book is not available.";
                found = true;
            } else if (book.getTitle() == title) {
                book.setOnLoan(true);
                found = true;
                returnString = "Thank you! Enjoy the book.";
            }
        }
        if (found == false) {
            returnString = "That book is not available.";
        }
        return returnString;
    }


}

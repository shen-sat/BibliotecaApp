package com.twu.biblioteca;

public class Book {
    String title;
    private String author;
    private int year;
    private boolean onLoan;


    public void setTitle(String title)  {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public boolean getOnLoan() {
        return onLoan;
    }
}

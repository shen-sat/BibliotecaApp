package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book book = new Book();

    @Test
    public void setAndGetTitle() {
        book.setTitle("Fight Club");
        assertEquals("Fight Club", book.getTitle());
    }

    @Test
    public void setAndGetAuthor() {
        book.setAuthor("Chuck Palahniuk");
        assertEquals("Chuck Palahniuk", book.getAuthor());
    }

    @Test
    public void setAndGetYear() {
        book.setYear(1996);
        assertEquals(1996, book.getYear());
    }

    public void setAndGetOnLoan() {
        book.setOnLoan(false);
        assertEquals(false, book.getOnLoan());
    }

}
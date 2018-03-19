package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    Library library = new Library();
    ExampleBooks exampleBooks = new ExampleBooks();
    Menu menu = new Menu(library);
    String options = new String("* Press 1 to see a list of all books\n* Press 2 to quit");
    String incorrect = new String("Select a valid option!");
    String welcome = new String("- - - - Welcome to Biblioteca! - - - -\n");

    @Test
    public void displayOptions() {

        assertEquals(options, menu.displayOptions());
    }

    @Test
    public void incorrectInput() {
        assertEquals(incorrect, menu.getUserInput(2));
    }

    @Test
    public void correctInput() {
        library.setBooks(exampleBooks.books());
        assertEquals(library.displayBooksOnShelf() + "\n", menu.getUserInput(1));
    }

    @Test
    public void welcome() {
        assertEquals(welcome, menu.displayWelcome());
    }



}
package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {
    Menu menu = new Menu();
    String options = new String("Press 1 to see a list of all books\n");
    String incorrect = new String("Select a valid option!\n");
    String welcome = new String("Welcome to Biblioteca!\n");

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
        assertEquals(options, menu.getUserInput(1));
    }

    @Test
    public void welcome() {
        assertEquals(welcome, menu.displayWelcome());
    }

}
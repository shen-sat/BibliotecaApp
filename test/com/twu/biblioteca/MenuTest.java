package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {
    Menu menu = new Menu();
    String options = new String("Press 1 to see a list of all books\n");
    String incorrect = new String("Select a valid option!");

    @Test
    public void displayOptions() {
        assertEquals(options, menu.displayOptions());
    }

    @Test
    public void incorrectInput() {
        menu.getUserInput(2);
        assertEquals(incorrect, menu.getTextToConsole());
    }


    @Test
    public void quitApp() {
        menu.getUserInput(2);
        assertEquals(incorrect, menu.getTextToConsole());
    }
}
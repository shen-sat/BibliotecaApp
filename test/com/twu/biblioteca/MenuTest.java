package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {
    Menu menu = new Menu();
    String options = new String("Press 1 to see a list of all books\n");

    @Test
    public void displayOptions() {
        assertEquals(options, menu.displayOptions());
    }

    @Test
    public void displayOptions() {
        assertEquals(options, menu.displayOptions());
    }

}
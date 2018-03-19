package com.twu.biblioteca;

public class Menu {

    private String welcome = new String ("Welcome to Biblioteca!\n");
    private String options = new String ("Press 1 to see a list of all books\n");
    private String incorrect = new String("Select a valid option!\n");
    private String textToConsole = new String();

    public String displayOptions() {
        return options;
    }

    public String displayIncorrect()    {
        return incorrect;
    }

    public String getUserInput(int input) {
        if (input != 1) {
            return incorrect;
        } else  {
            return options;
        }
    }

    public String displayWelcome() {
        return welcome;
    }
}

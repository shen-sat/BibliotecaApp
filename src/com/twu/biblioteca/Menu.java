package com.twu.biblioteca;

public class Menu {
    private String options = new String ("Press 1 to see a list of all books\n");
    private String incorrect = new String("Select a valid option!");
    private String textToConsole = new String();

    public String displayOptions() {
        textToConsole = options;
        return textToConsole;
    }

    public String displayIncorrect()    {
        textToConsole = incorrect;
        return textToConsole;
    }

    public String getTextToConsole ()   {
        return textToConsole;
    }

    public void getUserInput(int input) {
        if (input != 1) {
            this.displayIncorrect();
        }
    }



}

package com.twu.biblioteca;
import java.util.Scanner;

public class Main {
        Library library = new Library();
        Menu menu = new Menu(library);
        ExampleBooks exampleBooks = new ExampleBooks();


        public void runApp()    {
            //Give library example books
            library.setBooks(exampleBooks.books());

            System.out.println(menu.displayWelcome());
            System.out.println(menu.displayOptions());

            Integer input = new Integer(0);
            while (true) {
                Scanner scanner = new Scanner(System.in);
                try {
                    input = (Integer.parseInt(scanner.nextLine()));
                    if (input == 2)   {
                        System.exit(0);
                    } else  {
                        String answer = menu.getUserInput(input);
                        System.out.println(answer);
                    }

                }
                catch(NumberFormatException nfe)   {
                    System.out.println("Select a valid option!");
                }
                System.out.println(menu.displayOptions());
            }
        }





}

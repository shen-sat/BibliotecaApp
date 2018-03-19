package com.twu.biblioteca;
import java.util.Scanner;

public class Main {

        Menu menu = new Menu();
        Library library = new Library();
        ExampleBooks exampleBooks = new ExampleBooks();


        public void runApp()    {
            //Give library example books
            library.setBooks(exampleBooks.books());
            //System.out.println("App Running");

            System.out.println(menu.displayWelcome());
            System.out.println(menu.displayOptions());
            Scanner scanner = Scanner.new(System.in);
        }





}

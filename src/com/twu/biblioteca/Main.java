package com.twu.biblioteca;

public class Main {


    public static void main(String[] args)  {
        Menu menu = new Menu();
        Library library = new Library();
        ExampleBooks exampleBooks = new ExampleBooks();
        //Give library example books
        library.setBooks(exampleBooks.books());

        
    }


}

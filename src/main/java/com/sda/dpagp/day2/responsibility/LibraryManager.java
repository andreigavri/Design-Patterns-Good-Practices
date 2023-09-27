package com.sda.dpagp.day2.responsibility;

public class LibraryManager {

    private Book[] books = new Book[]{}; // homework, replace with List


    public LibraryManager() {
        books = new Book[3];
        books[0] = new Book("M. Eminescu", "Volum", 2020, "Poezii", "RO");
        books[1] = new Book("Ion Creanga", "Roman", 1990, "Amintiri din copilarie", "RO");
        books[2] = new Book("G. Cosbuc", "Volum", 1998, "Poezii", "RO");
    }

    // 0- M.Eminescu - Poezii
    // 1- Ion Creanga - Amintri...
    // 2- G. Cosbuc - Poezii

    public Book findBookByTitle(String titleToSearch) {
        for(int i=0; i<books.length; i++) {
            Book currentBook = books[i];

            if(currentBook.getTitle().equals(titleToSearch)) {
                // we found the desired book?!?
                return currentBook;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        // do some logic and then return the book
        // for now just return null so that it compiles
        return null ;

        // TODO: homework
    }

    public Book findBookByAuthorAndTitle(String author, String title) {
        return null;
        // TODO: homework
    }

}

package com.sda.dpagp.day2.responsibility;

import com.sda.dpagp.day2.singleton.Counter;

/*
This class is responsible for representing (modeling) a book.
 */
public class Book {
    String author;
    String type;
    int year;
    String title;
    String language;

    public Book(String author, String type, int year, String title, String language) { //constructorul book modeleaza cartea din realitate
        this.author = author;
        this.type = type; // responsibility of representing a book
        this.year = year;
        this.title = title;
        this.language = language;
    }

    public String findPageContent() {
        return "Page";
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
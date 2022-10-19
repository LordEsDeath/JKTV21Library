/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Book {
    private String title;
    private Author[] authors = new Author[0]; 

    public Book() {
    }

    public Book(String title, Author[] author) {
        this.title = title;
        this.authors = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthor(Author[] author) {
        this.authors = author;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + Arrays.toString(authors) + '}';
    }

    public void addAuthor(Author author) {
    Author[] newAuthors = Arrays.copyOf(authors, authors.length+1);
    newAuthors[newAuthors.length-1]=author;
    this.authors = newAuthors;
    }

   
    
}

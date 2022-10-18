/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21library;

import entity.Author;
import entity.Book;
import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;


public class App {
    private Scanner scanner = new Scanner(System.in);
    private Book[] books;
    private Reader[] readers;
    
    public App(){
        books = new Book[0];
        readers = new Reader[0];
        testAddBook();
        testAddReader();
    }
    public void run(){
        
        boolean repeat = true;
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Список книг");
            System.out.println("6. Список читателей");
            System.out.print("Выберите номер функции: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("0. Закрыть приложение");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    Book book = new Book();
                    System.out.print("Введите название книги: ");
                    book.setTitle(scanner.nextLine());
                    System.out.print("Укажите количество авторов: ");
                    int countAuthorsInBook = scanner.nextInt();
                    scanner.nextLine();
                    for (int i =0; i< countAuthorsInBook; i++){
                        book.addAuthor(createAuthor());
                    }
                    Book[] newBook= Arrays.copyOf(this.books, this.books.length+1);
                    newBook[newBook.length-1]= book;
                    books = newBook;
                    break;
                case 2:
                    System.out.println("2. Добавить читателя");
                    Reader reader = new Reader();
                    break; 
                case 3:          
                    System.out.println("3. Выдать книгу");
                    addHistories(histotyManager.takeOnBook());
                    break; 
                case 4:
                    System.out.println("4. Вернуть книгу");
                    break; 
                case 5:
                    System.out.println("5. Список книг");
                    for (int i = 0; i < books.length; i++) {
                        Book book1=books[i];
                        System.out.printf(i+1+". " +book1.getTitle());
                        for(int j =0;j<book1.getAuthor().length; j++){
                            System.out.printf("%s %s. %n",
                                    book1.getAuthor()[j].getFirstname(),
                                    book1.getAuthor()[j].getLastname()
                                    );
                        }
                    }
                    break;
                case 6:
                    System.out.println("6. Список читателей");
                    for (int i = 0; i < readers.length; i++) {
                        reader = readers[i];
                        System.out.printf("%d. %s %s%n Телефон: %s%n" 
                                ,i+1
                                ,readers[i].getFirstname()
                                ,readers[i].getLastname()
                                ,readers[i].getPhone()
                        );
                    }
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }

    private Author createAuthor() {
        Author author = new Author();
        System.out.println("Введите имя: ");
        author.setFirstname(scanner.nextLine());
        System.out.println("Введите фамилию: ");
        author.setLastname(scanner.nextLine());
        
        return author;
    }
    private void testAddBook(){
        Book book = new Book();
        book.setTitle("Voina i mir");
        Author author = new Author("Lev", "Tolstoy");
        book.addAuthor(author);
        this.books = Arrays.copyOf(books, books.length + 1);
        this.books[this.books.length - 1] = book;
        
    }
    private void testAddReader(){
        Book book = new Book();
        Reader reader = new Reader("Konstantin", "Kolpakov","51247522");
        
        readers = Arrays.copyOf(readers, readers.length + 1);
        readers[readers.length - 1] = reader;
        
    }
}
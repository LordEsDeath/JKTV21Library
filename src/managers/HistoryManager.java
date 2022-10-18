/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryManager {
    private ReaderManager readerManager;
    private Scanner scanner;
    private BookManager bookManager;
    
    public HistoryManager(){
        scanner = new Scanner(System.in);
        readerManager = new ReaderManager();
    }
    
    public History takeOnBook(Reader[] reader, Book[] books){
        System.out.println("Список читателей: ");
        readerManager.printListReaders(readers);
        System.out.print("Выберите номер читател из списка: ");
        int numberReader = scanner.nextInt(); scanner.nextLine();
        
    }
}

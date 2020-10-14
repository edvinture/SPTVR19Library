/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.managers;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BookManager {
    public Book createBook () {
        Book book = new Book ();
        Scanner scanner = new Scanner (System.in);
        System.out.println("---создание книги---");
        System.out.println("название книги:");
        book.setName(scanner.nextLine());
        System.out.println("автор книги:");
        book.setAuthor(scanner.nextLine());
        System.out.println("год издания книги");
        book.netPublishedYear(scanner.nextInt());
        return book;
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19library;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run () {
        System.out.println("---Библиотека---");
        boolean repeat = true;
        do {
            System.out.println("список задач:");
            System.out.println("0. выйти из программы");
            System.out.println("1. добавить новую книгу");
            System.out.println("2. посмотреть список книг");
            System.out.println("3. зарегистировать нового читателя");
            System.out.println("4. выдать книгу читателю");
            System.out.println("5. вернуть книгу в библиотеку");
            System.out.print("выберите задачу:");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("конец программы");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("добавить новую книгу");
                    // создадим обьект книги
                    Book book  = new Book();
                    break;
                case "2":
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("");
                    break;
                case "5":
                    System.out.println("");
                    break;
                default:
                    System.out.println("нет такой задачи");

                 }
            }while(repeat);


        }

    }

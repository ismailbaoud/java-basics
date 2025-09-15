package com.example.java.booksmanagement;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int choice;
        Book book = new Book();
        do{
        System.out.println("please seelect your choice : ");
        System.out.println("1 => Consult all books");
        System.out.println("2 => Add book");
        System.out.println("3 => Delete book ");
        System.out.println("4 => Update book ");
        System.out.println("5 => Consult details of book");
        System.out.println("6 => Exit");
        choice = scanner.nextInt();
        switch(choice){
            case 1: 
                System.out.println("please select your choice : " + choice);
            break;
            case 2: 
                System.out.println("please entre the title : ");
                String title = scanner.next();
                System.out.println("please entre the price : ");
                String price = scanner.next();
                book.AddBook(title, price);
            break;
            case 3: 
                    String jokeLine = books.get();
                    String[] parts = jokeLine.split(":", 2);
                    String type = parts.length > 1 ? parts[0] : "Unknown";
                    String joke = parts.length > 1 ? parts[1] : jokeLine;
                    System.out.println("🔮 [" + type + "] " + joke);            break;
            case 4: 
                System.out.println("please select your choice : " + choice);
            break;
            case 5: 
                System.out.println("please select your choice : " + choice);
            break;
            case 6: 
                System.out.println("bye ...");
            break;
            default: 
                System.out.println("please try again and select existing choice ...");
            break;
        }

        }while(choice != 6);

        

    }
}
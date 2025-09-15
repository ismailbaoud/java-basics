package com.example.java.auth;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("Welcome to the Authentication System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            Login login = new Login();
            Register register = new Register();
            String email, password, username;
            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter email: ");
                    email = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    register.Register(username, email, password);
                    break;
                case 2:
                    System.out.print("Enter email: ");
                    email = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    login.Login(email, password);
                    break;
                default:
                    System.out.println("Exiting the Authentication System. Goodbye!");
                return; 
            }
            
        }while( choice != 3);
    }
}
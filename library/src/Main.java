import controller.BookController;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("welcome to the library management program :");
            System.out.println("1 => Add new book ");
            System.out.println("1 => Delete book by name ");
            System.out.println("6 => exit ");
            System.out.println("enter your choice : ");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("please enter the title : ");
                    String title = scanner.next();
                    System.out.println("please enter the price : ");
                    double price = scanner.nextDouble();
                    System.out.println("please enter the quantity : ");
                    int quantity = scanner.nextInt();
                    bookController.add(title, price, quantity);
                break;
                case 2 :
                    System.out.println("Enter the book name : ");
                    String Ntitle = scanner.next();
                    bookController.delete(Ntitle);
            }
        }while(choice != 6);
    }
}
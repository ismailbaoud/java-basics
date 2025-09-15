package controller;

import model.Book;

import java.util.ArrayList;

public class BookController {
    public ArrayList<Book> books = new ArrayList<Book>();
    public static void main(String[] args) {

    }

    public void add(String title , double price , int quantity) {
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        book.setCuantity(quantity);

        books.add(book);
        for (Book b : books) {
            System.out.println("title : "+ b.getTitle() + " , price : " + b.getPrice() + " , cuantity : " + b.getCuantity());
        }
    }

    public void delete(String title) {
        
    }
}

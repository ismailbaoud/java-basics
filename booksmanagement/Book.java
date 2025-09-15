package com.example.java.booksmanagement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Book{
    private static final String fileName = "com/example/java/booksmanagement/books.txt";

    public List<String> ShowTasks(){
        List<String> books = new ArrayList();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    books.add(line.trim());
                }
            }
        } catch(IOException e){
            System.out.println("hello");
        }

    }
    public void AddBook(String title, String price){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write("Title : " + title + " , Price : "+ price);
            writer.newLine();
        }catch(IOException e){
            System.out.println("hello");

        }
    }
}
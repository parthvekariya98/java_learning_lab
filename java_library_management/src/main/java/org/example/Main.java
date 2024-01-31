package org.example;

import java.util.ArrayList;
import java.util.Scanner;



class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Title : " + title + ", Author: " + author;
    }
}
class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook (Book book){
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()){
            System.out.println(" Library list is empty!");
        } else {
            System.out.println("Books in Library are:");
            for (Book book: books){
                System.out.println(book);
            }
        }
    }

}


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library System Menu:");
            System.out.println("1. Add New Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");

            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter Book Name:");
                    String title = scanner.nextLine();
                    System.out.println("Enter Author Name:");
                    String author = scanner.nextLine();

                    Book newBook = new Book(title, author);
                    library.addBook(newBook);
                    System.out.println("New Book Added.");
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting..");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
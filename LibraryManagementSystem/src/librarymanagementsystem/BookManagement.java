package librarymanagementsystem;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;

public class BookManagement {

    private Book[] books;
    private int count;
    private File file;

    String filepath = "F:\\github\\CSE215-Java\\LibraryManagementSystem\\src\\librarymanagem\\library.txt";

    public BookManagement() {
        books = new Book[50];
        this.count = 0;
        file = new File(filepath);
    }

    public void addBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type: ");
        String type = input.nextLine();
        System.out.print("Input Book id: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Input Book Title: ");
        String name = input.nextLine();
        System.out.print("Input Book Author: ");
        String author = input.nextLine();
        System.out.print("Input Book year: ");
        int year = input.nextInt();
        Book b = null;
        switch (type) {
            case "PrintedBook": {
                System.out.println("Input page count: ");
                int pages = input.nextInt();
                b = new PrintedBook(pages, id, name, author, year);
                break;
            }
            case "Ebook": {
                System.out.println("Input File Size: ");
                int size = input.nextInt();
                b = new Ebook(size, id, name, author, year);
                break;
            }
        }

        if (count < books.length) {
            books[count] = b;
            count++;
        }

    }

    public void deleteBook(int id) throws BookNotFoundException {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];

                }
                books[count - 1] = null;
                count--;
            }
        }
        if (!found) {
            throw new BookNotFoundException("Book not found");
        }

    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    public void saveToFile() {
        Book b;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; i < count; i++) {
                if (books[i].getType().equals("PrintedBook")) {
                    PrintedBook p = (PrintedBook) books[i];

                    writer.write(books[i].getType() + "," + books[i].getId() + "," + books[i].getTitle() + "," + books[i].getAuthor() + "," + books[i].getYear() + "," + p.getPages());
                } else {
                    Ebook e = (Ebook) books[i];
                    writer.write(books[i].getType() + "," + books[i].getId() + "," + books[i].getTitle() + "," + books[i].getAuthor() + "," + books[i].getYear() + "," + e.getFileSizeMB());
                }
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error: ");
        }
    }

    public void loadFromFile() {
        String line;
        Book b;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                String[] part = line.split("\\,");

                String type = part[0].trim();
                String name = part[3].trim();
                int id = Integer.parseInt(part[1].trim());
                int year = Integer.parseInt(part[4].trim());
                String title = part[2].trim();

                if (type.equalsIgnoreCase("PrintedBook")) {
                    int page = Integer.parseInt(part[5].trim());
                    b = new PrintedBook(page, id, title, name, year);
                } else {
                    int size = Integer.parseInt(part[5].trim());
                    b = new Ebook(size, id, title, name, year);
                }
                books[count] = b;
                count++;
            }
        } catch (Exception e) {
            System.out.println("Error: ");
        }
    }

}

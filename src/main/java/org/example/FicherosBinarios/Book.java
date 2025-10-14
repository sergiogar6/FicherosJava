package org.example.FicherosBinarios;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Book implements Serializable {

    private String author;
    private String name;
    private String editorial;
    private String date;

    static final Path path = Path.of("BookFile.dat");
    static List<Book> bookList;
    static Scanner sc = new Scanner(System.in);

    public Book(String author, String name, String editorial, String date) {
        this.author = author;
        this.name = name;
        this.editorial = editorial;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", editorial='" + editorial + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    //ESCRIBIR EL OBJECTO A UN ARCHIVO BINARIO
    public static void serialize() {
        try {

            ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path));

            for (Book b : bookList) {
                oos.writeObject(b);
            }

            //objeto null como indicador de final
            oos.writeObject(null);


        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

    //CONVERTIR UN ARCHIVO BINARIO A UN OBJETO
    public static void deserialize() {
        try {

            ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
            Book book;


            while ((book = (Book) ois.readObject()) != null) {
                System.out.println("Read: " + book);
            }


        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

    public static void addBook() {
        System.out.println("Escribe el autor del libro: ");
        String author = sc.next();
        System.out.println("Escribe el nombre del libro: ");
        String name = sc.next();
        System.out.println("Escribe la editorial del libro: ");
        String editorial = sc.next();
        System.out.println("Escribe la fecha de publicacion del libro del libro: ");
        String date = sc.next();

        Book book = new Book(author, name, editorial, date);
        bookList.add(book);
        serialize();
    }






}

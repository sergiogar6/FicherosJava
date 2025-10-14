package org.example.FicherosBinarios;

import java.util.Arrays;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("213","dsada","dsada", "qwewqe"),
                new Book("2113","dsedada","dsaddddda", "wqdsadas"),
                new Book("21311","dsadddda","dsaddddddda", "dsasdsadas")

        );

        Book.bookList.addAll(books);

        Book.serialize();

        Book.deserialize();


    }
}

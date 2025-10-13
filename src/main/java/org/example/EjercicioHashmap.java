package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioHashmap {
    static HashMap<Integer, String> catalogo = new HashMap<>();
    static Scanner entry = new Scanner(System.in);


    public static void main(String[] args) {

        String opcion;

        do {
            opcion = menu();
            opciones(opcion);
            System.out.println();
        } while (!opcion.equals("X"));
    }

    public static void añadirLibro() {

        System.out.println("Introduce el ISBN del libro que quieres añadir al catálogo: ");
        Integer isbn = entry.nextInt();
        entry.nextLine();

        System.out.println("Introduce el nombre del libro que quieres añadir al catálogo: ");
        String nombre = entry.nextLine();

        if (catalogo.containsKey(isbn)) {
            System.out.println("ERROR. Ya existe un libro con el mismo ISBN en el catálogo");

        } else {
            catalogo.put(isbn, nombre);
            System.out.println("-LIBRO AÑADIDO-");
        }

    }

    public static void eliminarLibro() {

        System.out.print("Introduce el ISBN del libro a eliminar: ");
        Integer isbn = entry.nextInt();
        entry.nextLine();

        if (catalogo.containsKey(isbn)) {
            System.out.println("Libro " + catalogo.get(isbn) + " eliminado");
            catalogo.remove(isbn);
        } else {
            System.out.println("Libro no encontrado");
        }

    }

    public static void consultarLibro() {
        System.out.print("Introduce el ISBN del libro a buscar: ");
        Integer isbn = entry.nextInt();
        entry.nextLine();

        if (catalogo.containsKey(isbn)) {
            System.out.println("El libro * " + catalogo.get(isbn) + " * esta disponible");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    public static void mostrarCatalogo() {
        for (Integer clave : catalogo.keySet()) {
            System.out.println(clave + " - " + catalogo.get(clave));
        }
    }

    public static String menu() {
        System.out.println("1. Añadir nuevo libro.");
        System.out.println("2. Eliminar un libro existente.");
        System.out.println("3. Consultar si un libro está disponible dado un ISBN.");
        System.out.println("4. Mostrar la lista completa de libros.");
        System.out.println("X. Salir.");
        System.out.println("----------------------------------");
        System.out.print("Elige una opcion: ");

        return entry.nextLine().toLowerCase();
    }

    public static void opciones(String opcion) {
        switch (opcion) {
            case "1": añadirLibro();
                break;
            case "2": eliminarLibro();
                break;
            case "3": consultarLibro();
                break;
            case "4": mostrarCatalogo();
                break;
            case "X":
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }


}

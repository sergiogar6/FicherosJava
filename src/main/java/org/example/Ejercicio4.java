package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {
    static List<String> listaCadenas = new LinkedList<>();

    public static void main(String[] args) {
        listaCadenas.addAll(List.of("Sergio","Adrian","Nacho","Pepe","Luis"));
        System.out.println(listaCadenas);
        listaCadenas.add(4, "Maria");
        listaCadenas.remove(0);
        listaCadenas.remove("Nacho");
        System.out.println(listaCadenas.size());
        System.out.println(listaCadenas.isEmpty());
        listaCadenas.clear();
    }
}

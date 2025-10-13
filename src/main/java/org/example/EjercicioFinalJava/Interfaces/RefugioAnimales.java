package org.example.EjercicioFinalJava.Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class RefugioAnimales {
    public static void main(String[] args) {
        ArrayList<Animal> refugio = new ArrayList<>();

        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Ave ave1 = new Ave();

        refugio.add(perro1);
        refugio.add(gato1);
        refugio.add(ave1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de animal a registrar (perro/gato/ave): ");
        String tipo = sc.nextLine().toLowerCase();

        Animal animalUsuario = null;

        switch (tipo) {
            case "perro":
                animalUsuario = new Perro();
                break;
            case "gato":
                animalUsuario = new Gato();
                break;
            case "ave":
                animalUsuario = new Ave();
                break;
            default:
                System.out.println("Tipo de animal no válido.");
        }

        if (animalUsuario != null) {
            refugio.add(animalUsuario);
        }

        sc.close();

        // polimorfismo para recorrer la lista
        System.out.println("\n--- Animales en el refugio ---");
        for (Animal a : refugio) {
            a.comer();
            a.dormir();
            a.moverse();
            System.out.println(a.emitirSonido());

            // comprobar si el animal es una Mascota
            if (a instanceof Mascota) {
                ((Mascota) a).jugar();
            }
            System.out.println("----------------------------");
        }


    }
}

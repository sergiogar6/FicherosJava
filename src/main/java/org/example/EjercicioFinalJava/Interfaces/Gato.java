package org.example.EjercicioFinalJava.Interfaces;

public class Gato implements Animal, Mascota{
    private String color;



    public void mostrarColor() {
        System.out.println("El gato es de color " + this.color);
    }

    @Override
    public void comer() {
        System.out.println("El gato come pescado");
    }

    @Override
    public void dormir() {
        System.out.println("El gato duerme");
    }

    @Override
    public void moverse() {
        System.out.println("El gato anda");
    }

    @Override
    public String emitirSonido() {
        return "miau";
    }

    @Override
    public void jugar() {
        System.out.println("El gato persigue el laser");
    }
}

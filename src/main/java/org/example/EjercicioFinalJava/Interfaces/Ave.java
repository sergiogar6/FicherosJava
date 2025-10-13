package org.example.EjercicioFinalJava.Interfaces;

public class Ave implements Animal {
    private int tamano;

    public void mostrarTamano() {
        System.out.println("El ave mide " + this.tamano + " centimetros");
    }
    @Override
    public void comer() {
        System.out.println("El ave come alpiste");
    }

    @Override
    public void dormir() {
        System.out.println("El ave duerme");
    }

    @Override
    public void moverse() {
        System.out.println("El pajaro vuela");
    }

    @Override
    public String emitirSonido() {
        return "pio pio";
    }
}

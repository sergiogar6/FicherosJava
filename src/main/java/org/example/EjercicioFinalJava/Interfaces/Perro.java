package org.example.EjercicioFinalJava.Interfaces;

public class Perro implements Animal, Mascota {
    private boolean estaEntrenado;

    public void entrenarPerro() {
        this.estaEntrenado = true;
    }

    @Override
    public void comer() {
        System.out.println("El perro come pienso");
    }

    @Override
    public void dormir() {
        System.out.println("El perro duerme");
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre");
    }

    @Override
    public String emitirSonido() {
        return "wof";
    }

    @Override
    public void jugar() {
        System.out.println("El perro juega con la pelota");
    }
}

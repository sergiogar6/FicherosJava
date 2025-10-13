package org.example.EjercicioFinalJava.Abstracto1;

public class Subclase extends Abstracto {
    @Override
    public void abstract_method() {
        System.out.println("Este es un método abstracto implementado en una clase no abstracta");

    }

    public static void main(String[] args) {
        Subclase subclase1 = new Subclase();
        subclase1.abstract_method();
    }

}

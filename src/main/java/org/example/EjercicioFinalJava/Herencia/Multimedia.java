package org.example.EjercicioFinalJava.Herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Multimedia {

    private String titulo;
    private String autor;
    private String formato;
    private int duracion;
    private static ArrayList<String> listaFormatos = new ArrayList<>(List.of("wav", "mp3", "midi", "avi", "mov", "mpg", "cd", "dvd"));

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        setFormato(formato);
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }


    public String getFormato() {
        return formato;
    }


    public int getDuracion() {
        return duracion;
    }

    public void setFormato(String formato) {
        if (listaFormatos.contains(formato)) {
            this.formato = formato;
        } else {
            System.out.println("Extension de archivo no válida");
        }

    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}

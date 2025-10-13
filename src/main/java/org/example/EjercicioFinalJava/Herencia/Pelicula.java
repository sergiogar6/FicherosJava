package org.example.EjercicioFinalJava.Herencia;

public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        comprobarNull(actorPrincipal, actrizPrincipal);
    }

    public void comprobarNull(String actor, String actriz) {
        if (actor == null && actriz == null) {
            System.out.println("Ambos actores no pueden ser NULL");
        } else {
            this.actorPrincipal = actor;
            this.actrizPrincipal = actriz;
        }
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                '}';
    }
}

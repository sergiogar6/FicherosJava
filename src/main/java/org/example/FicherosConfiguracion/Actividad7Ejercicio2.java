package org.example.FicherosConfiguracion;

import java.io.*;
import java.util.Properties;

public class Actividad7Ejercicio2 {

    static FileInputStream fis = null;
    static Properties prop = new Properties();

    public static void main(String[] args) throws IOException {

        //indicamos nombre del archivo y llamamos al metodo que carga el archivo
        final String nombreFichero = "application.properties";
        cargarFichero(nombreFichero);
    }

    public static void cargarFichero(String nombre) throws IOException {

        //creamos la instancia del archivo con la ruta (en este caso es en la misma carpeta)
        File archivo = new File(nombre);
        Properties prop = new Properties();

        //si el archivo no existe, lo crea con las propiedades default
        if (!archivo.exists()) {
            prop.setProperty("server.max-file-size", "10000");
            prop.setProperty("server.max-requests", "10");
            prop.setProperty("server.launcher", "false");
            prop.setProperty("server.buffer.size", "1024");

            //despues de poner las propiedades las guarda en el archivo
            try (FileOutputStream out = new FileOutputStream(archivo)) {
                prop.store(out, "Archivo properties creado");
            }

        }

        try {
            fis = new FileInputStream(nombre);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }


        prop = new Properties();

        try (FileInputStream in = new FileInputStream(archivo)) {
            prop.load(in);
        }

    }
}

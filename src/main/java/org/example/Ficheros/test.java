package org.example.Ficheros;

import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        String texto = "hola";

        try {
            FileOutputStream fos = new FileOutputStream("./src/ficheros/archivo.txt");
            fos.write(texto.getBytes());
            fos.write(1);
            fos.close();
            System.out.println("datos escritos en el archivo binario");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package org.example.Ficheros;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class PruebaBufferedInput {
    public static void main(String[] args) {

        try {
            BufferedInputStream dis = new BufferedInputStream(
                    new FileInputStream("./src/ficheros/archivo.txt")
            );

            int intleido = dis.read();
            System.out.println(intleido);
            int byteleido;
            while ((byteleido = dis.read())!=-1) {
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage() + " error");
        }
    }
}

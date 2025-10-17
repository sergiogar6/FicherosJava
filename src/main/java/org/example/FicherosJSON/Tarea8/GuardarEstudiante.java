package org.example.FicherosJSON.Tarea8;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GuardarEstudiante {
    public static void main(String[] args) {
        JSONObject estudiante = new JSONObject()
                .put("nombre", "Paconi")
                .put("edad", 18);

        JSONArray asignaturas = new JSONArray()
                .put("matematicas")
                .put("castellano")
                .put("ingles")
                .put("biologia");


        estudiante.put("asignaturas", asignaturas);

        Path salida = Paths.get("./estudiante.json");

        try {

            //opcionale para indicar directorio padre (creo que es opcional)
            Files.createDirectories(salida.getParent());

            Files.writeString(salida, estudiante.toString(4), StandardCharsets.UTF_8); // indent 4
            System.out.println("JSON guardado en: " + salida.toAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void leerJSON() {


        InputStreamReader
    }

}

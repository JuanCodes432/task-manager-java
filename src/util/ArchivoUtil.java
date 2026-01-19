package util;

import model.Tarea;
import java.io.*;
import java.util.ArrayList;

public class ArchivoUtil {

    private static final String RUTA_ARCHIVO = "data/tareas.txt";

    // ===================== GUARDAR =====================
    public static void guardarTareas(ArrayList<Tarea> tareas) {

        // 1️⃣ Asegurar que la carpeta exista
        File carpeta = new File("data");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        // 2️⃣ Escribir archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {

            for (Tarea tarea : tareas) {
                writer.write(
                        tarea.getDescripcion() + ";" +
                                tarea.getCompletada() + ";" +
                                tarea.getPrioridad()
                );
                writer.newLine();
            }

            System.out.println("Tareas guardadas correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ===================== CARGAR =====================
    public static ArrayList<Tarea> cargarTareas() {

        ArrayList<Tarea> tareas = new ArrayList<>();
        File archivo = new File(RUTA_ARCHIVO);

        // 3️⃣ Si el archivo no existe, no hay nada que cargar
        if (!archivo.exists()) {
            System.out.println("El archivo no existe, lista vacía.");
            return tareas;
        }

        // 4️⃣ Leer archivo de forma segura
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = reader.readLine()) != null) {

                if (linea.trim().isEmpty()) {
                    continue; // saltar líneas vacías
                }

                String[] partes = linea.split(";");

                // 5️⃣ Validación CLAVE
                if (partes.length != 3) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                String descripcion = partes[0];
                boolean completada = Boolean.parseBoolean(partes[1]);
                int prioridad = Integer.parseInt(partes[2]);

                tareas.add(new Tarea(descripcion, completada, prioridad));
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return tareas;
    }
}

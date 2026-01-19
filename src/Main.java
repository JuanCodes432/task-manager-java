import service.GestorTareas;
import util.ArchivoUtil;
import model.Tarea;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1️⃣ Cargar tareas desde archivo
        ArrayList<Tarea> tareasCargadas = ArchivoUtil.cargarTareas();

        // 2️⃣ Crear gestor con tareas cargadas
        GestorTareas gestor = new GestorTareas(tareasCargadas);

        // 3️⃣ Usar el sistema
        gestor.agregarTarea("Estudiar Java", 1);
        gestor.agregarTarea("Subir proyecto a GitHub", 2);

        System.out.println("📋 Lista de tareas:");
        gestor.listarTareas();

        gestor.completarTarea(1);

        System.out.println("\n Lista actualizada:");
        gestor.listarTareas();

        //  Guardar tareas antes de salir
        ArchivoUtil.guardarTareas(gestor.getTareas());

        System.out.println("\n Tareas guardadas correctamente.");
    }
}

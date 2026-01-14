import service.GestorTareas;

public class Main {

    public static void main(String[] args) {

        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea("Estudiar Java", 1);
        gestor.agregarTarea("Subir proyecto a GitHub", 2);
        gestor.agregarTarea("Hacer ejercicio", 3);

        System.out.println("📋 Lista de tareas:");
        gestor.listarTareas();

        gestor.completarTarea(1);

        System.out.println("\n📋 Lista actualizada:");
        gestor.listarTareas();
    }
}

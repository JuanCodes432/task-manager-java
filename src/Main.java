import service.GestorTareas;
import util.ArchivoUtil;
import model.Tarea;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner entrada = new Scanner(System.in);

    public static int menuInterfaz(){
        System.out.println("\n Menu");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Listar Tareas");
        System.out.println("3. Completar Tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("5.Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion = entrada.nextInt();
        System.out.println("");
        return opcion;
    }
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        gestor.setTareas(ArchivoUtil.cargarTareas());
        int opcion;
        boolean salir = false;
        while(!salir){
            opcion = menuInterfaz();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese la prioridad de la tarea: ");
                    int prioridad = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("");
                    System.out.print("Ingrese una descripcion de la tarea: ");
                    String descripcion = entrada.nextLine();
                    System.out.println("");
                    gestor.agregarTarea(descripcion,prioridad);
                    ArchivoUtil.guardarTareas(gestor.getTareas());
                    break;

                case 2:
                    gestor.listarTareas();
                    break;

                case 3:
                    System.out.println("Ingrese la posicion de la tarea que desea completar");
                    int index = entrada.nextInt();
                    if(index <= 0 || index > gestor.getTareas().size()){
                        System.out.println("Esta tarea no existe");

                    }else {
                        gestor.completarTarea(index);
                        ArchivoUtil.guardarTareas(gestor.getTareas());
                    }
                    break;

                case 4:
                    System.out.println("Eliminar tareas");
                    if(gestor.getTareas().isEmpty()){
                        System.out.println("No hay tareas disponibles");
                        break;
                    }
                    gestor.listarTareas();
                    System.out.println("Ingrese el indice a eliminar: ");
                    int exit = entrada.nextInt();
                    gestor.eliminarTareas(exit);
                    ArchivoUtil.guardarTareas(gestor.getTareas());
                    break;
                case 5:
                    System.out.println("Contenido guardado con exito");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
    }
}

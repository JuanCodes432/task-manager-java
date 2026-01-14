package service;

import model.Tarea;
import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> attTareas;

    public GestorTareas(){
        attTareas = new ArrayList<>();
    }

    //Se encarga de agregar tareas
    public void  agregarTarea(String prmDescripcion, int prmPrioridad){
        Tarea nuevaTarea = new Tarea(prmDescripcion, false, prmPrioridad);

        //Añadimos la tarea al array
        attTareas.add(nuevaTarea);
    }

    public void listarTareas(){
        for (int i = 0; i < attTareas.size(); i++) {
            System.out.println(i + ". " + attTareas.get(i));
        }
    }

    //Marca tarea como completada
    public void completarTarea(int index){
        if(index >= 0 && index < attTareas.size()){
            System.out.println("Tarea completada");
            attTareas.get(index).setCompletada(true);
        }else{
            System.out.println("Indice no valido");
        }
    }
}

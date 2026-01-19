package service;

import model.Tarea;
import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas;

    public GestorTareas(ArrayList<Tarea> tareas){
        this.tareas = tareas;
    }

    //Se encarga de agregar tareas
    public void  agregarTarea(String prmDescripcion, int prmPrioridad){
        Tarea nuevaTarea = new Tarea(prmDescripcion, false, prmPrioridad);
        //Añadimos la tarea al array
        tareas.add(nuevaTarea);
    }

    public void listarTareas(){
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + ". " + tareas.get(i));
        }
    }

    //Marca tarea como completada
    public void completarTarea(int index){
        if(index >= 0 && index < tareas.size()){
            System.out.println("Tarea completada");
            tareas.get(index-1).setCompletada(true);
        }else{
            System.out.println("Indice no valido");
        }
    }

    public ArrayList<Tarea> getTareas(){
        return tareas;
    }
}

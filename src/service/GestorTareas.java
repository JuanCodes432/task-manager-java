package service;

import model.Tarea;
import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas;

    public GestorTareas(){
        tareas = new ArrayList<>();
    }

    //Se encarga de agregar tareas
    public void  agregarTarea(String prmDescripcion, int prmPrioridad){
        Tarea nuevaTarea = new Tarea(prmDescripcion, false, prmPrioridad);
        //Añadimos la tarea al array
        tareas.add(nuevaTarea);
    }

    public void listarTareas(){
        if(tareas.size() == 0){
            System.out.println("No hay tareas disponibles");
            return;
        }
        System.out.println("Lista de tareas disponibles");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i+1) + ". " + tareas.get(i));
        }
    }

    //Marca tarea como completada
    public void completarTarea(int index){
        if(index > 0 && index <= tareas.size()){
            System.out.println("Tarea completada");
            tareas.get(index-1).setCompletada(true);
        }else{
            System.out.println("Indice no valido");
        }
    }

    public ArrayList<Tarea> getTareas(){
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas){
        this.tareas = tareas;
    }
}

package model;

public class Tarea {
    private String attDescripcion;
    private boolean attCompletada;
    private int attPrioridad;

    public Tarea(String prmDescripcion, boolean prmCompletada, int prmPrioridad){
        attDescripcion = prmDescripcion;
        attCompletada = prmCompletada;
        attPrioridad = prmPrioridad;
    }

    public String getDescripcion(){
        return attDescripcion;
    }

    public boolean getCompletada(){
        return attCompletada;
    }

    public int getPrioridad(){
        return attPrioridad;
    }

    public void setDescripcion(String prmDescripcion){
        attDescripcion = prmDescripcion;
    }

    public void setCompletada(boolean prmCompletada){
        attCompletada = prmCompletada;
    }

    public void setPrioridad(int prmPrioridad){
        attPrioridad = prmPrioridad;
    }

    @Override
    public String toString() {
        return "Descripción: " + attDescripcion +
                " | Completada: " + attCompletada +
                " | Prioridad: " + attPrioridad;
    }


}

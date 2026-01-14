package model;

public class clsTarea {
    private String attDescripcion;
    private boolean attCompletada;
    private int attPrioridad;

    public clsTarea(String prmDescripcion, boolean prmCompletada, int prmPrioridad){
        attDescripcion = prmDescripcion;
        attCompletada = prmCompletada;
        attPrioridad = prmPrioridad;
    }

    public String getDescripcion(){
        return attDescripcion;
    }

    public boolean getAttCompletada(){
        return attCompletada;
    }

    public int attPrioridad(){
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
}

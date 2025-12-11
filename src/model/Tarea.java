public class Tarea{
    private String attDescripcion;
    private boolean attCompletada;

    public Tarea(String prmDescripcion, boolean prmCompletada){
       this.attDescripcion = prmDescripcion;
       this.attCompletada = prmCompletada;
    }

    public String getDescripcion(){
        return attDescripcion;
    }

    public boolean getCompleatada(){
        return attCompletada;
    }

    public void setDescripcion(String prmDescripcion){
        this.attDescripcion = prmDescripcion;
    }

    public void setCompletada(boolean prmCompletada){
        this.attCompletada = prmCompletada;
    }

    @Override
    public String toString(){
        return (attCompletada ? "[X]" : "[]") + attDescripcion;
    }
}
package clases;

public class Actividad {
    
    private String nombre;
    private int tiempo;
    private String BREAK_LIGHTNING = "BREAK lightning";
    

    
    
    
    @Override
    public String toString() {
        
        if(nombre.equals(BREAK_LIGHTNING))
            return nombre;
        else
            return nombre + Integer.toString(tiempo)+"min";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }    
}

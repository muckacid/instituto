package clases;

public class Charla {
    private int dia;
    private Hora horaInicioActividad;
    private Hora horaTerminoActividad;
    private String jornada;
    private String nombreDeLaCharla;
    private int minDeLaCharla;

    public Charla(int dia, Hora horaInicioActividad, String nombreDeLaCharla, int minDeLaCharla) {
        this.dia = dia;
        this.horaInicioActividad = horaInicioActividad;
        this.nombreDeLaCharla = nombreDeLaCharla;
        this.minDeLaCharla = minDeLaCharla;
    }

    public Hora getHoraTerminoActividad() {
        return horaTerminoActividad;
    }

    public void setHoraTerminoActividad(Hora horaTerminoActividad) {
        this.horaTerminoActividad = horaTerminoActividad;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Hora getHoraInicioActividad() {
        return horaInicioActividad;
    }

    public void setHoraInicioActividad(Hora horaInicioActividad) {
        this.horaInicioActividad = horaInicioActividad;
    }

    public String getNombreDeLaCharla() {
        return nombreDeLaCharla;
    }

    public void setNombreDeLaCharla(String nombreDeLaCharla) {
        this.nombreDeLaCharla = nombreDeLaCharla;
    }

    public int getMinDeLaCharla() {
        return minDeLaCharla;
    }

    public void setMinDeLaCharla(int minDeLaCharla) {
        this.minDeLaCharla = minDeLaCharla;
    }

    
    @Override
    public String toString() {
        
        
        return horaInicioActividad + " |" + jornada + "| " + nombreDeLaCharla + " " + minDeLaCharla +"min";
    }
    
    
    
    
}

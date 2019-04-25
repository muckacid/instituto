package clases;

import java.util.Date;

public class Hora {

    

    
    private int hora;
    private int min;

    public Hora(int hora, int min) {
        this.hora = hora;
        this.min = min;
    }
    
    public Hora() {
        this.hora = 0;
        this.min = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    @Override
    public String toString() {
        if (hora < 10 && min <10) {
            return "0"+hora + ":0" + min;
        }
        if (hora < 10 && min > 10) {
            return "0"+hora + ":" + min;
        }
        if (hora > 10 && min < 10) {
            return ""+hora + ":0" + min;
        }
        return hora + ":" + min;
        
    }
    
     
    
    static public Hora getHora(int minEntrada){
        Hora hora = new Hora();
//        int horas = minEntrada/60; 
//        int min = minEntrada - ( horas * 60);
        hora.setHora(minEntrada/60);
        hora.setMin(minEntrada - ( (minEntrada/60) * 60));
        return hora;
    }
    
    static public int getMin(Hora hora){
        int min = (hora.getHora() * 60);
        min = min + hora.getMin();
        
        return min;
    }
    
    static public int restarHoras(Hora horaTerminoMañana, Hora horaInicioMañana) {
        
        int tiempo_2 = Hora.getMin(horaTerminoMañana);
        int tiempo_1 = Hora.getMin(horaInicioMañana);
        
        int tiempoMin = tiempo_2 - tiempo_1; 
        
//        Hora resultaEnHoras = Hora.getHora(tiempoMin);
        
        return tiempoMin;
    }

    static Hora sumarMin(Hora horaInicioCharla, int minCharla) {
        int min1 = Hora.getMin(horaInicioCharla);
        
        int min2 = minCharla;
        
        int min = min1+min2;
        
        return Hora.getHora(min);
    }

    static boolean esMayor(Hora hora1, Hora hora2){
        
        if(hora1.getHora() > hora2.getHora() || (hora1.getHora() == hora2.getHora() && hora1.getMin() > hora2.getMin()))
            return true;
        else
            return false;
    }

   
}

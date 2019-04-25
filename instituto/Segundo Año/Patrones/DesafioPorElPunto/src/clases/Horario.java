package clases;

import java.util.ArrayList;
import java.util.Date;

public class Horario {
    
    ArrayList<Charla> listaDeCharlas = new ArrayList<Charla>();
    private Hora horaInicioMañana = new Hora(8,0);
    private Hora horaTerminoMañana = new Hora(13,0);
    
    private Hora horaInicioTarde = new Hora(14,0);
    private Hora horaTerminoTarde = new Hora(17,0);
    
    public Horario() {
    }
    
    public void ordenarCharlas(ArrayList<Actividad> lista){
        
        int contDias = 1;
        String jornada = "D";
        Hora horaInicioCharla = horaInicioMañana;
        
        for (int i = 0; i < lista.size(); i++) {
            Charla charla = new Charla(contDias, horaInicioCharla, lista.get(i).getNombre(), lista.get(i).getTiempo());
            
            charla.setHoraTerminoActividad(Hora.sumarMin(charla.getHoraInicioActividad(),lista.get(i).getTiempo()));
            charla.setJornada(jornada);
            horaInicioCharla = charla.getHoraTerminoActividad();
            
            if (Hora.esMayor(charla.getHoraTerminoActividad(),horaTerminoMañana) && jornada.equals("D")) {
                jornada = "T";
                horaInicioCharla = horaInicioTarde;
                charla.setJornada(jornada);
                charla.setHoraInicioActividad(horaInicioCharla);
                charla.setHoraTerminoActividad(Hora.sumarMin(charla.getHoraInicioActividad(),lista.get(i).getTiempo()));
                horaInicioCharla = charla.getHoraTerminoActividad();
            }
            if (Hora.esMayor(charla.getHoraTerminoActividad(),horaTerminoTarde) && jornada.equals("T")) {
                jornada = "D";
                horaInicioCharla = horaInicioMañana;
                contDias++;
                charla.setDia(contDias);
                charla.setJornada(jornada);
                charla.setHoraInicioActividad(horaInicioCharla);
                charla.setHoraTerminoActividad(Hora.sumarMin(charla.getHoraInicioActividad(),lista.get(i).getTiempo()));
                horaInicioCharla = charla.getHoraTerminoActividad();
            }
            listaDeCharlas.add(charla);
        }
    }

    public void mostrar() {
        
        for (int i = 0; i < this.listaDeCharlas.size(); i++) {
            if(listaDeCharlas.get(i).getHoraInicioActividad() == horaInicioMañana){
                System.out.println("Dia N°["+listaDeCharlas.get(i).getDia()+"]");
            }
            System.out.println(this.listaDeCharlas.get(i));
        }
    }
}
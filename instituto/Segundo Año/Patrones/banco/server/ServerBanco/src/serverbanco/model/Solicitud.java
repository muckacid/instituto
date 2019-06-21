package serverbanco.model;

import java.util.Date;

public class Solicitud {
    
    private int id;
    private String rut;
    private double sueldo;
    private String first_name;
    private String second_name;
    private Date fecha_nacimiento;
    private boolean solicitud_aceptada;

    public Solicitud() {
    }

    public Solicitud(int id, String rut, double sueldo, String first_name, String second_name, Date fecha_nacimiento, boolean solicitud_aceptada) {
        this.id = id;
        this.rut = rut;
        this.sueldo = sueldo;
        this.first_name = first_name;
        this.second_name = second_name;
        this.fecha_nacimiento = fecha_nacimiento;
        this.solicitud_aceptada = solicitud_aceptada;
    }
    
    public boolean isSolicitud_aceptada() {
        return solicitud_aceptada;
    }

    public void setSolicitud_aceptada(boolean solicitud_aceptada) {
        this.solicitud_aceptada = solicitud_aceptada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isUsuario_activo() {
        return solicitud_aceptada;
    }

    public void setUsuario_activo(boolean usuario_activo) {
        this.solicitud_aceptada = usuario_activo;
    }
}
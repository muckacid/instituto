package serverbanco.model;

import java.util.Date;

public class Usuario {
    
    private int id;
    private String rut;
    private double sueldo;
    private String first_name;
    private String last_name;
    private Date fechaNacimiento;
    private int saldo;
    private String pass;
    private boolean usuario_activo;
    private int fk_clave;
    private int fk_solicitud;

    public Usuario() {
    }

    public Usuario(int id, String rut, double sueldo, String first_name, String last_name, Date fechaNacimiento, int saldo, String pass, boolean usuario_activo, int fk_clave, int fk_solicitud) {
        this.id = id;
        this.rut = rut;
        this.sueldo = sueldo;
        this.first_name = first_name;
        this.last_name = last_name;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.pass = pass;
        this.usuario_activo = usuario_activo;
        this.fk_clave = fk_clave;
        this.fk_solicitud = fk_solicitud;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isUsuario_activo() {
        return usuario_activo;
    }

    public void setUsuario_activo(boolean usuario_activo) {
        this.usuario_activo = usuario_activo;
    }

    public int getFk_clave() {
        return fk_clave;
    }

    public void setFk_clave(int fk_clave) {
        this.fk_clave = fk_clave;
    }

    public int getFk_solicitud() {
        return fk_solicitud;
    }

    public void setFk_solicitud(int fk_solicitud) {
        this.fk_solicitud = fk_solicitud;
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

  

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

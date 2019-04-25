package desafioprueba2.clases;

public class Usuario {
    private int id;
    private int edad;
    private String nombre;
    private String run;

    public Usuario(int id, String nombre,String run , int edad) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
}

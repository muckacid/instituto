package desafioprueba2.clases;

public class Libro {
    private int id;
    private String nombre;
    private String editorial;
    private String anio;
    private int precio;
    private int stock;
    
    

    public Libro(int id, String nombre, String editorial, String anio, int precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.editorial = editorial;
        this.anio = anio;
        this.precio = precio;
        this.stock = stock;
    }

    public Libro() {
        this.id = 0;
        this.nombre = null;
        this.editorial = null;
        this.anio = null;
        this.precio = 0;
        this.stock = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
}

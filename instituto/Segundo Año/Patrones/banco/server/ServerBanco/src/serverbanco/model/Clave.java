package serverbanco.model;

import java.util.ArrayList;
import java.util.List;

public class Clave {
    
    private int id;
    private List clavesInLista;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getClavesInLista() {
        return clavesInLista;
    }

    public void setClavesInLista(List clavesInLista) {
        this.clavesInLista = clavesInLista;
    }
    
    public List<Integer> generarClave(){
        List<Integer> lista = new ArrayList<Integer>();
            for (int i = 0; i < 50; i++) {
                int numero = (int) (Math.random() * 99) + 10;
                lista.add(numero);
            }
        return lista;
    }
    
    
}

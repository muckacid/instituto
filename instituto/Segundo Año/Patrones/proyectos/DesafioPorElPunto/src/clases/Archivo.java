package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tareapatrones.TareaPatrones;

public class Archivo {
    
    private ArrayList<Actividad> listaActividades = new ArrayList<Actividad>();
    private ArrayList<String> listaLineas = new ArrayList<String>();
    private String breik = "BREAK lightning";
    
    public Archivo(String ruta) {
        File archivo = new File (ruta);
        FileReader fr;
        
        try {
            fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while((linea = br.readLine()) != null)
            {
                listaLineas.add(linea);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tranformarArchivo(){
    
        for (int i = 0; i < this.listaLineas.size(); i++) {
            String linea = this.listaLineas.get(i);
            Actividad act = new Actividad();

            if(linea.equals(this.breik)){
                act.setNombre(linea);
                act.setTiempo(5);
            }
            else{
                String[] lineaFragmentada = linea.split(" ");
                String temp = lineaFragmentada[lineaFragmentada.length-1];
                String[] txtmin = temp.split("min");
                
                act.setNombre(linea.split(temp)[0]);
                act.setTiempo(Integer.parseInt(txtmin[0]));
            }
            listaActividades.add(act);
        }
    }
    
    public void imprimirListaActividades(){
        for (int i = 0; i < this.listaActividades.size(); i++) {
            System.out.println(this.listaActividades.get(i).toString());
        }
    }
    
    public ArrayList<Actividad> getLista(){
        return listaActividades;
    }
}

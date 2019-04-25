package tareapatrones;

import clases.Actividad;
import clases.Archivo;
import clases.Horario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TareaPatrones {
    public static void main(String[] args) throws IOException {
        
        Archivo archivo = new Archivo("archivo.txt");
        archivo.tranformarArchivo();
        ArrayList<Actividad> lista = archivo.getLista();
        Horario horario = new Horario();
        horario.ordenarCharlas(lista);
        horario.mostrar();
        
    }
}

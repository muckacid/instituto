package generardocumentoventabuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Martinez
 */
public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<String>();
    
    public abstract void agregarDocumento(String documento);
    public abstract void imprimir();
    
}

package generardocumentoventabuilder;

/**
 *
 * @author Luis Martinez
 */
public class DocumentacionHTML extends Documentacion{

    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<HTML>")){
            contenido.add(documento);
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Documentacion HTML");
        for(String s: contenido){
            System.out.println(s);
        }
    }
    
}

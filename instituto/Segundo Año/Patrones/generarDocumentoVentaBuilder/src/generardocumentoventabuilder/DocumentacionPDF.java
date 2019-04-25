package generardocumentoventabuilder;

/**
 *
 * @author Luis Martinez
 */
public class DocumentacionPDF extends Documentacion{

    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<PDF>")){
            contenido.add(documento);
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Documentacion PDF");
        for(String s: contenido){
            System.out.println(s);
        }
    }
    
}

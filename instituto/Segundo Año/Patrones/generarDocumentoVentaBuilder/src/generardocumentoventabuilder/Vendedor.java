package generardocumentoventabuilder;


/**
 *
 * @author Luis Martinez
 */
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructorr;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructorr = constructor;
    }
    
    public Documentacion construye(String nombreCliente){
        
        constructorr.construyeSolicitudPedido(nombreCliente);
        constructorr.construyeSolicitudMatriculacion(nombreCliente);
        Documentacion doc = constructorr.getResultado();
        return doc;
    }
}

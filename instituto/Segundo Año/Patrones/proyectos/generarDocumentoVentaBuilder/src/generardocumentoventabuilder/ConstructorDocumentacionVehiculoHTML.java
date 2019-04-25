package generardocumentoventabuilder;

/**
 *
 * @author Luis Martinez
 */
public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo{

    public ConstructorDocumentacionVehiculoHTML() {
        documentacion = new DocumentacionHTML();
    }

    
    
    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido cliente: "+nombreCliente+"</HTML>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<HTML>Solicitud de matriculacion solicitante: "+nombreSolicitante+"</HTML>";
        documentacion.agregarDocumento(documento);
    }
    
}

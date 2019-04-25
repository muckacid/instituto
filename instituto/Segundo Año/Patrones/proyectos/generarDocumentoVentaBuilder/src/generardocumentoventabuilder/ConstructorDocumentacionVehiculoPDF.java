package generardocumentoventabuilder;

/**
 *
 * @author Luis Martinez
 */
public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo{

    public ConstructorDocumentacionVehiculoPDF() {
        documentacion = new DocumentacionHTML();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido cliente: "+nombreCliente+"</PDF>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<PDF>Solicitud de matriculacion solicitante: "+nombreSolicitante+"</PDF>";
        documentacion.agregarDocumento(documento);
    }
    
}

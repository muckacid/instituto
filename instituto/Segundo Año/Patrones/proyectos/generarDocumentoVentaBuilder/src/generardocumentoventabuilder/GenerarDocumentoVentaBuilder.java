package generardocumentoventabuilder;

import java.util.Scanner;

/**
 *
 * @author Luis Martinez
 */
public class GenerarDocumentoVentaBuilder {

    public static void main(String[] args) {
        ConstructorDocumentacionVehiculo constructor = null;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("¿Qué documento desea generar?");
        System.out.println("(1) HTML");
        System.out.println("(2) PDF");
        System.out.print("-->");
        
        String op = scan.nextLine();
        if(op.equals("1")){
            constructor = new ConstructorDocumentacionVehiculoHTML();
        }else if(op.equals("2")){
            constructor = new ConstructorDocumentacionVehiculoPDF();
        }else{
            System.out.println("Tierno");
        }
        
        System.out.print("Ingrese nombre Cliente: ");
        String nombreCliente = scan.nextLine();
        
        Vendedor ven = new Vendedor(constructor);
        Documentacion doc = ven.construye(nombreCliente);
        doc.imprimir();
        
    }
    
}

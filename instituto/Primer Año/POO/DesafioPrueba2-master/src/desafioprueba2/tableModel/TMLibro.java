package desafioprueba2.tableModel;

import desafioprueba2.clases.Libro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMLibro extends AbstractTableModel{
    
    private List<Libro> lista;
    
    public TMLibro(List<Libro> lista){
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;//id,anio,precio,stock,nombre,editorial
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Libro libro = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0: 
                return libro.getId();
            case 1:
                return libro.getNombre();
            case 2:
                return libro.getEditorial();
            case 3:
                return libro.getAnio();
            case 4:
                return "$"+libro.getPrecio();
            case 5:
                return libro.getStock();
            default:
                return "";
        }
    }    
        
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: 
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Editorial";
            case 3:
                return "Año";
            case 4:
                return "Precio";
            default:
                return "Stock";
        }
    }
        
}
    


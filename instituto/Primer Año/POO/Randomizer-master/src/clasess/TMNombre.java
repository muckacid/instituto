package clasess;

import clasess.Nombre;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMNombre extends AbstractTableModel{

    private List<Nombre> lista;

    public TMNombre(List<Nombre> lista) {
        this.lista = lista;
    }
    
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Nombre datos = lista.get(rowIndex);
        
        if(columnIndex == 0){
            return datos.getId();
        }else{
            return datos.getDato();
        }
    }

    @Override
    public String getColumnName(int column) {
        if(column == 0){
            return "ID";
        }else{
            return "Nombre";
        }
        
    }
    
    
}

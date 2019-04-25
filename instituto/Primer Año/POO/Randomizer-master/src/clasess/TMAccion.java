package clasess;

import clasess.Accion;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMAccion extends AbstractTableModel{

    private List<Accion> lista;

    public TMAccion(List<Accion> lista) {
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
        Accion datos = lista.get(rowIndex);
        
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

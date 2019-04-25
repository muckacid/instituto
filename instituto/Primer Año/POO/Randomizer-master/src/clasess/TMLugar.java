package clasess;

import clasess.Lugar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMLugar extends AbstractTableModel{

      private List<Lugar> lista;

    public TMLugar(List<Lugar> lista) {
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
        Lugar datos = lista.get(rowIndex);
        
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

package serverbanco.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import serverbanco.model.*;

public class Data {

    private Conexion conn;
    
    public Data() throws ClassNotFoundException, SQLException {
        conn = conn.getInstance();
    }

    public int crearClave() throws SQLException{
        String query = "INSERT INTO clave VALUES(Null,'"+this.dato()+"','"
                                                        +this.dato()+"','"
                                                        +this.dato()+"','"
                                                        +this.dato()+"','"
                                                        +this.dato()+"');";
        conn.ejecutar(query);

        String query2 = "SELECT id FROM clave ORDER BY id DESC LIMIT 1";
        ResultSet rs = conn.ejecutar(query2);
        int var;
        if(rs.next()){
            var = rs.getInt(1);
            conn.close();
        }
        else
           var = 0;
        return var;
    }
    
    
    public void crearUsuario(int id, Solicitud sol) throws SQLException{
        String sql = "INSERT INTO usuario VALUES(NULL,'"+sol.getRut()+"','"
                                                        +sol.getSueldo()+"','"
                                                        +sol.getFirst_name()+"','"
                                                        +sol.getSecond_name()+"','"
                                                        +sol.getFecha_nacimiento()+"',0,SHA2('123',0),true,'"
                                                        +id+"','"+sol.getId()+"')";
        conn.ejecutar(sql);
        
        String soli = "UPDATE solicitud SET solicitud_aceptada = true WHERE id = "+sol.getId();
        conn.ejecutar(soli);
        
        
    }
    
    private String dato(){
        
        String var = "";
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random()*89+10);
            if(i == 9)
                var += Integer.toString(num);
            else
                var += Integer.toString(num)+"|";
        }
        return var;
    }
    
    public List<Solicitud> obtenerSolicitudes() throws SQLException{
        Solicitud s = new Solicitud();
        List<Solicitud> lista = new ArrayList<Solicitud>();
        String sql = "Select * from solicitud WHERE solicitud_aceptada = 0";
        ResultSet rs = conn.ejecutar(sql);
        while(rs.next()){
            s.setId(rs.getInt(1));
            s.setRut(rs.getString(2));
            s.setSueldo(rs.getDouble(3));
            s.setFirst_name(rs.getString(4));
            s.setSecond_name(rs.getString(5));
            s.setFecha_nacimiento(rs.getDate(6));
            s.setUsuario_activo(rs.getBoolean(7));
            lista.add(s);
        }
        conn.close();
        return lista;
    }

    
}

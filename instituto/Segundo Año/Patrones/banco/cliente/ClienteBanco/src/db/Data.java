package db;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Solicitud;

public class Data {

    Conexion con;
    public Data() throws ClassNotFoundException, SQLException {
        con = Conexion.getInstance();
    }
    
    
    public int obtenerSolicitudesEnEspera() throws SQLException{
        String sql = "SELECT COUNT(*) AS 'n' FROM solicitud WHERE solicitud_aceptada is flase;";
        ResultSet rs = this.con.ejecutar(sql);
            return rs.getInt("n");
    }
    
    //INSERT INTO solicitud VALUES(NULL,'18646384-6',400000,'Maximiliano','Moraga','1994-01-25',false);
    public void registrarSolicitud(Solicitud sol) throws SQLException{
        if(sol.getId() == 0){
            String query = "INSERT INTO solicitud VALUES(NULL,'"+sol.getRut()+"','"
                                                                +sol.getSueldo()+"','"
                                                                +sol.getFirst_name()+"','"
                                                                +sol.getSecond_name()+"','"
                                                                +sol.getFecha_nacimiento()+"',"
                                                                +sol.isUsuario_activo()+");";
            con.ejecutar(query);
        }   
    }
    
    public boolean verificarUsuario(String rut, String verificador, String pass) throws SQLException{
        String query = "SELECT * FROM usuario WHERE rut = '"+rut+"-"+verificador+"' and pass = SHA2('"+pass+"',0)";
        ResultSet rs = con.ejecutar(query);
        if(rs.next()){
            return true;
        }
        return false;
    }
    
    //saldo pichulazo del alex
    public double consultarSueldo(int id, double sueldo) throws SQLException{
        String query = "SELECT sueldo FROM usuario WHERE id = "+id+";";
        ResultSet rs = con.ejecutar(query);
        if(rs.next()){
            if(rs.getDouble(0) != sueldo){
                return rs.getDouble(0);
            }
        }
        return sueldo;
    }
    
    public Date obtenerEdadPorId(){
        String query = "SELECT TIMESTAMPDIFF(año,FechaNac,CURDATE()) AS edad FROM clientes;";
        return null;
    }
    
    
}

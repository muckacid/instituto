package desafioprueba2.manejoDatos;

import desafioprueba2.clases.Libro;
import desafioprueba2.clases.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("desafioPrueba2");
    }
    
    public String getNameUser(String run) throws SQLException{
        String nombre = null;
        String sql = "SELECT nombre FROM usuario WHERE run = '"+run+"';";
        ResultSet rs = con.ejecutar(sql);
        if(rs.next()){
            nombre = rs.getString(1);
        }
        con.close();
        return nombre;
    }
    
    public void updateUser(String run, String nombre, int edad) throws SQLException{
        String sql = "UPDATE usuario SET nombre='"+nombre+"', edad='"+edad+"' WHERE run = '"+run+"'";
        ResultSet rs = con.ejecutar(sql);
    }
    
    public void registrarLibro(String nombre, String editorial, String anio, String precio, String stock) throws SQLException{
        String sql = "INSERT INTO libro VALUES(null,'"+nombre+"','"+editorial+"','"+anio+"','"+precio+"','"+stock+"')";
        ResultSet rs = con.ejecutar(sql);
    }
    public void registrarUsuario(String nombre, String run, String edad) throws SQLException{
        String sql = "INSER INTO libro VALUES(null,'"+nombre+"','"+run+"','"+edad+"')";
        ResultSet rs = con.ejecutar(sql);
    }
    
    public List<Libro> getLibros() throws SQLException{
        List<Libro> lista = new ArrayList<>();
        String sql = "SELECT * FROM libro;";
        // id - nombre - editorial - anio - precio - stock
        ResultSet rs = con.ejecutar(sql);
      
        while(rs.next()){
            Libro libro = new Libro();
            libro.setId(rs.getInt("id"));
            libro.setNombre(rs.getString("nombre"));
            libro.setEditorial(rs.getString("editorial"));
            libro.setAnio(rs.getString("anio"));
            libro.setPrecio(rs.getInt("precio"));
            libro.setStock(rs.getInt("stock"));
            
            lista.add(libro);
        }
        con.close();
        return lista;
    }
    public List<Libro> listarPor(String filtro) throws SQLException{
        
        List<Libro> lista = new ArrayList<>();
        String sql = "SELECT * FROM libro nombre LIKE '%"+filtro+"%'";
        ResultSet rs = con.ejecutar(sql);
        while(rs.next()){
            Libro libro = new Libro();
            libro.setId(rs.getInt(1));
            libro.setNombre(rs.getString(2));
            lista.add(libro);
        }
        con.close();
        return lista;
    }
}

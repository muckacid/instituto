package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private Statement sen;
    private static Connection con;
    private static Conexion instancia;


    public static Conexion getInstance() throws ClassNotFoundException, SQLException{
        if(instancia == null){
            instancia = new Conexion("banco");
        }
        return instancia;
    }

    private Conexion(String bd) throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://localhost/" + "banco" + "?user=root&password=";
        System.out.println(url);
//        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url);
        System.out.println("Conexion exitosa");
    }

    Conexion() {
    }

    public ResultSet ejecutar(String query) throws SQLException {
        System.out.println(query);
        sen = con.createStatement();

        if (
            query.toLowerCase().startsWith("insert") || 
            query.toLowerCase().startsWith("update") ||
            query.toLowerCase().startsWith("delete")
        ){
            sen.executeUpdate(query);
            close();
            return null;
        }
        return sen.executeQuery(query);
    }

    public void close() throws SQLException {
        sen.close();
    } 
}
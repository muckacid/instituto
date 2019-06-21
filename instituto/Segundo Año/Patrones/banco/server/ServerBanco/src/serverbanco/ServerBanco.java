package serverbanco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import serverbanco.db.Data;
import serverbanco.model.Solicitud;

public class ServerBanco {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        HiloSolicitud sol = new HiloSolicitud();
        sol.start();
        
    }

    public static class Cliente extends Thread{
        
        @Override
        public void run() {
            try {
                Data data = new Data();
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ServerBanco.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ServerBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static class HiloSolicitud extends Thread{
       
        @Override
        public void run() {
            try {
                Data data = new Data();
                
                while(true){
                    try {
                        sleep(1000);
                        List<Solicitud> lista = new ArrayList<>();
                        lista = data.obtenerSolicitudes();
                        if(lista != null){
                            
                            for(int i = 0; i < lista.size(); i++){
                                
                                Solicitud sol = lista.get(i);
                                
                                
                                
                                if(sol.getSueldo() >= 400000){
                                    int id = data.crearClave();
                                    data.crearUsuario(id, sol); 
                                }
                            }
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ServerBanco.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ServerBanco.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ServerBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

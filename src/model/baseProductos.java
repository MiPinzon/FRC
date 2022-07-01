
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class baseProductos {
    Connection conectar = null;
    
    public Connection conexion3(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root","");
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            
            System.out.println("mensaje error "+e);
        }
        
        return conectar;
    
    }
        public void guardarProducto(Connection conexion3, String nom, String ob){
        PreparedStatement consulta;
        try {
            consulta = conexion3.prepareStatement("insert into producto values(?,?,?)");          
            consulta.setString(1, "");
            consulta.setString(2, nom);
            consulta.setString(3, ob);
            consulta.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

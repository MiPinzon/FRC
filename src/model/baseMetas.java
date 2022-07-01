package model;



import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class baseMetas {
    String a = "a";
    Connection conectar = null;
    
    public Connection conexion2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/metas", "root","");
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            
            System.out.println("mensaje error "+e);
        }
        
        return conectar;
    
    }
    public void tablaMetas(Connection conexion2, String f, String peso, String co){
        PreparedStatement consulta;
        try{
            consulta = conexion2.prepareStatement("insert into metas values(?,?,?)");
            consulta.setString(1, f);
            consulta.setString(2, peso);
            consulta.setString(3, co);
            consulta.executeUpdate();
            
        }catch(SQLException ex){

            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String estaCorreoM(Connection conexion,String corr){
        PreparedStatement consulta;

        try{
        consulta = conexion.prepareStatement("select * from usuario where Correo = ?");   
        consulta.setString(1, corr.trim());
        ResultSet rs = consulta.executeQuery();
        if(rs.next()){

            a = "El correo ya se encuantra registrado";
        } else{
            a = null;
        }
        
        }catch(SQLException e){
            
        }
        System.out.println(a);
            return a;
    }
    //Puede servir para los productos

    
}

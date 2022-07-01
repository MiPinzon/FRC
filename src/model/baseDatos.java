/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomor
 */



public class baseDatos {
    Connection conectar = null;
    String a = "a";
    boolean b;
    boolean z;


    String contrasena;
    // Conexion a la base de datos
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root","");
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            
            System.out.println("mensaje error "+e);
        }
        
        return conectar;
        
    }

    //Metodo para guardar usuarios
    public void guardarUsuario(Connection conexion,String n, String c, String t, String co){
        PreparedStatement consulta;
        try {
            consulta = conexion.prepareStatement("insert into usuario values(?,?,?,?)");          
            consulta.setString(1, n);
            consulta.setString(2, c);
            consulta.setString(3, t);
            consulta.setString(4, co);
            consulta.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //Buscar correo en la base de datos
    public String estaCorreo(Connection conexion,String corr){
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
    //Comprobar si el correo y la contraseña ingresados estan en la base de datos
    public boolean entranda(Connection conexion, String corr,String contra){
        PreparedStatement consulta;

        try{
        consulta = conexion.prepareStatement("select * from usuario where Correo = ?");   
        consulta.setString(1, corr.trim());
        ResultSet rs = consulta.executeQuery();

        if(rs.next() && contra.equals(contrasena = rs.getString("Contrasena"))){
            b = true;
        } else{
            b = false;
            
        }
        
        }catch(SQLException e){
            
        }
            return b;
      
    }
            
    public String fechaActual(){
            Date fecha = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
            formatoFecha.format(fecha);
            

        return formatoFecha.format(fecha);
        
    }

    public boolean getCorreo(Connection conexion, String corr){
        PreparedStatement consulta;

        try{
        consulta = conexion.prepareStatement("select * from usuario where Correo = ?");   
        consulta.setString(1, corr.trim());
        ResultSet rs = consulta.executeQuery();

        if(rs.next()){
            z = true;
        } else{
            z = false;
            
        }
        
        }catch(SQLException e){
            
        }
            return z;

        
    }
}



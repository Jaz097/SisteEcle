/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisteecle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Jesùs de Gran Poder
 */
public class conexion {
    Connection con = null;
   
    
    public Connection conexion(){
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaecle","root","12345");
    }catch (Exception e){
            System.err.println("Error de conexion" + e); 
    }
        return con;
}
}

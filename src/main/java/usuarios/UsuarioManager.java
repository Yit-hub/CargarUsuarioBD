/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.sql.*;

/**
 *
 * @author Yi Daniel Chen Liu
 */
public class UsuarioManager {
    
    //Fields
    private static Connection conn = null;
    
    private UsuarioManager(){
        
        String url = "jdbc:mysql://localhost:3306/singletonjdbc";
        String user = "root";
        String pass = "";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user, pass);
            System.out.println("Conexión exitosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
    
    public static Connection getconnection(){
        
        if(conn == null){
            new UsuarioManager();
        }
        
        return conn;
    }
    
    
    
}

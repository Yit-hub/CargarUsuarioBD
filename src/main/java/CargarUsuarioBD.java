
import java.sql.Connection;
import java.sql.SQLException;
import usuarios.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yi Daniel Chen Liu
 */
public class CargarUsuarioBD {
        public static void main(String[] args) {
    
        Connection conn = UsuarioManager.getconnection();    
        Usuario datos = new Usuario();
        
        
        //Cerrar conexión con la base de datos
        /*
                try{
            if(conn != null) conn.close();
        }catch(SQLException e){
            System.out.println("Error al intentar cerrar la conexión "+e.getMessage());
        }
        */
        
        
    }
}

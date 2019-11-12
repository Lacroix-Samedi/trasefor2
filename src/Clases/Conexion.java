
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexion{
   
   private static Connection conn;
   private  static final  String  driver = "com.mysql.jbdc,Driver";
   private  static final  String  user = "root";
   private  static final  String  password = ""; //:D
   private  static final  String  url = "jbdc:mysql://localhost:3306/trasefor";
   
   public Conexion(){
       conn = null; 
       try {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, password);
           if(conn != null){
               System.out.println("Conexion establecida...");
           }
       }catch(ClassNotFoundException | SQLException e) {
           System.out.println("Error al conectar" +e);
       }
   }
   
   public Connection getConnection(){
       return conn;
   }
   public void desconectar(){
       conn = null;
       if(conn == null){
           System.out.println("Conexion terminada...");
       }
   }

    public Connection conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

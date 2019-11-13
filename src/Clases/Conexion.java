
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexion{
    private static String driver = "com.mysql.jdbc.Driver";
    private static String datebase = "trasefor";
    private static String hostname = "127.0.0.1";
    private static String port = "3307";
    private static String username = "root";
    private static String password = "123456789";
    private static String connectionURL;
    
    
    public static Connection conn;
    
    public Conexion(){
        this.connectionURL = "jdbc:mysql://";
        this.connectionURL += hostname + ":" + port + "/" + datebase;
        this.connectionURL += "autoReconect = true & useSSL = false";
    }
    
    public static Connection getConnection(){
        try{
            Class.forName(driver);
            try{
                conn = DriverManager.getConnection(connectionURL, username, password);
            }catch(SQLException e){
                JOptionPane.showConfirmDialog(null, "No se puede conectar" +e.getMessage());
            }
        } catch(ClassNotFoundException ex){
            JOptionPane.showConfirmDialog(null, "La clase "+driver+" no existe en el sistema");
        }
        return conn;
    }
}

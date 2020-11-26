import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;


public class Conexion {
    
    private String url;
    private Connection conexion;

    public Conexion(String url) {
        this.url = url;
    }
     
    
    public void conectar(){
        try {
            Class.forName("org.sqlite.JDBC");       
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url); 
            //JOptionPane.showMessageDialog(null, "Conexión exitosa");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Error en la conexión con la base de datos"+ ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
   
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error en el cierre de la conexión con la base de datos"+ ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
}
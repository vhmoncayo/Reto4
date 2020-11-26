
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Empleado {

    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private Boolean esProveedor;
    private String salario;
    private String cargo;

    public Empleado(long id, String nombre, String apellido, String correo, String celular, Boolean esProveedor, String salario, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public Empleado(String nombre, String apellido, String correo, String celular, Boolean esProveedor, String salario, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    
    
    public Empleado(String nombre, String correo, String celular, String salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.salario = salario;
    }
    
    public Empleado() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getEsProveedor() {
        return esProveedor;
    }

    public void setEsProveedor(Boolean esProveedor) {
        this.esProveedor = esProveedor;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void Crear(){
        
        Conexion miConexion = new Conexion("mydb.db");        
        miConexion.conectar();
        
        Statement stmt;
        try {
            int a;
            stmt = miConexion.getConexion().createStatement();
            if (this.esProveedor) {a=1;}
            else {a=0;}

            stmt.execute("INSERT INTO empleados (nombre, apellido, correo, celular, esProveedor, salario, cargo) "
                    + "values ('" + this.nombre + "','" + this.apellido + "','" + this.correo + "','" + 
                    this.celular + "','" + a + "','" + this.salario + "','" + this.cargo + "');");
            stmt.close();
            miConexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Usuario Creado");
                    
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static ArrayList<Empleado> Leer(){
        
        ArrayList<Empleado> misEmpleados = new ArrayList();
        
        Conexion miConexion = new Conexion("mydb.db");        
        miConexion.conectar();
        
        try {
            Statement miStatement = miConexion.getConexion().createStatement();
            ResultSet rs = miStatement.executeQuery("SELECT * FROM empleados;");
           
            while (rs.next()) {                 
                long id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String celular = rs.getString("celular");
                Boolean esProveedor = rs.getBoolean("esProveedor");
                String salario = rs.getString("salario");
                String cargo = rs.getString("cargo");
                misEmpleados.add(new Empleado(id, nombre, apellido, correo, celular, esProveedor, salario, cargo));
            }         
            rs.close();
            miStatement.close();
            miConexion.cerrarConexion();
            
        } catch (SQLException ex) {
            
            System.out.println("Error en statement");
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return misEmpleados;
    }
    
    
    public void Actualizar(long id,String nombre, String apellido, String correo, String celular, 
                           Boolean esProveedor, String salario, String cargo){
        
        Conexion miConexion = new Conexion("mydb.db");     
        miConexion.conectar();
        
        Statement stmt;
        
        try {
            int b;
            stmt = miConexion.getConexion().createStatement();
            if (esProveedor) {b=1;}
            else {b=0;}
            //String query = "UPDATE empleados SET correo='"+ correo+"',celular='"+celular+"' WHERE id="+id;
            String query = "UPDATE empleados SET nombre='"+nombre+"',apellido='"+apellido+"',correo='"+
                           correo+"',celular='"+celular+"',esProveedor='"+b+"',salario='"+salario+
                           "',cargo='"+cargo+"' WHERE id="+id;
            JOptionPane.showMessageDialog(null, "Usuario Actualizado");
            stmt.execute(query); 
            stmt.close();
            miConexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void Borrar(int id){
        Conexion miConexion = new Conexion("mydb.db");        
        miConexion.conectar();
        
        Statement stmt;
        
        try {
            stmt = miConexion.getConexion().createStatement();
            stmt.execute("DELETE FROM empleados WHERE id="+id);
            stmt.close();
            miConexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


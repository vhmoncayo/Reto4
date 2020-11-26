import java.util.*;


public class Principal {
    
    public static void main(String[] args) {
        
        RegistroJFrame inicio = new RegistroJFrame();
        inicio.setVisible(true);
        
        /*ArrayList<Empleado> arrayEmpleado = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        String nombre1  = leer.nextLine();
        String correo1  = leer.nextLine();
        String celular1 = leer.nextLine();
        String salario  = leer.nextLine();
        String correo2  = leer.nextLine();
        String celular2 = leer.nextLine();
                
        Empleado emPrueba = new  Empleado(nombre1, correo1, celular1, salario);
        emPrueba.setEsProveedor(true);
        
        emPrueba.Crear();
        
        arrayEmpleado = Empleado.Leer();
        System.out.println();
        for (Empleado empleado : arrayEmpleado) {
            System.out.println("Empleado creado: " + empleado.getCorreo()+ ", nombre: " +empleado.getNombre() + 
                               ", celular: " + empleado.getCelular());
        }
        
        emPrueba.Actualizar(arrayEmpleado.get(0).getId(), nombre1, arrayEmpleado.get(0).getApellido(), correo2, 
                            celular2, arrayEmpleado.get(0).getEsProveedor(), arrayEmpleado.get(0).getSalario(),
                            arrayEmpleado.get(0).getCargo());
        
        arrayEmpleado = Empleado.Leer();
        for (Empleado empleado : arrayEmpleado) {
            System.out.println("Empleado creado: " + empleado.getCorreo()+ ", nombre: " +empleado.getNombre() + 
                               ", celular: " + empleado.getCelular());
        }
        
        arrayEmpleado = Empleado.Leer();
        emPrueba.Borrar((int) arrayEmpleado.get(0).getId());
        
        arrayEmpleado = Empleado.Leer();
        System.out.println("Cantidad de empleados: " + arrayEmpleado.size());*/
        
    }
    
}
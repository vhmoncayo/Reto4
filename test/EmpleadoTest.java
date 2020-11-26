/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author xanatos
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    /**
     * Test of Crear method, of class Empleado.
     */
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado crear = new Empleado("Víctor", "Monky", "abc@abc", "3333333", false, "10000000", "Director");
        crear.Crear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Leer method, of class Empleado.
     */
    @Test
    public void testLeer() {
        System.out.println("Leer");
        ArrayList<Empleado> expResult = null;
        ArrayList<Empleado> result = Empleado.Leer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class Empleado.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        long id = 7;
        String nombre = "Juan";
        String apellido = "Monka";
        String correo = "juan@juan";
        String celular = "333444555";
        Boolean esProveedor = true;
        String salario = "3345677";
        String cargo = "Gerente";
        Empleado instance = new Empleado();
        instance.Actualizar(id, nombre, apellido, correo, celular, esProveedor, salario, cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class Empleado.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        int id = 7;
        Empleado borrar = new Empleado();
        borrar.Borrar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

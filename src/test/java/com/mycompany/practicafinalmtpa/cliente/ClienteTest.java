/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practicafinalmtpa.cliente;

import java.io.DataOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Veronica
 */
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getSalida method, of class Cliente.
     */
    @Test
    public void testGetSalida() {
        System.out.println("getSalida");
        Cliente instance = null;
        DataOutputStream expResult = null;
        DataOutputStream result = instance.getSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarCliente method, of class Cliente.
     */
    @Test
    public void testIniciarCliente() {
        System.out.println("iniciarCliente");
        Cliente instance = null;
        instance.iniciarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Cliente.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Cliente instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enviarMensajeServidor method, of class Cliente.
     */
    @Test
    public void testEnviarMensajeServidor() throws Exception {
        System.out.println("enviarMensajeServidor");
        String mensaje = "";
        Cliente instance = null;
        instance.enviarMensajeServidor(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarConexion method, of class Cliente.
     */
    @Test
    public void testCerrarConexion() {
        System.out.println("cerrarConexion");
        Cliente instance = null;
        instance.cerrarConexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

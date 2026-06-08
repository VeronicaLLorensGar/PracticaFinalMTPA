/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

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
public class EstadoServidorTest {
    
    public EstadoServidorTest() {
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
     * Test of getEstado method, of class EstadoServidor.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        EstadoServidor expResult = null;
        EstadoServidor result = EstadoServidor.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientesConectados method, of class EstadoServidor.
     */
    @Test
    public void testGetClientesConectados() {
        System.out.println("getClientesConectados");
        EstadoServidor instance = null;
        int expResult = 0;
        int result = instance.getClientesConectados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarConexion method, of class EstadoServidor.
     */
    @Test
    public void testRegistrarConexion() {
        System.out.println("registrarConexion");
        EstadoServidor instance = null;
        instance.registrarConexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarDesconexion method, of class EstadoServidor.
     */
    @Test
    public void testRegistrarDesconexion() {
        System.out.println("registrarDesconexion");
        EstadoServidor instance = null;
        instance.registrarDesconexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceptarClientes method, of class EstadoServidor.
     */
    @Test
    public void testAceptarClientes() {
        System.out.println("aceptarClientes");
        EstadoServidor instance = null;
        boolean expResult = false;
        boolean result = instance.aceptarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acabarMantenimiento method, of class EstadoServidor.
     */
    @Test
    public void testAcabarMantenimiento() {
        System.out.println("acabarMantenimiento");
        EstadoServidor instance = null;
        instance.acabarMantenimiento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarMantenimiento method, of class EstadoServidor.
     */
    @Test
    public void testIniciarMantenimiento() {
        System.out.println("iniciarMantenimiento");
        EstadoServidor instance = null;
        instance.iniciarMantenimiento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

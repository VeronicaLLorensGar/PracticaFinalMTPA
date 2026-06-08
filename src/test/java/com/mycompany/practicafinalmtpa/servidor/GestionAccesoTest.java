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
public class GestionAccesoTest {
    
    public GestionAccesoTest() {
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
     * Test of getInstancia method, of class GestionAcceso.
     */
    @Test
    public void testGetInstancia() {
        System.out.println("getInstancia");
        GestionAcceso expResult = null;
        GestionAcceso result = GestionAcceso.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarRegistro method, of class GestionAcceso.
     */
    @Test
    public void testIniciarRegistro() {
        System.out.println("iniciarRegistro");
        String nombre = "";
        GestionAcceso instance = null;
        instance.iniciarRegistro(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class GestionAcceso.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String nombre = "";
        int password = 0;
        GestionAcceso instance = null;
        String expResult = "";
        String result = instance.login(nombre, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

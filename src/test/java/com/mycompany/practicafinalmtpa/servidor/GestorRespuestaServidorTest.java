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
public class GestorRespuestaServidorTest {
    
    public GestorRespuestaServidorTest() {
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
     * Test of enviar method, of class GestorRespuestaServidor.
     */
    @Test
    public void testEnviar() {
        System.out.println("enviar");
        Connection c = null;
        String respuesta = "";
        GestorRespuestaServidor.enviar(c, respuesta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ok method, of class GestorRespuestaServidor.
     */
    @Test
    public void testOk() {
        System.out.println("ok");
        String comando = "";
        String expResult = "";
        String result = GestorRespuestaServidor.ok(comando);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of key method, of class GestorRespuestaServidor.
     */
    @Test
    public void testKey() {
        System.out.println("key");
        int clave = 0;
        String expResult = "";
        String result = GestorRespuestaServidor.key(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of error method, of class GestorRespuestaServidor.
     */
    @Test
    public void testError() {
        System.out.println("error");
        Exception e = null;
        String expResult = "";
        String result = GestorRespuestaServidor.error(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

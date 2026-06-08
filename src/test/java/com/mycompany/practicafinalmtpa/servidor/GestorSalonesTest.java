/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import com.mycompany.practicafinalmtpa.salones.Salon;
import java.util.ArrayList;
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
public class GestorSalonesTest {
    
    public GestorSalonesTest() {
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
     * Test of getInstancia method, of class GestorSalones.
     */
    @Test
    public void testGetInstancia() {
        System.out.println("getInstancia");
        GestorSalones expResult = null;
        GestorSalones result = GestorSalones.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaSalones method, of class GestorSalones.
     */
    @Test
    public void testGetListaSalones() {
        System.out.println("getListaSalones");
        GestorSalones instance = null;
        ArrayList<Salon> expResult = null;
        ArrayList<Salon> result = instance.getListaSalones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirLista method, of class GestorSalones.
     */
    @Test
    public void testAñadirLista() {
        System.out.println("a\u00f1adirLista");
        Salon salon = null;
        GestorSalones instance = null;
        instance.añadirLista(salon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

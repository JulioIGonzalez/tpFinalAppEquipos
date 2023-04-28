/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tpfdesarrolladorjava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class EquipoTest {
    
    public EquipoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ConsultarTodosLosEquipos method, of class Equipo.
     */
    @Test
    public void testConsultarTodosLosEquipos() {
        System.out.println("ConsultarTodosLosEquipos");
        Equipo instance = new Equipo();
        String expResult = "";
        String result = instance.ConsultarTodosLosEquipos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarUnEquipo method, of class Equipo.
     */
    @Test
    public void testConsultarUnEquipo() {
        System.out.println("ConsultarUnEquipo");
        String nombre = "";
        Equipo instance = new Equipo();
        String expResult = "";
        String result = instance.ConsultarUnEquipo(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

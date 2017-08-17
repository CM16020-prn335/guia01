/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.sv.prn335.ingenieria.guia01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC15
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
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
     * Test of getResume method, of class Utilities.
     */
    @org.junit.Test
    public void testGetResume() {
        System.out.println("getResume");
        String texto = "";
        Utilities instance = new Utilities();
        String expResult = "";
        String result = instance.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capitalizar method, of class Utilities.
     */
    @org.junit.Test
    public void testCapitalizar() {
        System.out.println("capitalizar");
        String texto = "";
        Utilities instance = new Utilities();
        String expResult = "";
        String result = instance.capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

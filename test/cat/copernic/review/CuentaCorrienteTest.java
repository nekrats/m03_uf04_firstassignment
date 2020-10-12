/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pep
 */
public class CuentaCorrienteTest {
    
    private CuentaCorriente instance;
    
    public CuentaCorrienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }
    
    @Before
    public void setUp() {
        instance = new CuentaCorriente("Joan", 1000.0);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    

    /**
     * Test of ingresa method, of class CuentaCorriente.
     */
    @Test
    public void testIngresa() {
        instance.ingresa(175.0);
        assertEquals(1_175.0, instance.getSaldo(), 1.0E-3);
        
    }

    /**
     * Test of abona method, of class CuentaCorriente.
     */
    @Test
    public void testAbona() {
       instance.abona(275.50);
        assertEquals(724.50, instance.getSaldo(), 1.0E-3);
    }
    
}

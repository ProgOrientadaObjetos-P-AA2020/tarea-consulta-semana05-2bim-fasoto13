/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 59399
 */
public class OperacionesTest {

    public OperacionesTest() {
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
     * Test of Suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        double valorA = 20.0;
        double valorB = 10.0;
        Operaciones instance = new Operaciones();
        double expResult = 30.0;
        double result = instance.Suma(valorA, valorB);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        double valorA = 20.0;
        double valorB = 15.0;
        Operaciones instance = new Operaciones();
        double expResult = 5.0;
        double result = instance.Resta(valorA, valorB);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Multiplicacion method, of class Operaciones.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        double valorA = 4.0;
        double valorB = 2.0;
        Operaciones instance = new Operaciones();
        double expResult = 8.0;
        double result = instance.Multiplicacion(valorA, valorB);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Division method, of class Operaciones.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        double valorA = 9.0;
        double valorB = 3.0;
        Operaciones instance = new Operaciones();
        double expResult = 3.0;
        double result = instance.Division(valorA, valorB);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Residuo method, of class Operaciones.
     */
    @Test
    public void testResiduo() {
        System.out.println("Residuo");
        double valorA = 4.0;
        double valorB = 2.0;
        Operaciones instance = new Operaciones();
        double expResult = 0.0;
        double result = instance.Residuo(valorA, valorB);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

}

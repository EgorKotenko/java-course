/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw82;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S
 */
public class VectorTest {

    public VectorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of composition method, of class Vector.
     */
    @Test
    public void testComposition() {
        System.out.println("composition");
        Vector a = new Vector(1,3);
        Vector instance = new Vector(3,1);
        Vector expResult = new Vector(4, 4);
        Vector result = instance.composition(a);
        assertEquals(expResult.i - result.i, expResult.j - result.j);
    }

    /**
     * Test of subtraction method, of class Vector.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        Vector a = new Vector(1,3);
        Vector instance = new Vector(3,1);
        Vector expResult = new Vector(2, -2);
        Vector result = instance.subtraction(a);
        assertEquals(expResult.i - result.i, expResult.j - result.j);
    }

    /**
     * Test of scalarMiltiplication method, of class Vector.
     */
    @Test
    public void testScalarMiltiplication() {
        System.out.println("scalarMiltiplication");
        Vector a = new Vector(1,3);
        Vector instance = new Vector(3,1);
        double expResult = Math.pow(8, 0.5);
        double result = instance.scalarMiltiplication(a);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of isZero method, of class Vector.
     */
    @Test
    public void testIsZero() {
        System.out.println("isZero");
        Vector instance = new Vector();
        boolean expResult = true;
        boolean result = instance.isZero();
        assertEquals(expResult, result);
    }

    /**
     * Test of print method, of class Vector.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Vector instance = new Vector();
        instance.print();
    }

    /**
     * Test of length method, of class Vector.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector instance = new Vector(3, 4);
        double expResult = 5;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
    }

}
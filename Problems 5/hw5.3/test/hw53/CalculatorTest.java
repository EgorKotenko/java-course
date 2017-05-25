/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw53;

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
public class CalculatorTest {

    public CalculatorTest() {
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
     * Test of calculation method, of class Calculator.
     */
    @Test
    public void testCalculation() {
        System.out.println("calculation");
        Calculator instance = new Calculator();
        int expResult = 3;
        instance.string = "23+4*5/1-";
        int result = instance.calculation();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}